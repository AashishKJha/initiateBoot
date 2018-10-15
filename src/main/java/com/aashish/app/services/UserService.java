package com.aashish.app.services;

import com.aashish.app.Models.UserModel;
import com.aashish.app.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo usr;

    public void saveUser(UserModel add) {
        usr.save(add);
    }

    public Object getUser(Long id) {
        return usr.findById(id);
    }

    public void deleteUser(Long userId) {
        usr.deleteById(userId);
    }

    public List<UserModel> getAllUsers() {
        return usr.findAll();
    }

}
