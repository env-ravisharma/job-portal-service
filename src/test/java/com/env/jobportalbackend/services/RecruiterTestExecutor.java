package com.env.jobportalbackend.services;

import com.env.jobportalbackend.recruiter.controller.RecruiterController;
import com.env.jobportalbackend.recruiter.domain.Recruiter;
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
        recruiter.setCompanyName("XYZ Company");
        recruiter.setContactNumber("8123456789");
        recruiter.setOfficialEmail("ravisharma@xyzcompany.com");
        existingRecruiter = recruiterController.registerRecruiter(recruiter);

        //TODO need write code to fetch existingRecruiter from h2 database
        assert recruiter.getCompanyName().equals(existingRecruiter.getCompanyName());
        assert recruiter.getContactNumber().equals(existingRecruiter.getContactNumber());
        assert recruiter.getOfficialEmail().equals(existingRecruiter.getOfficialEmail());

    }



}
