package com.np.main;

import com.np.comp.ICar;
import com.np.factory.CarFactory;

public class FactoryPatternTest {
public static void main(String[] args) {
	
	ICar car = CarFactory.getInstance("thar");
	car.drive();
}
}
