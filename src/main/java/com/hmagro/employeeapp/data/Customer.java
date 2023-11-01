package com.hmagro.employeeapp.data;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(schema = "public" , name = "customer" )
@Entity
@Component
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int s_no ;   
	private String customer_name;
	private long primary_number;
	private long secondary_number;
	private String address;
	public int getS_no() {
		return s_no;
	}
	public void setS_no(int s_no) {
		this.s_no = s_no;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public long getPrimary_number() {
		return primary_number;
	}
	public void setPrimary_number(long primary_number) {
		this.primary_number = primary_number;
	}
	public long getSecondary_number() {
		return secondary_number;
	}
	public void setSecondary_number(long secondary_number) {
		this.secondary_number = secondary_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [s_no=" + s_no + ", customer_name=" + customer_name + ", primary_number=" + primary_number
				+ ", secondary_number=" + secondary_number + ", address=" + address + "]";
	}
	
	


}
