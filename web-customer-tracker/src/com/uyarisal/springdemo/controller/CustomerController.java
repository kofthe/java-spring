package com.uyarisal.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uyarisal.springdemo.dao.CustomerDAO;
import com.uyarisal.sprringdemo.entity.Customer;

@Controller
@RequestMapping("/customer")  
public class CustomerController {
	// need to inject customer dao
	@Autowired
	private CustomerDAO customerDAO; 
	
	
	
	@RequestMapping("/list")
	public String listCustomers(Model theModel) {
		//get customer from the dao 
		List<Customer> theCustomers = customerDAO.getCustomers();
		
		//add customers to the model
		theModel.addAttribute("Customers", theCustomers); //Customers burada isim ve thecustomers ne olarak tanımlandığını göstermektedir. 
		return "list-customers";
	}
}
