package com.env.jobPortalService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublicController {

    @RequestMapping("/")
    public String homePage(){
        return "index";
    }

}
