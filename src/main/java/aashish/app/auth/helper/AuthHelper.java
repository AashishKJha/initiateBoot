package aashish.app.auth.helper;

import aashish.app.auth.DTO.AuthDTO;
import aashish.app.auth.models.AuthModel;
import org.springframework.stereotype.Component;

@Component
public class AuthHelper {
    public AuthModel copyToAuthModel(AuthDTO authDTO) {
        AuthModel authModel = new AuthModel();
        authModel.setUserFirstName(authDTO.getUserFirstName());
        authModel.setUserMiddleName(authDTO.getUserMiddleName());
        authModel.setUserLastName(authDTO.getUserLastName());
        authModel.setUserEmail(authDTO.getUserEmail());
        authModel.setUserPassword(authDTO.getUserPassword());
        authModel.setUserMobileNumber(authDTO.getUserMobNumber());
        authModel.setUserDOB(authDTO.getUserDOB());
        return authModel;
    }
}
