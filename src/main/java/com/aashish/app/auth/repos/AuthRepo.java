package com.aashish.app.auth.repos;

import com.aashish.app.auth.models.AuthModel;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthRepo extends JpaRepository<AuthModel, Long> {
    AuthModel findByUserEmail(String email);
}

