package com.env.jobPortalService.registration.service;

import com.env.jobPortalService.registration.model.Applicant;
import com.env.jobPortalService.core.service.FormatValidator;
import com.env.jobPortalService.registration.model.Recruiter;
import com.env.jobPortalService.registration.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RegistrationService {

    @Autowired
    FormatValidator formatValidator;

    @Autowired
    RegistrationRepository registrationRepository;

    public Recruiter addRecruiter(Recruiter recruiter)
    {
        validate(recruiter);
        return recruiter;
    }

    private void validate(Recruiter recruiter) {
        if(!formatValidator.isValidPhoneNo(recruiter.getContactNumber())){
            throw new RuntimeException("Please enter correct contact number.");
        }if(!formatValidator.isValidEmailAddress(recruiter.getEmailAddress())){
            throw new RuntimeException("Please enter correct email address.");
        }
    }

    public Applicant registerApplicant(Applicant applicant)
    {
        validate(applicant);
        //TODO Code to register user
        registrationRepository.insertApplicant(applicant);
        return applicant;
    }

    private void validate(Applicant applicant) {
        if(!formatValidator.isValidPhoneNo(applicant.getContactNumber())) {
            throw new RuntimeException("Please enter correct phone number");
        }
        if(!formatValidator.isValidEmailAddress(applicant.getEmailAddress())) {
            throw new RuntimeException("Please enter correct email address");
        }
        //TODO write code to validate user
    }

    public List<Applicant> getApplicants() {
        return registrationRepository.getApplicants();
    }
}
