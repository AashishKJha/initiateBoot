package com.aashish.app.auth.helper;

import com.aashish.app.auth.DTO.AuthDTO;
import com.aashish.app.auth.DTO.LoginDTO;
import com.aashish.app.auth.models.AuthModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthHelper {
    public AuthModel copyToAuthModel(AuthDTO authDTO) {
        AuthModel authModel = new AuthModel();
        authModel.setUserName(authDTO.getUserName());
        authModel.setUserEmail(authDTO.getUserEmail());
        authModel.setUserPassword(authDTO.getUserPassword());
        authModel.setUserMobileNumber(authDTO.getUserMobNumber());
        authModel.setUserDOB(authDTO.getUserDOB());
        return authModel;
    }

    public AuthModel copyToLoginModel(LoginDTO loginDTO) {
        AuthModel authModel = new AuthModel();
        authModel.setUserEmail(loginDTO.getUserEmail());
        authModel.setUserPassword(loginDTO.getUserPassword());
        return authModel;
    }

}
