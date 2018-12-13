package com.aashish.app.users.services;

import com.aashish.app.common.helper.AppException;
import com.aashish.app.common.services.CommonService;
import com.aashish.app.users.constants.UsersConstants;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class UserService extends CommonService {
    public UserService() {
    }

    public Object getUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication == null || !authentication.isAuthenticated()) {
            throw AppException.createException(UsersConstants.UNAUTHORIZED_ERROR_CODE, "User Not Valid");
        }

        return authentication.getPrincipal();
    }
}
