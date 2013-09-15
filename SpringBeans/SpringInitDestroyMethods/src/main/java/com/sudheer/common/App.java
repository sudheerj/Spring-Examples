package com.sudheer.common;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sudheer.customer.services.CustomerService;


public class App 
{
    public static void main( String[] args )
    {
    	ConfigurableApplicationContext context = 
    		new ClassPathXmlApplicationContext(new String[] {"Spring-Customer.xml"});
	
    	CustomerService cust = (CustomerService)context.getBean("customerService");
    	
    	System.out.println(cust);
    	
    	context.close();
    }
}
