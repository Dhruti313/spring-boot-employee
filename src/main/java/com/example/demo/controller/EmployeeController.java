package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @GetMapping
     public List<Employee> getAllEmployee(){
         return employeeRepository.findAll();
     }
     @PostMapping
    public Employee createEmployee( @RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

}