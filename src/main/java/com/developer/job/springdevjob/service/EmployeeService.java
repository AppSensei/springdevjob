package com.developer.job.springdevjob.service;

import com.developer.job.springdevjob.dao.EmployeeDao;
import com.developer.job.springdevjob.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.addAll(employeeDao.getEmployeeByFirstNameNotNull());
        return employees;
    }

/*    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        employeeDao.findFirstByLastName("John").forEach(employees::add);
        return employees;
    }*/


    public List<Employee> getAllEmployeesGenderOf(Character gender) {
        List<Employee> employees = new ArrayList<>();
        employeeDao.findTop10ByGender(gender).forEach(employees::add);
        return employees;
    }



}
