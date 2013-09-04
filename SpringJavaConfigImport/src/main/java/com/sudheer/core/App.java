package com.sudheer.core;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sudheer.config.AppConfig;


/**
 * Spring Import annotations !
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Customer customer = (Customer) context.getBean("customer");
	    customer.printMsg("Hello");
	    
	    Scheduler scheduler = (Scheduler) context.getBean("scheduler");
	    scheduler.printMsg("Hello");
	    
	    context.close();

    }
}
