package com.csi.controller;


import com.csi.dao.EmployeeDaoImpl;
import com.csi.exception.InvalidContactNumberException;
import com.csi.exception.InvalidEmailAdressException;
import com.csi.exception.InvalidNameException;
import com.csi.exception.InvalidPaddwordException;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    EmployeeDaoImpl employeeDao;

    @PostMapping("/signup")
    public ResponseEntity<String> signup( @RequestBody Employee employee){

        String msg="Data Inserted Successfully!";

        try {
            employeeDao.signup(employee);
        } catch (InvalidNameException e) {
            msg=e.getMessage();

        } catch (InvalidEmailAdressException e) {
            msg=e.getMessage();

        }catch (InvalidContactNumberException e) {
            msg=e.getMessage();

        }catch (InvalidPaddwordException e) {
            msg=e.getMessage();

        }
        return ResponseEntity.ok(msg);
    }

}
