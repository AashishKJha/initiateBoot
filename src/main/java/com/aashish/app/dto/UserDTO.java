package com.aashish.app.dto;

import com.aashish.app.Models.UserModel;

public class UserDTO {
    private String userName;
    private String userEmail;

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserModel dtoToModel(UserDTO dto) {
        UserModel userModel = new UserModel();
        userModel.setName(dto.getUserName());
        userModel.setEmail(dto.getUserEmail());

        return userModel;
    }
}
