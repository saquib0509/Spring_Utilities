package com.np.comp;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {

	// setter method
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
