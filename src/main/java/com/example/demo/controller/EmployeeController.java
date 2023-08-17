package com.example.demo.controller;

import com.example.demo.exception.ResourcesNotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

     //build create employee
     @PostMapping
    public Employee createEmployee( @RequestBody Employee employee){
        return employeeRepository.save(employee);
    }
//build getEmployee by id
@GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById( @PathVariable long id){
            Employee employee = employeeRepository.findById(id).
                    orElseThrow(()->new ResourcesNotFoundException("Employee not exsist with id : +id"));
            return ResponseEntity.ok(employee);

    }


}
