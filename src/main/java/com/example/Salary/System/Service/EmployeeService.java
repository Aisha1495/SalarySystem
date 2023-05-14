package com.example.Salary.System.Service;


import com.example.Salary.System.Models.Employee;
import com.example.Salary.System.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public List<Employee>getEmployees() {
        return employeeRepository.findAll();
    }

}