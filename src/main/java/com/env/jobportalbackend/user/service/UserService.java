package com.env.jobportalbackend.user.service;

import com.env.jobportalbackend.user.model.User;

public class UserService {

    public User registerUser(User user)
    {
        validate(user);
        return user;
    }

    private void validate(User user) {
        //TODO validation need to add
    }

}
