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
        if(!formatValidator.isValidPhoneNo(recruiter.getPhoneNo())){
            throw new RuntimeException("Please enter correct phone number");
        }
    }

}
