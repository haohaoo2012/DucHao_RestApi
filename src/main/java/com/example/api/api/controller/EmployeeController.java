package com.example.api.api.controller;

import com.example.api.api.model.Employee;
import com.example.api.api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/api")
public class EmployeeController {
    @Autowired
    EmployeeService service;

    @PostMapping("/save")
    public Employee save(@RequestBody Employee employee){
        service.saveOrUpdate(employee);
        return employee;
    }

    @GetMapping("/list")
    public List<Employee> list(){
        return  service.getAllEmployee();
    }
    @GetMapping("/list/{id}")
    public  Employee getById(@PathVariable Long id){
        return service.getByid(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deletedeleteEmployee(@PathVariable (value = "id")Long id) {
        service.deleteEmployee(id);
        return "Delete Sucessfully id ="+id;
    }
    @PutMapping("/put")
    public Employee update(@RequestBody Employee employee) {
        service.saveOrUpdate(employee);
        return employee;
    }

}
