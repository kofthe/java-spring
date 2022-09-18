package com.uyarisal.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWordController {

	//need a controller method 
	
	// need a acontroller method to process the HTML form 
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloword-form"; 
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloword" ; 
	}
	
}