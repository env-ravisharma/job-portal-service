package com.env.jobportalbackend.recruiter.service;

import com.env.jobportalbackend.core.service.FormatValidator;
import com.env.jobportalbackend.recruiter.domain.Recruiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecruiterService {

    @Autowired
    FormatValidator formatValidator;

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
