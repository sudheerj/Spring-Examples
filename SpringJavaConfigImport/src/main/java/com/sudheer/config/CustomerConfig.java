package com.sudheer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sudheer.core.Customer;

@Configuration
public class CustomerConfig {
	
	@Bean(name="customer")
	public Customer customer(){
		
		return new Customer();
		
	}
}