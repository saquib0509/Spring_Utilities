package com.np.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc") 
public class DTDC implements ICourier {

	@Override
	public String deliver(int oid) {
		
		return oid+ " order ID is ordered from DTDC";
	}

}
