package pack.sp.comp;

public class Electric implements IFuel {

	@Override
	public String engine(String carno) {
	
		return carno+ " car no. is having engine of type Electric";
	}

}
