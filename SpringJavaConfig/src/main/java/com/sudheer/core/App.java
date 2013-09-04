package com.sudheer.core;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sudheer.config.AppConfig;
import com.sudheer.helloworld.HelloWorld;

/**
 * Spring Annotations Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    			//ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
    			ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    		    HelloWorld obj = (HelloWorld) context.getBean("helloBean");	    
    		    obj.printHelloWorld("Spring3 Annotations");
    		    context.close();

    }
}
