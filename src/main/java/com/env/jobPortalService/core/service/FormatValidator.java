package com.env.jobPortalService.core.service;

import org.springframework.stereotype.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class FormatValidator {

    public boolean isValidPhoneNo(String phone)
    {
        Pattern validPhoneNoPattern = Pattern.compile("[89][0-9]{9}");
        Matcher matcher = validPhoneNoPattern.matcher(phone);
        return matcher.matches();
    }

    public boolean isValidEmailAddress(String email)
    {
        Pattern validEmailPattern = Pattern.compile("[a-z A-Z 0-9 /-/.]+[@][a-z]+[/.][a-z]{2,3}");
        Matcher matcher = validEmailPattern.matcher(email);
        return matcher.matches();
    }

}
