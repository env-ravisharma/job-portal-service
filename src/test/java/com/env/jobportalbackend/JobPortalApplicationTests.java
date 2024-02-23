package com.env.jobportalbackend;

import com.env.jobportalbackend.model.Job;
import com.env.jobportalbackend.service.JobService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@SpringBootTest
class JobPortalApplicationTests {

	@Autowired
	JobService jobService;

	@Test
	void contextLoads() {
		List<Job> jobs = jobService.getAllJobs();
		jobs.forEach(job -> System.out.println(job.getTitle()));
	}

}
