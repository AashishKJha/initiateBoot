package com.aashish.app;

import com.aashish.app.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    private UserRepo userRepo;

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public ResponseEntity<Object> registerUser(@RequestBody User authModel) {
        User myAuth = new User();
        return new ResponseEntity<>(myAuth, HttpStatus.OK);
    }

    @GetMapping(value = "/users")
    public ResponseEntity<Object> getUsers() {
        return new ResponseEntity<Object>(userRepo.findAll(), HttpStatus.OK);
    }

}