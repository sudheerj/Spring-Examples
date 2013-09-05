package com.sudheer.common;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring Constructor Type Ambiguities DI - Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ConfigurableApplicationContext context = 
    	    	  new ClassPathXmlApplicationContext(new String[] {"SpringBeans.xml"});
    	 
    	    	Customer cust = (Customer)context.getBean("CustomerBean");
    	    	System.out.println(cust);
    	    	context.close();
    }
}
