
package com.challenge.api.model;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class EmployeeRepository {
    private List<Employee> employees = new ArrayList<>();
    
    public EmployeeRepository() {
        employees.add(new EmployeeImpl(UUID.randomUUID(), "Joshua", "Tseng", 
                                        "Joshua Tseng", 1000, 22, 
                                        "Software Engineer", "joshuastseng@gmail.com", 
                                        Instant.now()));

        employees.add(new EmployeeImpl(UUID.randomUUID(), "Caleb", "John", 
                                        "Caleb John", 1000, 22, 
                                        "Architect", "caleb@gmail.com", 
                                        Instant.now()));                                    
    }

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(this.employees);
    }

    public List<Employee> getEmployees() {
        return this.employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

}