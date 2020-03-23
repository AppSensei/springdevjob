package com.developer.job.springdevjob.controller;

import com.developer.job.springdevjob.model.Employee;
import com.developer.job.springdevjob.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/all/{male}")
    public List<Employee> getAllEmployees(@PathVariable("male") Character gender) {
        return employeeService.getAllEmployeesGenderOf(gender);
    }

    @GetMapping("/all/{firstName}")
    public List<Employee> getAllEmployee(@PathVariable("firstName") String firstName) {
        return employeeService.getAllEmployee(firstName);
    }
}
