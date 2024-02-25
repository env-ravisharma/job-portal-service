package com.env.jobPortalService.recruiter.controller;

import com.env.jobPortalService.recruiter.domain.Recruiter;
import com.env.jobPortalService.recruiter.service.RecruiterService;
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
