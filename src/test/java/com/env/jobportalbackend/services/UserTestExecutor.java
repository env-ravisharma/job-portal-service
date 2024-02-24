package com.env.jobportalbackend.services;

import com.env.jobportalbackend.user.controller.UserController;
import com.env.jobportalbackend.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserTestExecutor {

    @Autowired
    UserController userController;

    public void executeTests()
    {
        testRegisterUser();
    }

    private void testRegisterUser()
    {
        User user = new User();
        user.setName("Ravi Sharma");
        user.setPhone("8051697206");
        user.setEmail("ravisharma@xyz.com");
        userController.registerUser(user);
    }

}
