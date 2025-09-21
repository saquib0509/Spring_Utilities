package com.np.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")         // This annotation makes the IOC Container finds the class and Manages it, and this makes it as Spring class
public class Flipkart {

	@Autowired                  // Inject dependency automatically
	@Qualifier("bluedart")       // tells Spring to inject the bean named dtdc specifically
	private ICourier courier;

	public void setICourier(ICourier courier) {
		this.courier = courier;
	}

	//	b.method
	public String Shopping(String[] items, double[] price)
	{
		//generate bill amount
		double billAmount = 0.0;
		for(double p: price)
		{
			billAmount = billAmount+p;
		}
		//generate random oid - order id
		int oid = new Random().nextInt(1000);
		String msg = courier.deliver(oid);
		
		return Arrays.toString(items)+" items with bill amount "+billAmount+" having " +msg;
	}
}
