package com.aashish.app.users.services;

import com.aashish.app.common.helper.AppException;
import com.aashish.app.common.security.LoginUserData;
import com.aashish.app.common.services.CommonService;
import com.aashish.app.users.DTO.UserDTO;
import com.aashish.app.users.constants.UsersConstants;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class UserService extends CommonService {

    public UserService() {
    }

    public UserDTO getUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        System.out.println(authentication.getPrincipal());


        if (authentication == null || !authentication.isAuthenticated()) {
            throw AppException.createException(UsersConstants.UNAUTHORIZED_ERROR_CODE, "User Not Valid");
        }

        return (UserDTO) authentication.getPrincipal();

//        UserDTO userDTO = new UserDTO();
//        userDTO.setUserEmail(loginUserData.getUserEmail());
//        userDTO.setUserId(loginUserData.getUserId());
//        userDTO.setUserName(loginUserData.getUserName());
//        return  userDTO;
    }
}
