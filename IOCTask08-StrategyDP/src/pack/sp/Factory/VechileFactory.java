package pack.sp.Factory;

import pack.sp.comp.Diesel;
import pack.sp.comp.Electric;
import pack.sp.comp.IFuel;
import pack.sp.comp.Petrol;
import pack.sp.comp.Vechile;

//1. static getInstance
//2. Target Class object
//3. assign Dependent class object to target class

public class VechileFactory {
	
	public static Vechile getInstance(String etype)
	{
		IFuel fuel = null;
		if(etype.equalsIgnoreCase("Petrol"))
			fuel = new Petrol();
		else if(etype.equalsIgnoreCase("diesel"))
			fuel = new Diesel();
		else if(etype.equalsIgnoreCase("electric"))
			fuel = new Electric();
		else
			throw new IllegalArgumentException("Invalid Engine type");
		
		Vechile ve = new Vechile();
		ve.setIFuel(fuel);
		return ve;
	}
}
