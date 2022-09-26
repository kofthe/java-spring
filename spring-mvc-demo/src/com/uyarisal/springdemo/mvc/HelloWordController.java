package com.uyarisal.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
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
	 //new controller method read form data 
	//add data to the model 
	@RequestMapping("/processFormV2")
	public String readData(HttpServletRequest request, Model model) {
		
		//read the request parameter fot htm form 
		String theName = request.getParameter("studentName"); 
		//covert data upper case 
		theName = theName.toUpperCase() ;
		//vreate messaje 
		String result = "Tamamdır" + theName ; 
		//add the message model 
		model.addAttribute("message", result) ;
		return "helloword" ; 
	}
	@RequestMapping("/processFormV3")
	public String processFormV3(@RequestParam("studentName") String theName , Model model) {
		
		//read the request parameter fot htm form 
		 // Alttaki kodu requestparam hallediyor. yukarıda yazdığımız gibi yazmamıza gerek yok. 
			
		//String theName = request.getParameter("studentName"); 
		//covert data upper case 
		theName = theName.toUpperCase() ;
		//vreate messaje 
		String result = "RequestParam ifadesi ile yapıldı." + theName ; 
		//add the message model 
		model.addAttribute("message", result) ;
		return "helloword" ; 
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
