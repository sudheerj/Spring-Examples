package com.sudheer.common;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Spring Bean Properties Inject value
 *
 */
public class App 
{
	public static void main( String[] args )
    {
    	/*ConfigurableApplicationContext context = 
    	   new ClassPathXmlApplicationContext(new String[] {"SpringBeans1.xml"});
    	ConfigurableApplicationContext context = 
    	    	   new ClassPathXmlApplicationContext(new String[] {"SpringBeans2.xml"});*/
    	ConfigurableApplicationContext context = 
    	    	   new ClassPathXmlApplicationContext(new String[] {"SpringBeans3.xml"});
    	FileNameGenerator generator = (FileNameGenerator)context.getBean("FileNameGenerator");
    	System.out.println(generator.getName());
    	System.out.println(generator.getType());
    	context.close();
 
    }
}
