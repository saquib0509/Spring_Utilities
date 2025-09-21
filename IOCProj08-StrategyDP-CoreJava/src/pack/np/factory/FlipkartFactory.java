package pack.np.factory;

import com.np.comp.BlueDart;
import com.np.comp.DTDC;
import com.np.comp.Delhivery;
import com.np.comp.Flipkart;
import com.np.comp.ICourier;

//  When we use use spring, Factory will not be needed as IOC Container will act as factory
public class FlipkartFactory {

	
	// This method will take CourierType as Input from test class, and check if matches with any delivery company, also create target class obj, and assign Dependent class obj i.e delivery company to that target class obj
	public static Flipkart  getInstance(String CourierType)
	{
		ICourier courier = null;
		if(CourierType.equalsIgnoreCase("dtdc"))
			courier = new  DTDC();
		else if(CourierType.equalsIgnoreCase("bluedart"))
			courier = new  BlueDart();
		else if(CourierType.equalsIgnoreCase("delhivery"))
			courier = new  Delhivery();
		else
			throw new IllegalArgumentException("No Delivery Partner found");
		
		//Creating Target class obj
		Flipkart fpkt = new Flipkart();
		//assign dependent class obj i.e courier to Tarket class Obj i.e fpkt
		fpkt.setICourier(courier);
		return fpkt;
	}
}
