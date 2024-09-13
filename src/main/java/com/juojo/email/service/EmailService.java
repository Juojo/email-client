package com.juojo.email.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.juojo.email.model.EmailModel;

@Service
public class EmailService {
	
	/***
	 * @return httpStatus
	*/
	public HttpStatus sendEmail(EmailModel email) {
		HttpStatus httpStatus;
		
		try {
			httpStatus = HttpStatus.OK;
		} catch (Exception e) {
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		
		return httpStatus;
	}
	
}
