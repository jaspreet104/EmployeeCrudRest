package com.example.employeecrudrest.controller;

import com.example.employeecrudrest.entity.Employee;
import com.example.employeecrudrest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping("/saveEmployee")
    public void saveEmployee(@RequestBody Employee employee) {
        this.employeeService.saveEmployee(employee);
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable long id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/deleteemployee/{id}")
    public void deleteEmployeeById(@PathVariable long id) {
        employeeService.deleteEmployeeById(id);
    }
}
