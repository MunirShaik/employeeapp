package com.hmagro.employeeapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hmagro.employeeapp.data.Stock;
import com.hmagro.employeeapp.repository.StockRepo;

@Service
public class StockService {

	@Autowired
	StockRepo repo;

	public List<Stock> getAllStock() {
		return repo.findAll();
	}

	public void saveStock(Stock stock) {
		repo.save(stock);
	}

	public Stock getStock(int id) {
		return repo.findById(id).orElseThrow();
	}

}
