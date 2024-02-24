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
        Recruiter recruiter = new Recruiter();
        recruiter.setCompanyName("XYZ Company");
        recruiter.setOfficialEmail("ravisharma@xyzcompany.com");
        recruiter.setPhoneNo("8123456789");
        recruiterController.registerRecruiter(recruiter);
    }



}
