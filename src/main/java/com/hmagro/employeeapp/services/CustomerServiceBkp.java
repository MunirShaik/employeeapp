package com.hmagro.employeeapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hmagro.employeeapp.data.Customer;
import com.hmagro.employeeapp.repository.CustomerRepo;

@Service
public class CustomerServiceBkp {

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

}
