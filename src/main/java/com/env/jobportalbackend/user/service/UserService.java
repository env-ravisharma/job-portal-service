package com.env.jobportalbackend.user.service;

import com.env.jobportalbackend.user.model.User;
import org.springframework.stereotype.Service;
import java.util.regex.Pattern;

@Service
public class UserService {

    public User registerUser(User user)
    {
        validate(user);
        //TODO Code to register user
        return user;
    }

    private void validate(User user) {
        /** Validating phoneNo using Regular Expression (Regex) **/
        if(!Pattern.compile("[89][0-9]{9}").matcher(user.getPhone()).matches()) {
            throw new RuntimeException("Please enter correct phone number");
        }
        //TODO write code to validate user
    }

}
