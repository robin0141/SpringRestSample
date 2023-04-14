package com.devpsample.rest.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.devpsample.rest.model.Employee;
import com.devpsample.rest.model.Employees;

@Repository
public class EmployeeDAO 
{
    private static Employees list = new Employees();
    
    
    @Value("${spring.myname}")
    private String myName;
    static 
    {
        list.getEmployeeList().add(new Employee(1, "E1", "L1", "email@gmail.com"));
        list.getEmployeeList().add(new Employee(2, "E2", "L2", "email2@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "E3", "L3", "email3@gmail.com"));
        list.getEmployeeList().add(new Employee(4, "E4", "L4", "email4@gmail.com"));
    }
    
    public Employees getAllEmployees() 
    {
    	System.out.println("MY name :::::: "+myName);
        return list;
    }
    
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}
