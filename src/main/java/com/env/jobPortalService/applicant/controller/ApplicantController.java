package com.env.jobPortalService.applicant.controller;

import com.env.jobPortalService.applicant.domain.Applicant;
import com.env.jobPortalService.applicant.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ApplicantController {

    @Autowired
    ApplicantService applicantService;

    public Applicant registerApplicant(Applicant applicant)
    {
        return applicantService.registerUser(applicant);
    }

}
