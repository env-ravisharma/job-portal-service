package com.env.jobPortalService.applicant.service;

import com.env.jobPortalService.core.service.FormatValidator;
import com.env.jobPortalService.applicant.domain.Applicant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicantService {

    @Autowired
    FormatValidator formatValidator;

    public Applicant registerUser(Applicant applicant)
    {
        validate(applicant);
        //TODO Code to register user
        return applicant;
    }

    private void validate(Applicant applicant) {
        if(!formatValidator.isValidPhoneNo(applicant.getContactNo())) {
            throw new RuntimeException("Please enter correct phone number");
        }
        if(!formatValidator.isValidEmailAddress(applicant.getEmailAddress())) {
            throw new RuntimeException("Please enter correct email address");
        }
        //TODO write code to validate user
    }

}
