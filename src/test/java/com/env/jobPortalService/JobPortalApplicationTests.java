package com.env.jobPortalService;

import com.env.jobPortalService.services.RegistrationTestExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;

@SpringBootTest
class JobPortalApplicationTests {

	@Autowired
    RegistrationTestExecutor registrationTestExecutor;

	@Test
	void contextLoads() {
		registrationTestExecutor.executeTests();
	}

}
