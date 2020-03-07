package com.developer.job.springdevjob.controller;

import com.developer.job.springdevjob.model.Employee;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.*;

@RestController
@RequestMapping("/form")
public class formController {

    @GetMapping("/getAllEmps")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employeeList =  new ArrayList<>();

        Date d = new Date();
        d.getDate();

         employeeList = Arrays.asList(
                new Employee(1, "Yajob", "Mohammed", d, d, 'M'),
                new Employee(2, "John", "Jason", new Date(), new Date(), 'M'),
                new Employee(3, "Mark", "O'Brien", new Date(), new Date(), 'F')
        );

        HttpHeaders headers = new HttpHeaders();
        headers.setAccessControlMaxAge(20600);
        headers.setAcceptLanguageAsLocales(Arrays.asList(Locale.CANADA, Locale.GERMANY));
        headers.setContentType(MediaType.APPLICATION_JSON);

        return new ResponseEntity<>(employeeList, headers, HttpStatus.ACCEPTED);
        //return  ResponseEntity.ok(employeeList);
    }
}
