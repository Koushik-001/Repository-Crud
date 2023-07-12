package com.example.demo4.Service;

import java.util.List;

import com.example.demo4.Entity.Employee;

public interface Serviceinit {
    List<Employee> findall();
    Employee findbyid(Integer id);
    Employee Save(Employee theemployee);
    Employee Update(Employee theEmployee);
}
