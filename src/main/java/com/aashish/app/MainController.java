package com.aashish.app;

import com.aashish.app.dto.UserDTO;
import com.aashish.app.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/users")
    public ResponseEntity<Object> getUsers() {
        return new ResponseEntity<Object>(userService.getAllUsers(), HttpStatus.OK);
    }

    @PostMapping(value = "/addusers")
    public ResponseEntity<Object> addUsers(@RequestBody UserDTO add) {
        System.out.println(add.getUserName());
        userService.saveUser(add.dtoToModel(add));
        return new ResponseEntity<Object>(userService.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping(value = "user")
    public Object getUser(@RequestParam(value = "id") Long id) {
        return userService.getUser(id);
    }

    @DeleteMapping(value = "delete_user/{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable Long id) {
        System.out.println(id);
        userService.deleteUser(id);
        return new ResponseEntity<Object>(userService.getAllUsers(), HttpStatus.OK);
    }

}