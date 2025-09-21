package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	
//	@Qualifier("pEngine")
//	@Qualifier("${engg.id}")          we cannot use just @Qualifier without @Value
//	@Qualifier(@Value("${engg.id}")  )         Type mismatch error, Value cannot be in Qualifier
	
	@Value("${engg.id}")
	private String id;
	
	@Autowired                // Field Injection
//	@Qualifier(id)            // Invalid, we cannot pass variable name to @Qualifier  ---------------> We have to take alias name from XML file
	@Qualifier("motor")
	private IEngine engg;
	
	//private constructor
	private Vehicle()
	{
		System.out.println("Constructor invoked");
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
