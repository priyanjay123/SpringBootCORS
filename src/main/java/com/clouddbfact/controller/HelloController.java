package com.clouddbfact.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		System.out.println("hello method called in HelloController");
		return "Hello";
	}
}
