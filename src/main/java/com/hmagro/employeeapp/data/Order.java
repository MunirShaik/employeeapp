package com.hmagro.employeeapp.data;

import java.util.Date;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(schema = "employee", name = "order")
@Component
public class Order {

	@Id
	private int order_id;
	private String order_status;
	private String customer_name;
	private String order_item;
	private String order_date;
	
	



	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getOrder_status() {
		return order_status;
	}
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getOrder_item() {
		return order_item;
	}
	public void setOrder_item(String order_item) {
		this.order_item = order_item;
	}
	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", order_status=" + order_status + ", customer_name=" + customer_name
				+ ", order_item=" + order_item + ", order_date=" + order_date + "]";
	}
	
	
	
}
