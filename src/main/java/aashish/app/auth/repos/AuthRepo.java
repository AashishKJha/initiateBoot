package aashish.app.auth.repos;

import aashish.app.auth.models.AuthModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepo extends JpaRepository<AuthModel, Long> {
    AuthModel findByUserEmail(String email);
}

