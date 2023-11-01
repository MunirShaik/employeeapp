package com.hmagro.employeeapp.data;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Table(schema = "employee" , name = "employee_details" )
@Entity
@Component
public class Employee {


	@Id
	private String employee_id;   //employee.employee_details
	private String employee_name;
	private String employee_adress;
	private String employee_phone_no;
	private String employee_type;
	public String getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getEmployee_adress() {
		return employee_adress;
	}
	public void setEmployee_adress(String employee_adress) {
		this.employee_adress = employee_adress;
	}
	public String getEmployee_phone_no() {
		return employee_phone_no;
	}
	public void setEmployee_phone_no(String employee_phone_no) {
		this.employee_phone_no = employee_phone_no;
	}
	public String getEmployee_type() {
		return employee_type;
	}
	public void setEmployee_type(String employee_type) {
		this.employee_type = employee_type;
	}
	
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", employee_adress="
				+ employee_adress + ", employee_phone_no=" + employee_phone_no + ", employee_type=" + employee_type
				+ "]";
	}
	
	
	
}
