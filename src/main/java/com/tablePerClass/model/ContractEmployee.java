package com.tablePerClass.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ContractEmployee")
public class ContractEmployee extends Employee{

    @Column(name = "hourlyrate")
    private double hourlyrate;

    public double getHourlyrate() {
        return hourlyrate;
    }

    public void setHourlyrate(double hourlyrate) {
        this.hourlyrate = hourlyrate;
    }
}
