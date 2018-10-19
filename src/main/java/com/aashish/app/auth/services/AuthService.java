package com.aashish.app.auth.services;

import com.aashish.app.auth.models.AuthModel;
import com.aashish.app.auth.repos.AuthRepo;
import com.aashish.app.common.response.AuthResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private AuthRepo authRepo;


    public AuthModel signUp(AuthModel authModel) {
        return authRepo.save(authModel);
    }

    public AuthResponse login(AuthModel loginModel) {
        try {
            AuthModel auth = authRepo.findByUserEmail(loginModel.getUserEmail());
            System.out.println(auth.getUserPassword());
            if (auth.getUserPassword().equals(loginModel.getUserPassword())) {
                return AuthResponse.createSuccess(true, "Success");
            } else {
                System.out.println("Error");
                return AuthResponse.createFailure(false, "LogIn Falure", "Email Or Password In-correct");
            }
        } catch (Exception err) {
            return AuthResponse.createFailure(false, "Login Failed", err.toString());
        }

    }
}
