package com.hmagro.employeeapp.services;

import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hmagro.employeeapp.data.Order;
import com.hmagro.employeeapp.repository.OrderRepo;

@Service
public class OrderService {
	
	/*
	 * @Autowired Order order;
	 */
	
	@Autowired
	OrderRepo repo;
	
	public String getOrder() {
		
		
		
		Order order = new Order();
		order.setOrder_id(2);
		order.setCustomer_name("Muneer");
		order.setOrder_item("Plough");
		order.setOrder_status("New");
		
		/*
		 * SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD"); Date mydate =new
		 * Date();
		 */
		
		order.setOrder_date("2023-10-27");
		repo.save(order);
		
		//Order order = repo.findById(1).orElseThrow();
	//	System.out.println(order.getOrder_date());
		return "Success";
	}
	
	
	public void createOrder() {
		
		Order order = new Order();
		order.setOrder_id(2);
		order.setCustomer_name("Muneer");
		order.setOrder_item("Plough");
		order.setOrder_status("New");
		

		
		repo.save(order);
		

	}


	public String saveOrder(Order order) {
		// TODO Auto-generated method stub
		 repo.save(order);
		 return "Success";
	}


	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	

	public void deleteOrder(int id)
	{
		repo.deleteById(id);
	}
}
