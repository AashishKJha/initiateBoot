package com.aashish.app.auth.controllers;

import com.aashish.app.auth.DTO.AuthDTO;
import com.aashish.app.auth.DTO.LoginDTO;
import com.aashish.app.auth.helper.AuthHelper;
import com.aashish.app.auth.models.AuthModel;
import com.aashish.app.auth.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @Autowired
    private AuthHelper authHelper;

    @RequestMapping(value = "login", method = RequestMethod.POST)

    public ResponseEntity login(@Valid @RequestBody LoginDTO loginDTO) {
            AuthModel authModel = this.authHelper.copyToLoginModel(loginDTO);
            return new ResponseEntity<Object>(authService.login(authModel), HttpStatus.OK);
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseEntity<Object> register(@RequestBody AuthDTO authDTO) {

        AuthModel auth = this.authHelper.copyToAuthModel(authDTO);

        return new ResponseEntity<Object>(this.authService.signUp(auth), HttpStatus.OK);

    }
}
