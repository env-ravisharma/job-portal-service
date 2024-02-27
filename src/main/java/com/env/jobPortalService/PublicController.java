package com.env.jobPortalService;

import com.env.jobPortalService.registration.model.Applicant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublicController {

    @RequestMapping("/")
    public String homePage(){
        return "index";
    }

    @RequestMapping("addAlien")
    public String addAlien(Applicant applicant){
        return "result";
    }

}
