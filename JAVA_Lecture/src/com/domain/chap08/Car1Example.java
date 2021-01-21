package com.domain.chap08;

public class Car1Example {
	public static void main(String[] args) {
		Car1 myCar = new Car1();
		
		myCar.run();
		
		myCar.frontLeftTire = new KumhoTire1();
		myCar.frontRightTire = new KumhoTire1();
		
		myCar.run();
	}
}
