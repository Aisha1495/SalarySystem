package com.example.Salary.System.Service;

import com.example.Salary.System.Models.Account;
import com.example.Salary.System.Models.Manager;
import com.example.Salary.System.Repository.AccountRepository;
import com.example.Salary.System.ResponseOpjects.GetAccountResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    static
    AccountRepository accountRepository;

    public static void saveAccount(Account account) {
        accountRepository.save(account);
    }

    public static List<Account> getAccount(Long accountId) {
        return accountRepository.findAll();
    }
    public GetAccountResponse getAccountById(Long accountId) {
        Optional<Account> optionalAccount =  accountRepository.findById(accountId);
        if(!optionalAccount.isEmpty())
        {
            Account account =  optionalAccount.get();
            GetAccountResponse accountResponse = new GetAccountResponse(account.getAccountType(), account.getAccountNumber(), account.getBankBranch(), account.getBankName());
            return accountResponse;
        }

        return null;

    }
    public Manager getAccountByAccountNumber(Integer accountNumber){
        return accountRepository.getAccountByAccountNumber(accountNumber);
    }
}