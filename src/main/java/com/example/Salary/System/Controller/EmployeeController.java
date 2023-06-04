package com.example.Salary.System.Controller;



import com.example.Salary.System.Models.Employee;
import com.example.Salary.System.RequestObjects.GetEmployeeRequestObject;
import com.example.Salary.System.ResponseOpjects.GetEmployeeResponse;
import com.example.Salary.System.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;


    //create
    @RequestMapping("employee/create")
    public void saveEmployee (@RequestBody GetEmployeeRequestObject employeeRequestObject) {
        createEmployee(employeeRequestObject);
    }


    //get
    @RequestMapping("employee/get")
    public List<Employee> getEmployees () {
        return employeeService.getEmployees();
    }

    //Path Variable
    @RequestMapping("employee/get/{employeeId}")
    public GetEmployeeResponse createEmployee (@PathVariable Long employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }


    //delete
    @RequestMapping("employee/delete/{employeeId}")
    public void deleteEmployee (@PathVariable Long employeeId) {
        employeeService.deleteEmployee(employeeId);
    }

    public void createEmployee(GetEmployeeRequestObject employeeRequestObject) {

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