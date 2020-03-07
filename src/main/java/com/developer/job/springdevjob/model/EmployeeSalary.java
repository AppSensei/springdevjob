package com.developer.job.springdevjob.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/*
@Entity(name = "salaries")
*/
public class EmployeeSalary {

    private int id;
    private int empno;
    private double salary;
    private Date fromDate;
    private Date toDate;

    public EmployeeSalary(int id, int empno, double salary, Date fromDate, Date toDate) {
        this.id = id;
        this.empno = empno;
        this.salary = salary;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public EmployeeSalary() {
    }

    public int getId() {
        return id;
    }

    public int getEmpno() {
        return empno;
    }

    public double getSalary() {
        return salary;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeSalary)) return false;
        EmployeeSalary that = (EmployeeSalary) o;
        return getId() == that.getId() &&
                getEmpno() == that.getEmpno() &&
                Double.compare(that.getSalary(), getSalary()) == 0 &&
                getFromDate().equals(that.getFromDate()) &&
                getToDate().equals(that.getToDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getEmpno(), getSalary(), getFromDate(), getToDate());
    }

    @Override
    public String toString() {
        return "EmployeeSalary{" +
                "id=" + id +
                ", empno=" + empno +
                ", salary=" + salary +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                '}';
    }
}
