package com.sudheer.customer.services;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CustomerService implements InitializingBean, DisposableBean
{
	String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init method after properties are set : " + message);
	}
	
	public void destroy() throws Exception {
		System.out.println("Spring Container is destroy! Customer clean up");
	}
	
}
