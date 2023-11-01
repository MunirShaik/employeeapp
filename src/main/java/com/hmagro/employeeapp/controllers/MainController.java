package com.hmagro.employeeapp.controllers;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PostMapping;
/*import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
*/
import com.hmagro.employeeapp.data.Employee;
import com.hmagro.employeeapp.services.EmployeeService;
import com.hmagro.employeeapp.services.OrderService;


@Controller
public class MainController {
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	OrderService orderService;
	

	
	  @Autowired 
	  Employee employee;
	  
	  
	  @GetMapping("/hmagro/home")
	  private String home() {
		  return "home";
	  }
	 
	
	@GetMapping("/hmagro/employees")
	private String getEmployees(Model model) {
		
		List<Employee> empList = employeeService.getEmployees();
		Collections.sort(empList, (e1,e2)->  e1.getEmployee_id().compareTo(e2.getEmployee_id()));
		
		model.addAttribute("employees", empList);	
		return "employee";
	}

	
	@GetMapping("/employee/edit/{id}")
	private String editEmployee(@PathVariable String id, Model model) {
		employee = employeeService.getEmployeeById(id);
		model.addAttribute("employee", employee);
		return "update_employee";
		
	}
	
	
	
	
	@PostMapping("/employees/update")
	private String updateEmployee(@ModelAttribute("employee") Employee employee) {
		System.out.println(employee.getEmployee_name());
		employeeService.saveEmployee(employee);
		return "redirect:/employee";

	}
	
	

	@GetMapping("/employees/create")
	private String createEmployee(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "create_employee";

	}
	
	@GetMapping("/employee/delete/{id}")
	public String deleteStudent(@PathVariable String id) {
		employeeService.deleteEmployee(id);
		return "redirect:/employee";
	}
	
	
	@GetMapping("/order")
	public String getOrder()
	{
		orderService.getOrder();
		return "Success";
	}

	
	@GetMapping("/createOrder")
	public String createOrder()
	{
		orderService.createOrder();
		return "Success";
	}
	
	
	
	
	
	
	
}
