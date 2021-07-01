package com.example.api.api.service;

import com.example.api.api.model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployee();
    public  Employee getByid(Long id);
    public void  saveOrUpdate(Employee employee);
    public void deleteEmployee(Long id);
}
