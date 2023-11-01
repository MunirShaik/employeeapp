package com.hmagro.employeeapp.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "public", name = "stock")
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int s_no;
	private String item_code;
	private String item_dimensions;
	private String item_size;
	private String item_weight;
	private int item_price;
	private String item_purchase_date;

	public int getS_no() {
		return s_no;
	}

	public void setS_no(int s_no) {
		this.s_no = s_no;
	}

	public String getItem_code() {
		return item_code;
	}

	public void setItem_code(String item_code) {
		this.item_code = item_code;
	}

	public String getItem_dimensions() {
		return item_dimensions;
	}

	public void setItem_dimensions(String item_dimensions) {
		this.item_dimensions = item_dimensions;
	}

	public String getItem_size() {
		return item_size;
	}

	public void setItem_size(String item_size) {
		this.item_size = item_size;
	}

	public String getItem_weight() {
		return item_weight;
	}

	public void setItem_weight(String item_weight) {
		this.item_weight = item_weight;
	}

	public int getItem_price() {
		return item_price;
	}

	public void setItem_price(int item_price) {
		this.item_price = item_price;
	}

	public String getItem_purchase_date() {
		return item_purchase_date;
	}

	public void setItem_purchase_date(String item_purchase_date) {
		this.item_purchase_date = item_purchase_date;
	}

	@Override
	public String toString() {
		return "Stock [s_no=" + s_no + ", item_code=" + item_code + ", item_dimensions=" + item_dimensions
				+ ", item_size=" + item_size + ", item_weight=" + item_weight + ", item_price=" + item_price
				+ ", item_purchase_date=" + item_purchase_date + "]";
	}

}
