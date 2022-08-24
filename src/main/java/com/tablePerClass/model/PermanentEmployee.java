package com.tablePerClass.model;

import com.tablePerClass.model.Employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PermanentEmployee")
public class PermanentEmployee extends Employee {

   @Column(name = "salary")
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
