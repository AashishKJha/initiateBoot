package initiateBoot.app.common.security;

import initiateBoot.app.auth.models.AuthModel;
import initiateBoot.app.auth.repos.AuthRepo;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import static java.util.Collections.emptyList;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private AuthRepo applicationUserRepository;

    public UserDetailsServiceImpl(AuthRepo applicationUserRepository) {
        this.applicationUserRepository = applicationUserRepository;
    }

    /**
     * Method is used to load user by user email.
     *
     * @param userEmail - user email
     * @return
     * @throws UsernameNotFoundException - exception
     */
    @Override
    public LoginUserData loadUserByUsername(String userEmail) throws UsernameNotFoundException {
        AuthModel applicationUser = applicationUserRepository.findByUserEmail(userEmail);
        if (applicationUser == null) {
            throw new UsernameNotFoundException(SecurityConstants.USER_DOES_NOT_EXITS);
        }
        return new LoginUserData(applicationUser, applicationUser.getUserEmail(), applicationUser.getUserPassword(), emptyList());
    }
}

