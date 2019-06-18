package initiateBoot.app.users.helpers;

import initiateBoot.app.auth.models.AuthModel;
import initiateBoot.app.users.DTO.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class UserHelper {

    public AuthModel dtoToModel(UserDTO userDTO) {
        AuthModel authModel = new AuthModel();
        authModel.setUserId(userDTO.getUserId());
        authModel.setUserFirstName(userDTO.getUserFirstName());
        authModel.setUserMiddleName(userDTO.getUserMiddleName());
        authModel.setUserLastName(userDTO.getUserLastName());
        return authModel;
    }

    public UserDTO modelToDTO(AuthModel authModel) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserFirstName(authModel.getUserFirstName());
        userDTO.setUserMiddleName(authModel.getUserMiddleName());
        userDTO.setUserLastName(authModel.getUserLastName());
        userDTO.setUserEmail(authModel.getUserEmail());
        userDTO.setUserMobNumber(authModel.getUserMobileNumber());
        userDTO.setUserId(authModel.getUserId());
        userDTO.setUserDOB(authModel.getUserDOB());
        return userDTO;
    }

}
