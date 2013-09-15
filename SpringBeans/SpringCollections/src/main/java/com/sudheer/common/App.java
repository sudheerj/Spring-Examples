package com.sudheer.common;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");

		Customer cust = (Customer) context.getBean("CustomerBean");
		System.out.println(cust);
		context.close();
	}
}