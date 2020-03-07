package com.developer.job.springdevjob.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

@Entity(name = "employees")
/*@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)*/
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "emp_no")
    private int emp_no;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "hire_date")
    private Date hireDate;

/*    @Column(name = "job_title")
    private String [] jobTitle;*/

    @Column(name = "birth_date")
    private Date birthDate;

    private Character gender;

    public Employee() {
    }


    public Employee(int empInt, String firstName, String lastName, Date hireDate, Date birthDate, Character gender) {
       this.emp_no = empInt;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hireDate  = hireDate;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public int getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getEmp_no() == employee.getEmp_no() &&
                Objects.equals(getFirstName(), employee.getFirstName()) &&
                Objects.equals(getLastName(), employee.getLastName()) &&
                Objects.equals(getHireDate(), employee.getHireDate()) &&
                Objects.equals(getBirthDate(), employee.getBirthDate()) &&
                Objects.equals(getGender(), employee.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmp_no(), getFirstName(), getLastName(), getHireDate(), getBirthDate(), getGender());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_no=" + emp_no +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hireDate=" + hireDate +
                ", birthDate=" + birthDate +
                ", gender=" + gender +
                '}';
    }
}
