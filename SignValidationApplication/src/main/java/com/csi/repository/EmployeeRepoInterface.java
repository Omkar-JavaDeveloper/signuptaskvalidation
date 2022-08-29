package com.csi.repository;


import com.csi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepoInterface extends JpaRepository<Employee,Integer> {



    // custom methods if required!!
}
