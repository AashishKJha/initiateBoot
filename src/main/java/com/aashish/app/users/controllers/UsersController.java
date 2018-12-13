package com.aashish.app.users.controllers;


import com.aashish.app.common.controllers.CommonController;
import com.aashish.app.users.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/users")
public class UsersController extends CommonController {

    @Autowired
    UserService userService;

    private UsersController() {
    }

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public ResponseEntity<Object> profile() {
        return new ResponseEntity<Object>(userService.getUser(), HttpStatus.OK);
    }
}
