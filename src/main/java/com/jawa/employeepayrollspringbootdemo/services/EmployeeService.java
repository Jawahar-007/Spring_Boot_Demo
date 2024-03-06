package com.jawa.employeepayrollspringbootdemo.services;

import com.jawa.employeepayrollspringbootdemo.entity.EmployeeDetails;
import com.jawa.employeepayrollspringbootdemo.repositories.EmployeeDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService{
    @Autowired
    private EmployeeDetailsRepository repo;


        public List<EmployeeDetails> getAllEmployee()  {
        //To use Spring DaTA JPA to get all emp from database
        List<EmployeeDetails> employeeDetails = repo.findAll();
        return employeeDetails;
    }

    public EmployeeDetails getEmployeeDetails(int id){

          Optional<EmployeeDetails> getEmployee = repo.findById(id);
          return getEmployee.orElse(null);
          //        return repo.findById(id).orElse(null);
    }


    public void createEmployee(EmployeeDetails details){
        repo.save(details);
    }

    public EmployeeDetails updateEmployee(int id){
        EmployeeDetails update = repo.findById(id).get();
        update.setEmployee_name("Varun");
        update.setEmployee_salary(13000L);
        update.setEmployee_profilePicture("gigi.com");
        update.setNotes("Occasionally Good");
        return update;
    }

    public void removeEmployee(int id) {
            EmployeeDetails delete = repo.findById(id).get();
            repo.deleteById(id);

        //get id : 6 passed by user ; id:6 to delete using by passing object (to get) as argument to repo.delete()
    }
}
