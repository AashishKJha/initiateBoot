package initiateBoot.app.auth.repos;

import initiateBoot.app.auth.models.AuthModel;
import initiateBoot.app.common.repos.AppUserRepo;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepo extends AppUserRepo<AuthModel> {
    AuthModel findByUserEmail(String email);
}

