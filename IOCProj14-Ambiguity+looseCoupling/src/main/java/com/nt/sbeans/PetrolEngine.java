package com.nt.sbeans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("pEngine")
@Lazy(true)                            // Becoz of this, Bean is only created when it is requested
public final class PetrolEngine implements IEngine {

	public static Logger logger = LoggerFactory.getLogger(PetrolEngine.class);
	public PetrolEngine()
	{
		logger.info("0 param Constructor");
		System.out.println("PetrolEngine():: 0-Param const");
	}
	@Override
	public void StartEngine() {
		logger.info("Petrol Engine started");
		System.out.println("Petrol Engine Started");
		
	}

	@Override
	public void StopEngine() {
		logger.info("Petrol Engine stopped");
		System.out.println("Petrol Engine Stopped");
	}

}
