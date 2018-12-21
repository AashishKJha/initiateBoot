package aashish.app.auth.repos;

import aashish.app.auth.models.AuthModel;
import aashish.app.common.repos.AppUserRepo;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepo extends AppUserRepo<AuthModel> {
    AuthModel findByUserEmail(String email);
}

