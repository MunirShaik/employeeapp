package com.hmagro.employeeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hmagro.employeeapp.data.Order;

public interface OrderRepo extends JpaRepository<Order, Integer> {

}
