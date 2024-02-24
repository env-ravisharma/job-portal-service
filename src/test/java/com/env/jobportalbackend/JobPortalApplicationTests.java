package com.env.jobportalbackend;

import com.env.jobportalbackend.services.ApplicantTestExecutor;
import com.env.jobportalbackend.services.RecruiterTestExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;

@SpringBootTest
class JobPortalApplicationTests {

	@Autowired
	RecruiterTestExecutor recruiterTestExecutor;

	@Autowired
	ApplicantTestExecutor applicantTestExecutor;

	@Test
	void contextLoads() {
		recruiterTestExecutor.executeTests();
		applicantTestExecutor.executeTests();
	}

}
