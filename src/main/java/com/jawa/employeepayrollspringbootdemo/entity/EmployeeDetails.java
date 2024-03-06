package com.jawa.employeepayrollspringbootdemo.entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.LocalDate;

//name profilePicture,salary,startDate,gender,notes


@Entity
@Table(name = "employee_details")
public class EmployeeDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int employee_id;
    @Column(name = "employee_name")
    private String employee_name;
    @Column(name = "employee_picture")
    private String employee_profilePicture;
    @Column(name = "employee_salary")
    private Long employee_salary;
    @Column(name = "employee_Date")
    private LocalDate start_date;
    @Column(name="employee_gender")
    private String employee_gender;

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Column(name = "notes")
    private String notes;

    public EmployeeDetails(){

    }
    public int getEmployee_id() {
        return employee_id;
    }


    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_profilePicture() {
        return employee_profilePicture;
    }

    public void setEmployee_profilePicture(String employee_profilePicture) {
        this.employee_profilePicture = employee_profilePicture;
    }

    public Long getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(Long employee_salary) {
        this.employee_salary = employee_salary;
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public String getEmployee_gender() {
        return employee_gender;
    }

    public void setEmployee_gender(String employee_gender) {
        this.employee_gender = employee_gender;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "employee_id=" + employee_id +
                ", employee_name='" + employee_name + '\'' +
                ", employee_profilePicture='" + employee_profilePicture + '\'' +
                ", employee_salary=" + employee_salary +
                ", start_date=" + start_date +
                ", employee_gender='" + employee_gender + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
