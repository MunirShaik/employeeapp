package com.hmagro.employeeapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.hmagro.employeeapp.data.Stock;
import com.hmagro.employeeapp.services.StockService;

@Controller
public class StockController {

	@Autowired
	StockService service;

	@GetMapping("/hmagro/stocks")
	private String getAllStockDetails(Model model) {
		List<Stock> stocklist = service.getAllStock();
		model.addAttribute("stocks", stocklist);
		System.out.println(stocklist.get(1).getS_no());
		return "stock";

	}

	@GetMapping("/hmagro/stock/update/{id}")
	private String getStock(@PathVariable int id, Model model) {
		Stock stock = service.getStock(id);
		model.addAttribute("stock", stock);
		return "update_stock";
	}

	@PostMapping("/hmagro/stock/update")
	private String updateStock(@ModelAttribute("stock") Stock stock) {
		service.saveStock(stock);
		return "redirect:/hmagro/stock";

	}

	@GetMapping("/hmagro/stock/new")
	private String newStock(Model model) {
		Stock stock = new Stock();
		model.addAttribute("stock", stock);
		return "create_stock";
	}

}
