package initiateBoot.app.users.repos;

import initiateBoot.app.auth.models.AuthModel;
import initiateBoot.app.common.repos.AppUserRepo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends AppUserRepo<AuthModel> {
    AuthModel findByUserId(Long userId);
}
