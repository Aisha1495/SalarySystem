package com.example.Salary.System.Controller;


import com.example.Salary.System.Models.Account;
import com.example.Salary.System.Models.Employee;
import com.example.Salary.System.Repository.AccountRepository;
import com.example.Salary.System.Repository.EmployeeRepository;
import com.example.Salary.System.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class AccountController {

    @Autowired
    AccountRepository accountRepository;


    @RequestMapping("account/create")
    public void saveAccount () {
        createAccount();
    }

    @RequestMapping ("account/get")
    public List<Account> getAccount(){
        return AccountService.getAccount();
    }

    private void createAccount() {
 Account account=new Account();
 account.setAccountType("CRIDIT");
 account.setAccountNumber("2317866868865.09f");
 account.setAccountHolderName("Malak");
 account.setBankName("Muscat");
 account.setBranchCode(255);
 account.setSwiftCode("2554j");
 account.setIsActive(true);
 account.setId(144445L);
 account.setCreatedDate(new Date());
 AccountService.saveAccount(account);

    }


}