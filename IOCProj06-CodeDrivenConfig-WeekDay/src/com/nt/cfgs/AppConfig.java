package com.nt.cfgs;

//Dependent Class

import java.time.LocalDate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration             // making this class as configuration
@ComponentScan(basePackages = "com.nt.sbeans")
public class AppConfig {
	
	public AppConfig()
	{
		System.out.println("0 parameter constructor");
	}
	
	@Bean(name= "ldate")
	public LocalDate createLDate() 
	{	
//		return LocalDate.of(2025, 5, 16);
		return LocalDate.now();
	}
}
