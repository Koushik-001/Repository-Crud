package com.example.demo4.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo4.Entity.Employee;
import com.example.demo4.Repo.Employeerep;
@Service
public class Serviceimpl implements Serviceinit {
private Employeerep employeerep;
public Serviceimpl(Employeerep employeerep1){
employeerep = employeerep1;
}
    @Override
    public List<Employee> findall() {
    return employeerep.findAll();   
    }
    @Override
    public Employee findbyid(Integer id) {
    Optional<Employee> res = employeerep.findById(id);    
     Employee employee = res.get();
     return employee;    
}
    @Override
    public Employee Save(Employee theemployee) {
       return employeerep.save(theemployee);
    }
    @Override
    public Employee Update(Employee theEmployee) {
       return employeerep.save(theEmployee);
    }
    
}
