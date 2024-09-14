package com.juojo.email.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.juojo.email.model.EmailModel;

@Service
public class EmailService {
	
	private JavaMailSender javaMailSender;
	
	@Autowired
	public EmailService(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}
	
	/***
	 * @return httpStatus
	*/
	public HttpStatus sendEmail(EmailModel email) {
		try {
			SimpleMailMessage message = new SimpleMailMessage();
			message.setFrom(email.getFrom());
			message.setTo(email.getTo());
			message.setSubject(email.getSubject());
			message.setText(email.getBody());
			
			javaMailSender.send(message);
			return HttpStatus.OK;
		} catch (Exception e) {
			System.out.println(e);
			return HttpStatus.INTERNAL_SERVER_ERROR;
		}
	}
	
}
