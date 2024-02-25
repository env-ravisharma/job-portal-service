package com.env.jobPortalService;

import com.env.jobPortalService.registration.model.Applicant;
import com.env.jobPortalService.registration.service.RegistrationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.List;

@SpringBootApplication
public class JobPortalApplication {

	public static void main(String[] args)
	{
		ApplicationContext applicationContext = SpringApplication.run(JobPortalApplication.class, args);

		Applicant applicant = applicationContext.getBean(Applicant.class);
		applicant.setId("1");
		applicant.setName("Applicant1");
		applicant.setContactNumber("9076436888");
		applicant.setEmailAddress("abc@zyx.com");

		RegistrationService registrationService = applicationContext.getBean(RegistrationService.class);

		registrationService.registerApplicant(applicant);

		List<Applicant> applicants = registrationService.getApplicants();
		applicants.forEach(a -> System.out.println(a.toString()));
	}

}