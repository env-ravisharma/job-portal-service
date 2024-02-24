package com.env.jobportalbackend.services;

import com.env.jobportalbackend.applicant.controller.ApplicantController;
import com.env.jobportalbackend.applicant.domain.Applicant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApplicantTestExecutor {

    @Autowired
    ApplicantController applicantController;

    public void executeTests()
    {
        testRegisterApplicant();
    }

    private void testRegisterApplicant()
    {
        Applicant applicant = new Applicant();
        applicant.setName("Ravi Sharma");
        applicant.setContactNo("8051697206");
        applicant.setEmail("ravisharma@xyz.com");
        applicantController.registerApplicant(applicant);
    }

}
