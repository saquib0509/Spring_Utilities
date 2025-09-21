package com.nt.sbeans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("dEngine")
@Lazy(true)
public final class DieselEngine implements IEngine {

	public static Logger logger = LoggerFactory.getLogger(DieselEngine.class);

	public DieselEngine() {
		logger.info("0 param Constructor");
		System.out.println("DieselEngine.DieselEngine():: 0-Param const");
	}

	@Override
	public void StartEngine() {
		logger.info("Diesel Engine started");
		System.out.println("Engine Started");

	}

	@Override
	public void StopEngine() {
		logger.info("Diesel Engine stopped");
		System.out.println("Engine Stopped");
	}

}
