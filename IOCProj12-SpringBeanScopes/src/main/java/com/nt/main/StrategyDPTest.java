package com.nt.main;

import java.util.Date;

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
			Vehicle vech1 = ctx.getBean("vehicle", Vehicle.class);
			
			System.out.println(vech.hashCode()+ " " + vech1.hashCode());
			
			Date d= ctx.getBean("dt1", Date.class);
			Date d1= ctx.getBean("dt1", Date.class);
			
			System.out.println(d.hashCode()+ " " + d1.hashCode());
			
			//invoke b method
			vech.journey("Blr", "Hyd");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
