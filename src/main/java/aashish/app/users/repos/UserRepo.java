package aashish.app.users.repos;

import aashish.app.auth.models.AuthModel;
import aashish.app.common.repos.AppUserRepo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends AppUserRepo<AuthModel> {
    //AuthModel findByUserId(Long userId);
}
