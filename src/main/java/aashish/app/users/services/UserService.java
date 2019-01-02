package aashish.app.users.services;

import aashish.app.auth.models.AuthModel;
import aashish.app.common.helper.AppException;
import aashish.app.common.helper.StoreLoginUser;
import aashish.app.common.security.LoginUserData;
import aashish.app.common.services.CommonService;
import aashish.app.users.DTO.UpdateUserDTO;
import aashish.app.users.DTO.UserDTO;
import aashish.app.users.constants.UsersConstants;
import aashish.app.users.helpers.UserHelper;
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

    @Autowired
    private UserHelper userHelper;

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
        StoreLoginUser loginUserData = new ObjectMapper().readValue(authentication.getPrincipal().toString(), StoreLoginUser.class);
        return userHelper.modelToDTO(userRepo.findByUserId(loginUserData.getUserId()));
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
        AuthModel authModel = userRepo.findByUserId(currentUser.getUserId());
        authModel.setUserId(currentUser.getUserId());
        authModel.setUserFirstName(updateUserDTO.getUserFirstName());
        authModel.setUserMiddleName(updateUserDTO.getUserMiddleName());
        authModel.setUserLastName(updateUserDTO.getUserLastName());
        return userHelper.modelToDTO(userRepo.save(authModel));
    }
}
