package com.example.Salary.System.ResponseOpjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetEmployeeResponse {

    String name;
    String Gender;
    String Branch;
    String BankName;

    public GetEmployeeResponse(String name, String gender, String department, Double salary) {
    }
}