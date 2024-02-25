package com.env.jobPortalService.services;

import com.env.jobPortalService.registration.controller.RegistrationController;
import com.env.jobPortalService.registration.domain.Applicant;
import com.env.jobPortalService.registration.domain.Recruiter;
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
        recruiter.setContactNo("8123456789");
        recruiter.setEmailAddress("ravisharma@xyzcompany.com");
        existingRecruiter = registrationController.registerRecruiter(recruiter);

        //TODO need write code to fetch existingRecruiter from h2 database
        assert recruiter.getName().equals(existingRecruiter.getName());
        assert recruiter.getContactNo().equals(existingRecruiter.getContactNo());
        assert recruiter.getEmailAddress().equals(existingRecruiter.getEmailAddress());

    }

    private void testRegisterApplicant()
    {
        Applicant applicant = new Applicant();
        applicant.setName("Ravi Sharma");
        applicant.setContactNo("8051697206");
        applicant.setEmailAddress("ravisharma@xyz.com");
        registrationController.registerApplicant(applicant);
    }

}
