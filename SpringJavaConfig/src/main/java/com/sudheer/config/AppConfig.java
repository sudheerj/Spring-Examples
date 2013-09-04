package com.sudheer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sudheer.helloworld.HelloWorld;
import com.sudheer.helloworld.impl.HelloWorldImpl;


@Configuration
public class AppConfig {
	
	@Bean(name="helloBean")
    public HelloWorld helloWorld() {
        return new HelloWorldImpl();
    }
	
}