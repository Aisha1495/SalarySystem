package com.example.Salary.System.Repository;

import com.example.Salary.System.Models.Employee;
import com.example.Salary.System.Models.Salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryRepository extends JpaRepository<Salary, Long> {

}
