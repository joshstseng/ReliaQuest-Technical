package com.challenge.api.controller;

import com.challenge.api.model.Employee;
import com.challenge.api.model.EmployeeRepository;
import java.util.List;
import java.util.UUID;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Fill in the missing aspects of this Spring Web REST Controller. Don't forget to add a Service layer.
 */
@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    EmployeeRepository repository = new EmployeeRepository();

    /**
     * @implNote Need not be concerned with an actual persistence layer. Generate mock Employee models as necessary.
     * @return One or more Employees.
     */
    public List<Employee> getAllEmployees() {

        List<Employee> employeeList = repository.getAllEmployees();
        return employeeList;

        // throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @implNote Need not be concerned with an actual persistence layer. Generate mock Employee model as necessary.
     * @param uuid Employee UUID
     * @return Requested Employee if exists
     */
    public Employee getEmployeeByUuid(UUID uuid) {

        // Returns null if no employee matches uuid
        Employee e = repository.getEmployeeByUuid(uuid);
        return e;

        // throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @implNote Need not be concerned with an actual persistence layer.
     * @param requestBody hint!
     * @return Newly created Employee
     */
    public Employee createEmployee(Object requestBody) {

        // assuming that the object passed in is an Employee or EmployeeImpl
        if (requestBody instanceof Employee) {
            Employee e = (Employee) requestBody; // cast body to employee

            // create and add the employee to the repository
            repository.addEmployee(
                    e.getUuid(),
                    e.getFirstName(),
                    e.getLastName(),
                    e.getFullName(),
                    e.getSalary(),
                    e.getAge(),
                    e.getJobTitle(),
                    e.getEmail(),
                    e.getContractHireDate());

            return e; // return new employee
        } else {
            throw new IllegalArgumentException("Invalid object type. Expected Employee.");
        }
        // throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }
}
