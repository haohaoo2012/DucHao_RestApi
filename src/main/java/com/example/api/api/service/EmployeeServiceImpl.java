package com.example.api.api.service;

import com.example.api.api.model.Employee;
import com.example.api.api.repository.EmployeeRepository;
import com.example.api.api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository repository;
    @Override
    public List<Employee> getAllEmployee() {
        return (List<Employee>) repository.findAll();
    }

    @Override
    public Employee getByid(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void saveOrUpdate(Employee employee) {
    repository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
repository.deleteById(id);
    }
}
