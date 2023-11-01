package com.hmagro.employeeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hmagro.employeeapp.data.Stock;

public interface StockRepo extends JpaRepository<Stock, Integer> {

}
