package com.example.demo4.Rest;

import java.util.List;
import com.example.demo4.Entity.Employee;
import com.example.demo4.Service.Serviceinit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/Employee")
public class Restcontroller {
 private Serviceinit serviceinit;   
public Restcontroller(Serviceinit serviceinit1){
    serviceinit = serviceinit1;
}
@GetMapping("/all1")
List<Employee> findall(){
    return serviceinit.findall();
}
@GetMapping("/id")
Employee findbyid(Integer id){
    int id2=3;
    return serviceinit.findbyid(id2);
}
@PostMapping("/id/{empid}")
Employee get(@PathVariable int empid){
    Employee employee3 = serviceinit.findbyid(empid);
    return employee3;
}
@PostMapping("/add")
Employee Save(@RequestBody Employee theEmployee){
    theEmployee.setId(0);
Employee employee4 = serviceinit.Save(theEmployee);
return employee4;
}

@PutMapping("/update")
Employee Update(@RequestBody Employee theEmployee){
 Employee employee5 = serviceinit.Save(theEmployee);
return employee5;
}
}
