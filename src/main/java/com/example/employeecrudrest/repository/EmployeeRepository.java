package com.example.employeecrudrest.repository;

import com.example.employeecrudrest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
