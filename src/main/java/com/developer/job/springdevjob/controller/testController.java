package com.developer.job.springdevjob.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/home")
public class testController {

    @GetMapping(value = "/main",produces = "application/json")
    @ResponseBody
    public String accessELBhome() {
        return "Able to access Elastic Beanstalk Home, Reload works again";
    }
}
