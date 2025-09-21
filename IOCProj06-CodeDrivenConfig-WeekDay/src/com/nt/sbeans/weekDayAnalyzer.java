//weekDayAnalyzer.java

package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wda")
public class weekDayAnalyzer {
	private LocalDate date;  // HAS-A Property
	
	@Autowired
	public weekDayAnalyzer(LocalDate date)  //Constructor Injection
	{
		this.date = date;  // date is injected
	}
	
	// Business logic
	public String generateFarewellMessage(String name)
	{
		
		int wdno = date.getDayOfWeek().getValue();
		if(wdno >=1 && wdno <=5 )
		{
			return "Happy Week-days "+ name;
		}
		else
			return "Happy Week-end "+ name;	
	}
	
}
