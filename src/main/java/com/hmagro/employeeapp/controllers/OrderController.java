package com.hmagro.employeeapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hmagro.employeeapp.data.Customer;
import com.hmagro.employeeapp.data.Employee;
import com.hmagro.employeeapp.data.Order;
import com.hmagro.employeeapp.services.OrderService;

@Controller
public class OrderController {
	
	@Autowired
	OrderService service;

	//@ModelAttribute("order") Order order
	@PostMapping("/hmagro/order/save")
	private String getOrders(@ModelAttribute("order") Order order) {
		// TODO Auto-generated method stub
		System.out.println(order.getOrder_date());
		return service.saveOrder(order);
	}
	
	@GetMapping("/hmagro/orders")
	private String getOrders(Model model) {
		// TODO Auto-generated method stub
		
		List<Order> orderList = service.getOrders();
		model.addAttribute("orders", orderList);
		return "order";
	}
	
	@GetMapping("/hmagro/order/delete/{id}")
	private String deleteOrder(@PathVariable int id) {
		// TODO Auto-generated method stub
		service.deleteOrder(id);
		return "redirect:/hmagro/orders";
	}
	
	
	@GetMapping("/hmagro/order/new")
	private String createEmployee(Model model) {
		Order order = new Order();
		model.addAttribute("order", order);
		return "create_order";
	}
	
	
	

}
