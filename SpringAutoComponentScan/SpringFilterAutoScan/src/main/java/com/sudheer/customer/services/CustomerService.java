package com.sudheer.customer.services;

import org.springframework.beans.factory.annotation.Autowired;
import com.sudheer.customer.dao.CustomerDAO;

public class CustomerService 
{
	@Autowired
	CustomerDAO customerDAO;

	@Override
	public String toString() {
		return "CustomerService [customerDAO=" + customerDAO + "]";
	}
		
}
