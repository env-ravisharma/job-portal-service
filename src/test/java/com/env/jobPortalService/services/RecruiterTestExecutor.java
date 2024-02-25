package com.env.jobPortalService.services;

import com.env.jobPortalService.recruiter.controller.RecruiterController;
import com.env.jobPortalService.recruiter.domain.Recruiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecruiterTestExecutor {

    @Autowired
    RecruiterController recruiterController;

    public void executeTests()
    {
        testRegisterRecruiter();
    }

    private void testRegisterRecruiter()
    {
        Recruiter recruiter;
        Recruiter existingRecruiter;

        recruiter = new Recruiter();
        recruiter.setName("XYZ Company");
        recruiter.setContactNo("8123456789");
        recruiter.setEmailAddress("ravisharma@xyzcompany.com");
        existingRecruiter = recruiterController.registerRecruiter(recruiter);

        //TODO need write code to fetch existingRecruiter from h2 database
        assert recruiter.getName().equals(existingRecruiter.getName());
        assert recruiter.getContactNo().equals(existingRecruiter.getContactNo());
        assert recruiter.getEmailAddress().equals(existingRecruiter.getEmailAddress());

    }



}
