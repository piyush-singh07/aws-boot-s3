package com.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/greet")
public class GreetController {
	
	@GetMapping("/hi")
	public String sayHello()
	{
		return "Hey There! I am from EC2 instance and AWS S3";
	}
	
	@GetMapping("/bye")
	public String sayBye()
	{
		return "Bye for now from EC2 instance and AWS S3";
	}

}
