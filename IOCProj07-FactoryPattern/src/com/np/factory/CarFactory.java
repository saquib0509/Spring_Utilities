package com.np.factory;

import com.np.comp.ICar;
import com.np.comp.Tesla;
import com.np.comp.Thar;

public class CarFactory {
	public static ICar getInstance(String type)
	{
		if(type.equalsIgnoreCase("Tesla"))
			return new Tesla();
		else if(type.equalsIgnoreCase("Thar"))
			return new Thar();
		else
			throw new IllegalArgumentException("Car not exist");
	}
}
