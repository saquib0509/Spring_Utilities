package com.np.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.np.config.AppConfig;
import com.np.sbeans.Flipkart;

public class StrategyPatternTest {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class))
		{
			Flipkart fpkt =ctx.getBean("fpkt", Flipkart.class);
			String msg = fpkt.Shopping(new String[] {"Shirt" ,"Shoes"}, new double[] {2000,3000});
			System.out.println(msg);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
