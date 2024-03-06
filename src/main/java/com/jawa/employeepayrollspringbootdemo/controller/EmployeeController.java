package com.jawa.employeepayrollspringbootdemo.controller;

import com.jawa.employeepayrollspringbootdemo.entity.EmployeeDetails;
import com.jawa.employeepayrollspringbootdemo.repositories.EmployeeDetailsRepository;
import com.jawa.employeepayrollspringbootdemo.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    // get the students
    //localhost:8080/employeepayroll
    @Autowired
    IEmployeeService iEmployeeService;

    @GetMapping("/employee")
    public List<EmployeeDetails> getAllEmployee() {
        //To use Spring DaTA JPA to get all emp from database
        return iEmployeeService.getAllEmployee();
    }

    @GetMapping("/employee/{id}")
    public EmployeeDetails getEmployeeDetails(@PathVariable int id) {
       return iEmployeeService.getEmployeeDetails(id);
    }

    @PostMapping({"/employee/add"})
    @ResponseStatus(code = HttpStatus.CREATED)
    // @RequestBody  we are passing are saved in
    public void createEmployee(@RequestBody EmployeeDetails details) {
        iEmployeeService.createEmployee(details);
    }

    // Update the details , pass the id
    @PutMapping("/employee/update/{id}")
    public EmployeeDetails updateEmployee(@PathVariable int id) {
        return iEmployeeService.updateEmployee(id);
    }

    @DeleteMapping("/employee/delete/{id}")
    public void removeEmployee(@PathVariable int id){
      iEmployeeService.removeEmployee(id);
    }
}