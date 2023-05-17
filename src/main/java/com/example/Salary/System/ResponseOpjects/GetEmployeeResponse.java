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

    String department;
    Double salary;

}