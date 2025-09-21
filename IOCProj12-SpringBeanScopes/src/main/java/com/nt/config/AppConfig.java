package com.nt.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.nt.sbeans")
public class AppConfig {
	
	@Bean(name="dt1")
	@Scope("singleton")
	public Date createDate1()
	{
		return new Date();
	}
}
