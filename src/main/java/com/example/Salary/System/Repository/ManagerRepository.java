package com.example.Salary.System.Repository;

import com.example.Salary.System.Models.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Long> {

    @Query("SELECT * FROM Manager WHERE teamName=:nameOfTeam")
    Manager getManagerByTeamName(@Param("nameOfTeam") String teamName);
}