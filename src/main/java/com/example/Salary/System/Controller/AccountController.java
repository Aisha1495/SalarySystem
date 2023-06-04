package com.example.Salary.System.Controller;


import com.example.Salary.System.Models.Account;
import com.example.Salary.System.Models.Manager;
import com.example.Salary.System.Repository.AccountRepository;
import com.example.Salary.System.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class AccountController {

    @Autowired
    AccountRepository accountRepository;
AccountService accountService;

    @RequestMapping("account/create")
    public void saveAccount () {
        createAccount();
    }

    @RequestMapping ("account/get")
    public List<Account> getAccount(){
        Long accountId = null;
        return AccountService.getAccount(null);
    }

    @RequestMapping("account/get/{salaryId}")
    public List<Account> createAccount (@PathVariable Long accountId) {
        return AccountService.getAccount(accountId);
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

    @RequestMapping(value = "findAccountByAccountNumber", method = RequestMethod.GET)
    public Manager getAccountByAccountNumber(@RequestParam Integer accountNumber){
        return accountService.getAccountByAccountNumber(accountNumber);
    }
}