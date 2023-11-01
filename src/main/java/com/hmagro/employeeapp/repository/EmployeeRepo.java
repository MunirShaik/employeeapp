package com.hmagro.employeeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hmagro.employeeapp.data.Employee;


public interface EmployeeRepo extends JpaRepository<Employee, String> {

}
