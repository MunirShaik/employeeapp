package com.hmagro.employeeapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
public class CustomerController {

    @Autowired
    CustomerService service;

    /*
     * @GetMapping("/hmagro/customers") private String getAllCustomer(Model model) {
     * List<Customer> customers = service.getAllCustomers();
     * model.addAttribute("customers", customers); return "customer"; }
     */

    @PostMapping("hmagro/customer/update")
    private String saveCustomer(@ModelAttribute("customer") Customer customer) {
        service.saveCustomer(customer);
        return "redirect:/hmagro/customers";
    }

    @GetMapping("hmagro/customer/update/{id}")
    private String getCustomer(@PathVariable int id, Model model) {
        System.out.println(id);
        model.addAttribute("customer", service.getCustomer(id));
        return "update_customer";
        // TODO Auto-generated method stub
    }

    @GetMapping("hmagro/customer/new")
    private String newCustomer(Model model) {
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "create_customer";
        // TODO Auto-generated method stub
    }

    @GetMapping("/hmagro/customer/page/{pageNumber}")
    public String getOnePage(Model model, @PathVariable("pageNumber") int currentPage, String keyword) {
        Page<Customer> page = service.findPage(currentPage);
        int totalPages = page.getTotalPages();
        long totalItems = page.getTotalElements();
        List<Customer> customers = page.getContent();

        model.addAttribute("currentPage", currentPage);
        model.addAttribute("totalPages", totalPages);
        model.addAttribute("totalItems", totalItems);

        if (keyword != null) {
            model.addAttribute("customers", service.findByKeyword(keyword));
        } else {
            model.addAttribute("customers", customers);
        }

        return "customer";
    }

    @GetMapping("/hmagro/customers")
    public String getAllPages(Model model, String keyword) {

        return getOnePage(model, 1, keyword);
    }

}