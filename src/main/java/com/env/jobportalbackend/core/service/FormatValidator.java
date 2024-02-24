package com.env.jobportalbackend.core.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormatValidator {

    public boolean isValidPhoneNo(String phone)
    {
        /** Validating using Regular Expression (Regex) **/
        Pattern phoneNoPattern = Pattern.compile("[89][0-9]{9}");
        Matcher matcher = phoneNoPattern.matcher(phone);
        return matcher.matches();
    }

}
