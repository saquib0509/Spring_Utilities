package pack.sp.test;

import pack.sp.Factory.VechileFactory;
import pack.sp.comp.Vechile;

//1. Call Factory method (getInstance)
//2. Execute Business logic
public class SDPTest {

	public static void main(String[] args) {
		Vechile vec = VechileFactory.getInstance("diesel");
		
		String result = vec.journey("Mahindra");
		System.out.println(result);
	}
	
	
}
