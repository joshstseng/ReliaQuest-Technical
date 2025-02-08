package com.challenge.api.model;

import java.time.Instant;
import java.util.UUID;

// import com.challenge.api.model.Employee;

// Employee implementation as a class
public class EmployeeImpl implements Employee {

    UUID uuid;
    String firstName;
    String lastName;
    String fullName;
    Integer salary;
    Integer age;
    String jobTitle;
    String email;
    Instant contractHireDate;
    Instant contractTerminationDate;

    public EmployeeImpl(
            UUID uuid,
            String firstName,
            String lastName,
            String fullName,
            Integer salary,
            Integer age,
            String jobTitle,
            String email,
            Instant contractHireDate) {

        this.uuid = uuid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.salary = salary;
        this.age = age;
        this.jobTitle = jobTitle;
        this.email = email;
        this.contractHireDate = contractHireDate;
    }

    @Override
    public UUID getUuid() {
        return this.uuid;
    }

    @Override
    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getFullName() {
        return this.fullName;
    }

    @Override
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public Integer getSalary() {
        return this.salary;
    }

    @Override
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }

    @Override
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String getJobTitle() {
        return this.jobTitle;
    }

    @Override
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public Instant getContractHireDate() {
        return this.contractHireDate;
    }

    @Override
    public void setContractHireDate(Instant contractHireDate) {
        this.contractHireDate = contractHireDate;
    }

    @Override
    public Instant getContractTerminationDate() {
        if (this.contractTerminationDate == null) {
            return null;
        } else {
            return this.contractTerminationDate;
        }
    }

    @Override
    public void setContractTerminationDate(Instant date) {
        this.contractTerminationDate = date;
    }
}
