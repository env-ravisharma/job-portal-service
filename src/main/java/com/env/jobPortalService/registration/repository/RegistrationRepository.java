package com.env.jobPortalService.registration.repository;

import com.env.jobPortalService.registration.model.Applicant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.sql.ResultSet;
import java.util.List;

@Repository
public class RegistrationRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void insertApplicant(Applicant applicant)
    {
        String sql = "insert into applicant (id,name,email_address,contact_number) values(?,?,?,?)";
        jdbcTemplate.update(sql, applicant.getId(), applicant.getName(), applicant.getEmailAddress(), applicant.getContactNumber());
    }


    public List<Applicant> getApplicants() {
        String sql = "select * from applicant";
        return jdbcTemplate.query(sql, (ResultSet rs, int rowNum) -> {
            Applicant applicant = new Applicant();
            applicant.setId(rs.getString("id"));
            applicant.setName(rs.getString("name"));
            applicant.setEmailAddress(rs.getString("email_address"));
            applicant.setContactNumber(rs.getString("contact_number"));
            return applicant;
        });
    }
}
