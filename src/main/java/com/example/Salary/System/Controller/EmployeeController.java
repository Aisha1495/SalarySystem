package com.example.Salary.System.Controller;



import com.example.Salary.System.Models.Employee;
import com.example.Salary.System.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("employee/create")
    public void saveEmployee () {
        createEmployee();
    }

    @RequestMapping ("employee/get")
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

    public void createEmployee() {

        Employee employee = new Employee();
        employee.setName("Aisha");
        employee.setGender("Female");
        employee.setSalary(650.0);
        employee.setDepartment("Software");
        employee.setCompanyName("TechM");
        employee.setCreatedDate(new Date());
        employee.setIsActive(true);
        employeeService.saveEmployee(employee);
    }
}