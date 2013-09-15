package com.sudheer.common;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sudheer.output.OutputHelper;

/**
 * Spring Multiple Bean Config files
 *
 */
public class App 
{
	public static void main( String[] args )
    {
    	ConfigurableApplicationContext context = 
    	   new ClassPathXmlApplicationContext(new String[] {"Spring-Main.xml"});
 
    	OutputHelper output = (OutputHelper)context.getBean("OutputHelper");
    	output.generateOutput();
    	context.close();
 
    }
}
