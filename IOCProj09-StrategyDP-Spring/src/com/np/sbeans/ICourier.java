package com.np.sbeans;

import org.springframework.stereotype.Component;

@Component("icourier")
public interface ICourier {

	public String deliver(int oid);
}
