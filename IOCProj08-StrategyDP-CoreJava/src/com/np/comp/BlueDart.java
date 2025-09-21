package com.np.comp;

public class BlueDart implements ICourier {

	@Override
	public String deliver(int oid) {
		
		return oid+ " order ID is ordered from BlueDart";
	}

}
