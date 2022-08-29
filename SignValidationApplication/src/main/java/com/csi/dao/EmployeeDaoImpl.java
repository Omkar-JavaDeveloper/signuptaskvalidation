package com.csi.dao;

import com.csi.exception.InvalidContactNumberException;
import com.csi.exception.InvalidEmailAdressException;
import com.csi.exception.InvalidNameException;
import com.csi.exception.InvalidPaddwordException;
import com.csi.model.Employee;
import com.csi.repository.EmployeeRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDaoImpl {

    @Autowired
    EmployeeRepoInterface employeeRepo;

  synchronized   public void signup(Employee employee) throws InvalidNameException, InvalidEmailAdressException,InvalidContactNumberException, InvalidPaddwordException {


        for (int i = 0; i < employee.getEmpName().length(); i++) {
            if (Character.isAlphabetic(employee.getEmpName().charAt(i)) || Character.isDigit(employee.getEmpName().charAt(i))
                    || Character.isSpace(employee.getEmpName().charAt(i)) ) {

            }else{
                    throw new InvalidNameException("bhau naav nit taaka!");
            }
        }

           if (employee.getEmpEmailId().contains("@") && employee.getEmpEmailId().contains(".")) {
        } else{
            throw new InvalidEmailAdressException("bhau Email nit taaka!!");
        }

       boolean status3 = false;
        String contact = String.valueOf(employee.getEnpContactNo());

        if (contact.length() <= 10) {

        }
       else {
            throw new InvalidContactNumberException("bhau ContactNumber LENGTH<11 taaka!!");
        }


        if (employee.getEmpPassword().length() > 3) {

        }
        else {
            throw new InvalidPaddwordException("Bhau Password madhe MINIMUM 4 DIGIT taaka!!");
        }

        employeeRepo.save(employee);
    }

}
