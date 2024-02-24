package com.env.jobportalbackend.applicant.controller;

import com.env.jobportalbackend.applicant.domain.Applicant;
import com.env.jobportalbackend.applicant.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ApplicantController {

    @Autowired
    ApplicantService applicantService;

    public Applicant registerApplicant(Applicant applicant)
    {
        applicantService.registerUser(applicant);
        return applicant;
    }

}
