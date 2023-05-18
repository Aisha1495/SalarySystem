package com.example.Salary.System.RequestObjects;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetAccountRequestObject {
    String BankName;
    String AccountType;
    Double AccountNumber;
    String BankBranch;
}
