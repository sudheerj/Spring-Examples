package com.sudheer.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sudheer.customer.dao.CustomerDAO;
import com.sudheer.customer.model.Customer;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	 
        CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
        Customer customer = new Customer(2, "sudheer",26);
        customerDAO.insert(customer);
    	
        Customer customer1 = customerDAO.findByCustomerId(2);
        System.out.println(customer1);
        
    }
}
