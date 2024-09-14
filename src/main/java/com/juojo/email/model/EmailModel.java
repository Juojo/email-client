package com.juojo.email.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Email;

public class EmailModel {

	@NotNull
	@Email
	private String from, to;
	
	private String subject, body;
	
	public EmailModel(String from, String to, String subject, String body) {		
		this.from = from;
		this.to = to;
		this.subject = subject;
		this.body = body;
	}

	public String getFrom() {
		return from;
	}
	
	public String getTo() {
		return to;
	}

	public String getSubject() {
		return subject;
	}

	public String getBody() {
		return body;
	}		
	
}
