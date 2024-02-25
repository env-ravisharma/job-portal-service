package com.env.jobPortalService.registration.repository;

import com.env.jobPortalService.registration.model.Applicant;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RegistrationRepository {

    JdbcTemplate jdbcTemplate;

    public void insertApplicant(Applicant applicant)
    {
        String sql = "insert into applicant (id,name,email_address,contact_no) values(?,?,?,?)";
        jdbcTemplate.update(sql, applicant.getId(), applicant.getName(), applicant.getEmailAddress(), applicant.getContactNo());
    }
}
