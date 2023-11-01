package com.hmagro.employeeapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hmagro.employeeapp.data.Employee;
import com.hmagro.employeeapp.repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo repo;
	
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Employee getEmployeeById(String id) {
		return repo.findById(id).orElseThrow();
	}

	public void saveEmployee(Employee employee) {
		repo.save(employee);
	}
	
	public void deleteEmployee(String id) {
		repo.deleteById(id);
	}

}
