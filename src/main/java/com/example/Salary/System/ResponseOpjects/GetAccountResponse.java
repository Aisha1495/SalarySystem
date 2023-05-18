package com.example.Salary.System.ResponseOpjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetAccountResponse {
    String BankName;
    String AccountType;
    Double AccountNumber;
    String BankBranch;


    public GetAccountResponse(String accountType, String accountNumber, String bankBranch, String bankName) {
    }
}
