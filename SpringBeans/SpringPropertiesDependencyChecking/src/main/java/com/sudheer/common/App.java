package com.sudheer.common;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring Properties Dependency Checking
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ConfigurableApplicationContext context = 
    	    	  new ClassPathXmlApplicationContext(new String[] {"SpringBeans-all.xml"});
    	/*ConfigurableApplicationContext context = 
  	    	  new ClassPathXmlApplicationContext(new String[] {"SpringBeans-ConstructorInjection.xml"});*/
    	    	Customer cust = (Customer)context.getBean("CustomerBean");
    	    	System.out.println(cust);
    	    	context.close();
    }
}
