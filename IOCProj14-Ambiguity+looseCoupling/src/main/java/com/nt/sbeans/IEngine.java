package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("iEngine")
public interface IEngine {
	
	public void StartEngine();
	public void StopEngine();
	
}
