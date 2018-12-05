package com.aashish.app.auth.services;

import com.aashish.app.auth.constants.AuthConstants;
import com.aashish.app.auth.models.AuthModel;
import com.aashish.app.auth.repos.AuthRepo;
import com.aashish.app.common.helper.AppException;
import com.aashish.app.auth.helper.AuthResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;


@Service
public class AuthService {
    @Autowired
    private AuthRepo authRepo;

    public AuthModel signUp(AuthModel authModel) {
            return authRepo.save(authModel);
    }

    public AuthResponse login(AuthModel loginModel) {
        AuthModel auth = authRepo.findByUserEmail(loginModel.getUserEmail());
        if (auth == null) {
            throw AppException.createException(AuthConstants.INVALID_EMAIL);
        } else {
            if (auth.getUserPassword().equals(loginModel.getUserPassword())) {

                Map<String, Object> authRe = new HashMap<>();
                authRe.put(AuthConstants.ACCESS_TOKEN, String.valueOf(Math.random()));
                authRe.put(AuthConstants.EXP_TIME, String.valueOf(AuthConstants.expTime));
                authRe.put(AuthConstants.EXP_UNIT, "min");

                return AuthResponse.createSuccess(true, authRe);

            } else {

                return AuthResponse.createFailure(false, AuthConstants.INVALID_PASSWORD);

            }
        }
    }

    public AuthResponse getProfile(String userEmail) {
        AuthModel auth = authRepo.findByUserEmail(userEmail);
        if (auth == null) {
            return AuthResponse.createFailure(false, "User Not Found");
        }
        return AuthResponse.createSuccess(true, auth);
    }

}
