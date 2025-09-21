package pack.sp.comp;


//1. Setter method
//2. business method
public class Vechile {

	private IFuel fuel;
	
	public void setIFuel(IFuel fuel)
	{
		this.fuel=fuel;
	}
	
	public String journey(String company)  
	{
		String carno = "KA1432";
		String msg = fuel.engine(carno);
		return "Your " +company+" "+msg;
	}
}

//3 variables we used
//1. fuel: Called from getInstance
//2. car no.: called from IFuel > engine (carno)
//3. company: called from main(journey)
