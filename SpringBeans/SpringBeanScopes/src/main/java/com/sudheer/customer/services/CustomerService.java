package com.sudheer.customer.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/*@Service
@Scope("prototype")*/
public class CustomerService 
{
	String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
