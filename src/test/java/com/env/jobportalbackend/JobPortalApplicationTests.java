package com.env.jobportalbackend;

import com.env.jobportalbackend.services.UserTestExecutor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JobPortalApplicationTests {

	@Autowired
	UserTestExecutor userTestExecutor;

	@Test
	void contextLoads() {
		userTestExecutor.executeTests();
	}

}
