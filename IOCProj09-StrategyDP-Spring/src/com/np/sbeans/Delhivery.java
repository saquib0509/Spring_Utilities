package com.np.sbeans;

import org.springframework.stereotype.Component;

@Component("delhivery") 
public class Delhivery implements ICourier {

	@Override
	public String deliver(int oid) {
		
		return oid+ " order ID is ordered from Delhivery";
	}

}
