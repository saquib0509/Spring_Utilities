package pack.np.test;

import com.np.comp.Flipkart;

import pack.np.factory.FlipkartFactory;

// 1. Main method - Here we call the Factory meth with class name by provide Delivery Company name as parameter &
// 2. We invoke b logic with Shopping parameters i.e items and price details, then call the
public class StrategyDPTest {

	public static void main(String[] args) {
		
//		calling factory meth
		Flipkart	flip = FlipkartFactory.getInstance("Delhivery");
		
//		Invvoke b meth
		
		String result = flip.Shopping(new String[]{"Shirt", "Shoes"}, new double[]{400, 2000} );
		System.out.println(result);
	}
}
