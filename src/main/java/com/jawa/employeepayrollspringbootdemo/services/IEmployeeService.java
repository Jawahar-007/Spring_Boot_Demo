package com.jawa.employeepayrollspringbootdemo.services;

import com.jawa.employeepayrollspringbootdemo.entity.EmployeeDetails;


import java.util.List;

public interface IEmployeeService {
    List<EmployeeDetails> getAllEmployee();

    EmployeeDetails getEmployeeDetails( int id);

    void createEmployee(EmployeeDetails details);

    EmployeeDetails updateEmployee(int id);

    void removeEmployee(int id);

}
