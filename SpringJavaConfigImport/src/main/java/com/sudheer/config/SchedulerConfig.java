package com.sudheer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sudheer.core.Scheduler;

@Configuration
public class SchedulerConfig {
	
	@Bean(name="scheduler")
	public Scheduler sucheduler(){
		
		return new Scheduler();
		
	}
	
}