package com.np.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("bluedart") 
@Lazy(true)
public class BlueDart implements ICourier {

	@Override
	public String deliver(int oid) {
		
		return oid+ " order ID is ordered from BlueDart";
	}

}
