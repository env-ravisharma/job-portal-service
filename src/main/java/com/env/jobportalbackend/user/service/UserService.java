package com.env.jobportalbackend.user.service;

import com.env.jobportalbackend.core.service.FormatValidator;
import com.env.jobportalbackend.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    FormatValidator formatValidator;

    public User registerUser(User user)
    {
        validate(user);
        //TODO Code to register user
        return user;
    }

    private void validate(User user) {
        if(!formatValidator.isValidPhoneNo(user.getContactNo())) {
            throw new RuntimeException("Please enter correct phone number");
        }
        //TODO write code to validate user
    }

}
