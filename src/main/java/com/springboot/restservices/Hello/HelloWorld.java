package com.springboot.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@GetMapping("/hello")
	public String Hello(){
		
		
		return "HelloWorld";
	}
	
	@GetMapping("Employee")
	public Employee Emp(){
		
		return new Employee("Sachin","CSE","Hinganghat");
	}
	
	
}
