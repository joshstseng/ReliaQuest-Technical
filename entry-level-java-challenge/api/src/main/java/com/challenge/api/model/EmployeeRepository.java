package com.challenge.api.model;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EmployeeRepository {
    private List<Employee> employees = new ArrayList<>();

    public EmployeeRepository() {
        employees.add(new EmployeeImpl(
                UUID.randomUUID(),
                "Joshua",
                "Tseng",
                "Joshua Tseng",
                1000,
                22,
                "Software Engineer",
                "joshuastseng@gmail.com",
                Instant.now()));

        employees.add(new EmployeeImpl(
                UUID.randomUUID(),
                "Caleb",
                "John",
                "Caleb John",
                1000,
                22,
                "Architect",
                "caleb@gmail.com",
                Instant.now()));
    }

    public List<Employee> getEmployees() {
        return this.employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    /*
     * Returns all employees currently in the repository
     */
    public List<Employee> getAllEmployees() {
        return new ArrayList<>(this.employees);
    }

    /*
     * Returns the employee with matching uuid.
     * Returns null if none exists
     */
    public Employee getEmployeeByUuid(UUID uuid) {
        for (Employee e : employees) {
            if (e.getUuid() == uuid) {
                return e;
            }
        }
        return null;
    }

    /*
     * Adds an employee with given information to the repository
     */
    public void addEmployee(
            UUID uuid,
            String firstName,
            String lastName,
            String fullName,
            Integer salary,
            Integer age,
            String jobTitle,
            String email,
            Instant contractHireDate) {

        Employee e =
                new EmployeeImpl(uuid, firstName, lastName, fullName, salary, age, jobTitle, email, contractHireDate);
        employees.add(e);
    }
}
