package com.example.demo4.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo4.Entity.Employee;

public interface Employeerep extends JpaRepository<Employee, Integer>{   
}
