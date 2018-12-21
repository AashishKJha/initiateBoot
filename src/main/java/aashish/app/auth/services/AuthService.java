package aashish.app.auth.services;

import aashish.app.auth.models.AuthModel;
import aashish.app.auth.repos.AuthRepo;
import aashish.app.auth.helper.AuthResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AuthService {

    @Autowired
    private AuthRepo authRepo;

    public AuthModel signUp(AuthModel authModel) {
            return authRepo.save(authModel);
    }

    public AuthResponse getProfile(String userEmail) {
        AuthModel auth = authRepo.findByUserEmail(userEmail);
        if (auth == null) {
            return AuthResponse.createFailure(false, "User Not Found");
        }
        return AuthResponse.createSuccess(true, auth);
    }
    public AuthResponse getCurrentUser() {
        return null;
    }
}
