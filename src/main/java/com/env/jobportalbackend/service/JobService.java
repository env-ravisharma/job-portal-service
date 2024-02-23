package com.env.jobportalbackend.service;

import com.env.jobportalbackend.model.Job;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    public List<Job> getAllJobs()
    {
        List<Job> jobs = List.of(new Job("1", "Software Engineer", "Should have good knowledge of java 8 feature."));
        return jobs;
    }

}
