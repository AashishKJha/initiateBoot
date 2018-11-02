package com.aashish.app.auth.services;

import com.aashish.app.auth.models.AuthModel;
import com.aashish.app.auth.repos.AuthRepo;
import com.aashish.app.common.helper.AppException;
import com.aashish.app.auth.helper.AuthResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

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
            throw AppException.createException("Incorrect Email Please Correct email");
        } else {
            if (auth.getUserPassword().equals(loginModel.getUserPassword())) {
                return AuthResponse.createSuccess(true, "Success");
            } else {
                return AuthResponse.createFailure(false, "Incorrect Password");
            }
        }

    }
}
