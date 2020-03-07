package com.developer.job.springdevjob;

import com.developer.job.springdevjob.controller.testController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
public class SpringdevjobApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringdevjobApplication.class, args);
    }

}
