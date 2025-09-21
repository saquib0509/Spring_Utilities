package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cfgs.AppConfig;
import com.nt.sbeans.weekDayAnalyzer;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		
		//Create IOC Container
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);)
		{
		//get target spring bean class object reference
		weekDayAnalyzer wd = ctx.getBean("wda", weekDayAnalyzer.class);
		
		//invoke the business method
		String resultMsg = wd.generateFarewellMessage("Saquib");
		System.out.println(resultMsg);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
