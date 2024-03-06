package com.jawa.employeepayrollspringbootdemo.repositories;

import com.jawa.employeepayrollspringbootdemo.entity.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails, Integer> {

}
