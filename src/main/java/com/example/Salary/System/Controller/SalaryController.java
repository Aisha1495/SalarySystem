package com.example.Salary.System.Controller;

import com.example.Salary.System.Models.Account;
import com.example.Salary.System.Models.Salary;
import com.example.Salary.System.Repository.SalaryRepository;
import com.example.Salary.System.Service.AccountService;
import com.example.Salary.System.Service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
public class SalaryController {

    @Autowired
    SalaryService salaryService;


    @RequestMapping("account/create")
    public void saveSalary () {
        createSalary();
    }

    @RequestMapping ("account/get")
    public List<Salary> getSalary(){
        return SalaryService.getSalary();
    }

    private void createSalary() {


    }

}
