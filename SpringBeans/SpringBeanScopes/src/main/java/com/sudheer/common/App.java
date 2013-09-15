package com.sudheer.common;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sudheer.customer.services.CustomerService;

/**
 * Spring Bean Scopes
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ConfigurableApplicationContext context = 
    	    	 new ClassPathXmlApplicationContext(new String[] {"Spring-Customer.xml"});
    	 
    	    	CustomerService customerA = (CustomerService)context.getBean("customerService");
    	    	customerA.setMessage("Message by customerA");
    	    	System.out.println("Message : " + customerA.getMessage());
    	 
    	    	//retrieve  again
    	    	CustomerService customerB = (CustomerService)context.getBean("customerService");
    	    	System.out.println("Message : " + customerB.getMessage());
    	    	context.close();
    }
}
