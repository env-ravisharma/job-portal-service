package com.env.jobPortalService;

import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JobPortalApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(JobPortalApplication.class, args);

		Tomcat tomcat = new Tomcat();

		Context context = tomcat.addContext("", null);
		Tomcat.addServlet(context, "HelloServlet", new HelloServlet());
		context.addServletMappingDecoded("/hello", "HelloServlet");

		tomcat.start();
		tomcat.getServer().await();
	}

}