package com.example.employeecrudrest.service;

import com.example.employeecrudrest.entity.Employee;
import com.example.employeecrudrest.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public void saveEmployee(Employee employee) {
        this.employeeRepository.save(employee);
    }

    public Employee getEmployeeById(long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public void deleteEmployeeById(long id) {
        employeeRepository.deleteById(id);
    }
}
