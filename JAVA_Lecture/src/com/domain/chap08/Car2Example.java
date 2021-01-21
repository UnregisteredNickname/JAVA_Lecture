package com.domain.chap08;

public class Car2Example {
	public static void main(String[] args) {
		Car2 myCar = new Car2();
		
		myCar.run();
		
		myCar.tires[0] = new KumhoTire1();
		myCar.tires[1] = new KumhoTire1();
		
		myCar.run();
	}
}
