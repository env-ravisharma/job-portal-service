package com.env.jobPortalService.registration.controller;

import com.env.jobPortalService.registration.domain.Applicant;
import com.env.jobPortalService.registration.domain.Recruiter;
import com.env.jobPortalService.registration.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;

public class RegistrationController {

    @Autowired
    RegistrationService registrationService;

    public Recruiter registerRecruiter(Recruiter recruiter)
    {
        return registrationService.addRecruiter(recruiter);
    }

    public Applicant registerApplicant(Applicant applicant)
    {
        return registrationService.registerApplicant(applicant);
    }

}
