package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.PersonalInfo;

public class ValueAnnotationTest {
	public static void main(String[] args) {
		//create IOC container
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class))
		{
			//get spring bean class object reference
		PersonalInfo info =	ctx.getBean("pInfo",PersonalInfo.class);
		System.out.println(info);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
