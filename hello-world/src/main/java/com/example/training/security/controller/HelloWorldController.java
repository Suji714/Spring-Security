package com.example.training.security.controller;
/**
*Author        : Manthri.Sujitha
*Date          : 2 Dec 2024
*Time          : 3:24:23 pm
*Project Name  : hello-world
*/

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {
	
	@GetMapping("/hello")
	public String name() {
		return "Hello Word from Spring Security";		
	}

}
