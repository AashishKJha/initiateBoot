package com.aashish.app.auth.repos;

import com.aashish.app.auth.models.AuthModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface AuthRepo extends JpaRepository<AuthModel, Long> {
    AuthModel findByUserEmail(String email);
}

