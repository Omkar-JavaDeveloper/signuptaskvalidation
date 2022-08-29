package com.csi.model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue
    private int empId;


    private String empName;


    @Column(unique = true)
    private long enpContactNo;


    @Column(unique = true)
    private String empEmailId;

    private String empPassword;

}
