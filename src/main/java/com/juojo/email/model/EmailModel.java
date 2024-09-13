package com.juojo.email.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Email;

public class EmailModel {

	@NotNull
	@Email
	private String to, from;
	
	private String subject, body;
	
	public EmailModel(String to, String from, String subject, String body) {
		this.to = to;
		this.from = from;
		this.subject = subject;
		this.body = body;
	}

	public String getUsername() {
		return to;
	}

	public String getDomainName() {
		return from;
	}

	public String getSubject() {
		return subject;
	}

	public String getContent() {
		return body;
	}		
	
}
