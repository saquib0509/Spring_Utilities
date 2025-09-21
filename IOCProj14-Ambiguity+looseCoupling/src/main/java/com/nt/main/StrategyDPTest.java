package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Vehicle;

public class StrategyDPTest {
	public static void main(String[] args) 
	{
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);)
		{
//			get target spring bean class object reference
			Vehicle vech = ctx.getBean("vehicle", Vehicle.class);
			
			//invoke b method
			vech.journey("Blr", "Hyd");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
