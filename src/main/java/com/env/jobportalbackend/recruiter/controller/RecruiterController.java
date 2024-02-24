package com.env.jobportalbackend.recruiter.controller;

import com.env.jobportalbackend.recruiter.domain.Recruiter;
import com.env.jobportalbackend.recruiter.service.RecruiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RecruiterController {

    @Autowired
    RecruiterService recruiterService;

    public Recruiter registerRecruiter(Recruiter recruiter)
    {
        return recruiterService.addRecruiter(recruiter);
    }

}
