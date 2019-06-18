package initiateBoot.app.auth.controllers;

import initiateBoot.app.auth.DTO.AuthDTO;
import initiateBoot.app.auth.helper.AuthHelper;
import initiateBoot.app.auth.models.AuthModel;
import initiateBoot.app.auth.services.AuthService;
import initiateBoot.app.common.controllers.CommonController;
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

    @RequestMapping(value = "/forgot-password/{email}", method = RequestMethod.GET)
    public void forgotPassword(@PathVariable("email") String userEmail) {
        authService.forgetPassword(userEmail, "Forget Password!");
    }
}
