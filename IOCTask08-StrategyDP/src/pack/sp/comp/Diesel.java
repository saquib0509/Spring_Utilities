package pack.sp.comp;

public class Diesel implements IFuel{
	@Override
	public String engine(String carno) {
		
		return carno+ " car no. is having engine of type Diesel";
	}
}
