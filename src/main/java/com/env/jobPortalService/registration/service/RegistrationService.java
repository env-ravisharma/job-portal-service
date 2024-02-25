package com.env.jobPortalService.registration.service;

import com.env.jobPortalService.registration.domain.Applicant;
import com.env.jobPortalService.core.service.FormatValidator;
import com.env.jobPortalService.registration.domain.Recruiter;
import org.springframework.beans.factory.annotation.Autowired;

public class RegistrationService {

    @Autowired
    FormatValidator formatValidator;

    public Applicant registerApplicant(Applicant applicant)
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

    public Recruiter addRecruiter(Recruiter recruiter)
    {
        validate(recruiter);
        return recruiter;
    }

    private void validate(Recruiter recruiter) {
        if(!formatValidator.isValidPhoneNo(recruiter.getContactNo())){
            throw new RuntimeException("Please enter correct contact number.");
        }if(!formatValidator.isValidEmailAddress(recruiter.getEmailAddress())){
            throw new RuntimeException("Please enter correct email address.");
        }
    }

}
