package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("vehicle")
//@Scope("singleton")       
public class Vehicle {
	@Qualifier("pEngine")
	@Autowired                // Field Injection
	private IEngine engg;
	
	//private constructor
	private Vehicle()
	{
		System.out.println("0 param const");
	}
	//b logic
	public void journey(String startPlace, String endPlace)
	{
		System.out.println("Journey started at: "+startPlace);
		engg.StartEngine();
		System.out.println("Journey going on");
		engg.StopEngine();
		System.out.println("Journey ended at: "+endPlace);
	}
	
}
