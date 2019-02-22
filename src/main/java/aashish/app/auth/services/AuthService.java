package aashish.app.auth.services;

import aashish.app.auth.constants.AuthConstants;
import aashish.app.auth.models.AuthModel;
import aashish.app.auth.repos.AuthRepo;
import aashish.app.auth.helper.AuthResponse;
import aashish.app.common.helper.AppException;
import aashish.app.common.helper.email.EmailServiceImpl;
import aashish.app.common.services.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AuthService extends CommonService {

    @Autowired
    private AuthRepo authRepo;

    @Autowired
    private EmailServiceImpl emailService;

    public AuthModel signUp(AuthModel authModel) {
            return authRepo.save(authModel);
    }

    public AuthResponse getProfile(String userEmail) {
        AuthModel auth = authRepo.findByUserEmail(userEmail);
        if (auth == null) {
            return AuthResponse.createFailure(false, AuthConstants.USER_NOT_FOUND);
        }
        return AuthResponse.createSuccess(true, auth);
    }

    private AuthModel getCurrentUser(String userEmail) {
        AuthModel authModel = authRepo.findByUserEmail(userEmail);
        if (authModel == null) {
            throw AppException.createException(AuthConstants.UNAUTHORIZED_ERROR_CODE, AuthConstants.USER_NOT_FOUND);
        }
        return authRepo.findByUserEmail(userEmail);
    }


    public void forgetPassword(String targetEmail, String subject) {
        String body = "You got a request for forget password. your OTP is : 123456789";
        emailService.sendSimpleMessage(AuthConstants.fromEmail, getCurrentUser(targetEmail).getUserEmail(), subject, body);
    }
}
