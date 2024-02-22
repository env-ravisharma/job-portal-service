package com.env.jobportalbackend;

import com.env.jobportalbackend.core.persistence.BaseRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JobPortalApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(JobPortalApplication.class, args);

		BaseRepository baseRepository = new BaseRepository();
		baseRepository.insertStudent(1,"ravi", 100);

	}

}
