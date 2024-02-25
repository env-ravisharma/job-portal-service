package com.env.jobPortalService.services;

import com.env.jobPortalService.registration.controller.RegistrationController;
import com.env.jobPortalService.registration.model.Applicant;
import com.env.jobPortalService.registration.model.Recruiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegistrationTestExecutor {

    @Autowired
    RegistrationController registrationController;

    public void executeTests()
    {
        testRegisterRecruiter();
        testRegisterApplicant();
    }

    private void testRegisterRecruiter()
    {
        Recruiter recruiter;
        Recruiter existingRecruiter;

        recruiter = new Recruiter();
        recruiter.setName("XYZ Company");
        recruiter.setContactNumber("8123456789");
        recruiter.setEmailAddress("ravisharma@xyzcompany.com");
        existingRecruiter = registrationController.registerRecruiter(recruiter);

        //TODO need write code to fetch existingRecruiter from h2 database
        assert recruiter.getName().equals(existingRecruiter.getName());
        assert recruiter.getContactNumber().equals(existingRecruiter.getContactNumber());
        assert recruiter.getEmailAddress().equals(existingRecruiter.getEmailAddress());

    }

    private void testRegisterApplicant()
    {
        Applicant applicant = new Applicant();
        applicant.setName("Ravi Sharma");
        applicant.setContactNumber("8051697206");
        applicant.setEmailAddress("ravisharma@xyz.com");
        registrationController.registerApplicant(applicant);
    }

}
