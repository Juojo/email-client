package com.juojo.email.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

	public EmailController() {
		
	}
	
	@GetMapping("/")
	public String hello() {
		return "Hello world!";
	}
	
}
