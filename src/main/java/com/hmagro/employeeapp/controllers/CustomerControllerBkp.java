package com.hmagro.employeeapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.hmagro.employeeapp.data.Customer;
import com.hmagro.employeeapp.data.Employee;
import com.hmagro.employeeapp.services.CustomerService;

@Controller
public class CustomerControllerBkp {

	/*
	 * @Autowired CustomerService service;
	 * 
	 * @GetMapping("/hmagro/customers") private String getAllCustomer(Model model) {
	 * List<Customer> customers = service.getAllCustomers();
	 * model.addAttribute("customers", customers); return "customer"; }
	 * 
	 * @PostMapping("hmagro/customer/update") private String
	 * saveCustomer(@ModelAttribute("customer") Customer customer) {
	 * service.saveCustomer(customer); return "redirect:/hmagro/customers"; }
	 * 
	 * @GetMapping("hmagro/customer/update/{id}") private String
	 * getCustomer(@PathVariable int id, Model model) { System.out.println(id);
	 * model.addAttribute("customer", service.getCustomer(id)); return
	 * "update_customer"; // TODO Auto-generated method stub }
	 * 
	 * @GetMapping("hmagro/customer/new") private String newCustomer(Model model) {
	 * Customer customer = new Customer(); model.addAttribute("customer", customer);
	 * return "create_customer"; // TODO Auto-generated method stub }
	 */
}
