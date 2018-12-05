package com.aashish.app.auth.controllers;

import com.aashish.app.auth.DTO.AuthDTO;
import com.aashish.app.auth.helper.AuthHelper;
import com.aashish.app.auth.models.AuthModel;
import com.aashish.app.auth.services.AuthService;
import com.aashish.app.common.controllers.CommonController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api/auth")
public class AuthController extends CommonController {

    @Autowired
    private AuthService authService;

    @Autowired
    private AuthHelper authHelper;

    private BCryptPasswordEncoder bCryptPasswordEncoder;


    AuthController(BCryptPasswordEncoder bps) {

        this.bCryptPasswordEncoder = bps;

    }

//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public ResponseEntity login(@Valid @RequestBody LoginDTO loginDTO) {
//            AuthModel authModel = this.authHelper.copyToLoginModel(loginDTO);
//            return new ResponseEntity<Object>(authService.login(authModel), HttpStatus.OK);
//    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseEntity<Object> register(@Valid @RequestBody AuthDTO authDTO) {
        AuthModel auth = this.authHelper.copyToAuthModel(authDTO);
        auth.setUserPassword(bCryptPasswordEncoder.encode(authDTO.getUserPassword()));
        return new ResponseEntity<Object>(this.authService.signUp(auth), HttpStatus.OK);
    }

    @RequestMapping(value = "/profile/{email}", method = RequestMethod.GET)
    public ResponseEntity<Object> userProfile(@PathVariable("email") String userEmail) {
        return new ResponseEntity<Object>(authService.getProfile(userEmail), HttpStatus.OK);
    }
}
