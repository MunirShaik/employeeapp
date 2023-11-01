package com.hmagro.employeeapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.hmagro.employeeapp.data.Customer;
import com.hmagro.employeeapp.repository.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	CustomerRepo repo;

	public List<Customer> getAllCustomers() {
		return repo.findAll();
	}

	public void saveCustomer(Customer customerObject) {
		repo.save(customerObject);
	}

	public Customer getCustomer(int s_no) {
		return repo.findById(s_no).orElseThrow();
	}

	public Page<Customer> findPage(int pageNumber) {
		Pageable pageable = PageRequest.of(pageNumber - 1, 20);
		return repo.findAll(pageable);
	}

	public List<Customer> findByKeyword(String keyword) {
		return repo.findByKeyword(keyword);
	}

}
