package com.developer.job.springdevjob.dao;

import com.developer.job.springdevjob.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {


    List<Employee> findFirstByLastName(String lastname);

    List<Employee> getEmployeeByFirstNameNotNull();

    List<Employee> findTop10ByGender(char gender);

}
