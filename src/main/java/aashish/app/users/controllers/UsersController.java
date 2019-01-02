package aashish.app.users.controllers;


import aashish.app.common.controllers.CommonController;
import aashish.app.users.DTO.UpdateUserDTO;
import aashish.app.users.constants.UsersConstants;
import aashish.app.users.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.io.IOException;

@RestController
@RequestMapping(value = "/api/users")
public class UsersController extends CommonController {

    @Autowired
    UserService userService;

    private UsersController() {
    }

    @RequestMapping(value = "/profile", method = RequestMethod.GET, produces = UsersConstants.APPLICATION_JSON)
    public ResponseEntity<Object> profile() throws IOException {
        return new ResponseEntity<>(userService.getUser(), HttpStatus.OK);
    }

    @RequestMapping(value = "/profile", method = RequestMethod.POST, produces = UsersConstants.APPLICATION_JSON)
    public ResponseEntity<Object> updateProfile(@Valid @RequestBody UpdateUserDTO updateUserDTO) throws IOException {
        return new ResponseEntity<>(userService.updateUser(updateUserDTO), HttpStatus.OK);
    }
}
