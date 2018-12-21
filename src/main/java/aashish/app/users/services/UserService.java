package aashish.app.users.services;

import aashish.app.auth.models.AuthModel;
import aashish.app.common.helper.AppException;
import aashish.app.common.security.LoginUserData;
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
    private
    UserRepo userRepo;

    private AuthModel authModel;

    public UserService() {
    }

    /**
     * Method is used to get current user details.
     *
     * @return - returns UserDTO
     * @throws IOException - throws IOException
     */
    public UserDTO getUser() throws IOException {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!authentication.isAuthenticated()) {
            throw AppException.createException(UsersConstants.UNAUTHORIZED_ERROR_CODE, "User Not Valid");
        }
        return new ObjectMapper().readValue(authentication.getPrincipal().toString(), UserDTO.class);
    }

    /**
     * Method is used to update used information.
     *
     * @param updateUserDTO - pass UpdateUserDTO
     * @return - return UserDTO
     */
    public UserDTO updateUser(UpdateUserDTO updateUserDTO) throws IOException {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!authentication.isAuthenticated()) {
            throw AppException.createException(UsersConstants.UNAUTHORIZED_ERROR_CODE, "User Not Valid");
        }

        UserDTO currentUser = this.getUser();
        authModel = new AuthModel();
        authModel = userRepo.findByUserId(currentUser.getUserId());
        authModel.setUserId(currentUser.getUserId());
        authModel.setUserFirstName(updateUserDTO.getUserFirstName());
        authModel.setUserMiddleName(updateUserDTO.getUserMiddleName());
        authModel.setUserLastName(updateUserDTO.getUserLastName());
        AuthModel updated = userRepo.save(authModel);
        return new UserDTO(updated.getUserFirstName(), updated.getUserMiddleName(), updated.getUserLastName());
    }
}
