package com.env.jobportalbackend.user.controller;

import com.env.jobportalbackend.user.model.User;
import com.env.jobportalbackend.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    public User registerUser(User user)
    {
        userService.registerUser(user);
        return user;
    }

}
