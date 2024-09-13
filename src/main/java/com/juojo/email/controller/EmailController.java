package com.juojo.email.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juojo.email.model.EmailModel;
import com.juojo.email.service.EmailService;

@RestController
@RequestMapping("/api")
public class EmailController {
	
	private EmailService emailService = new EmailService();

	public EmailController() {
		
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello world!";
	}
	
	@PostMapping("/sendEmail")
	public ResponseEntity<HttpStatus> sendEmail(@RequestBody EmailModel email) {
		HttpStatus httpStatus = emailService.sendEmail(email);
		return new ResponseEntity<>(httpStatus);
	}
	
}
