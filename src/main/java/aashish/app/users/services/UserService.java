package aashish.app.users.services;

import aashish.app.auth.models.AuthModel;
import aashish.app.common.helper.AppException;
import aashish.app.common.services.CommonService;
import aashish.app.users.DTO.UpdateUserDTO;
import aashish.app.users.DTO.UserDTO;
import aashish.app.users.constants.UsersConstants;
import aashish.app.users.repos.UserRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class UserService extends CommonService {

    @Autowired
    public
    UserRepo userRepo;

//    @Autowired
//    public
//    AuthModel authModel;

    public UserService() {
    }

    public UserDTO getUser() throws IOException {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!authentication.isAuthenticated()) {
            throw AppException.createException(UsersConstants.UNAUTHORIZED_ERROR_CODE, "User Not Valid");
        }
        return new ObjectMapper().readValue(authentication.getPrincipal().toString(), UserDTO.class);
    }

    public UserDTO updateUser(UpdateUserDTO updateUserDTO) {
        return null;
//        authModel.setUserFirstName(updateUserDTO.getUserFirstName());
//        authModel.setUserMiddleName(updateUserDTO.getUserMiddleName());
//        authModel.setUserLastName(updateUserDTO.getUserLastName());
//        AuthModel updated = userRepo.save(authModel);
//        return new UserDTO(updated.getUserFirstName(), updated.getUserMiddleName(), updated.getUserLastName());
    }
}
