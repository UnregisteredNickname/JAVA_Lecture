package com.domain.chap08;

public class Car1 {
	Tire1 frontLeftTire = new HankookTire1();
	Tire1 frontRightTire = new HankookTire1();
	Tire1 backLeftTire = new HankookTire1();
	Tire1 backRightTire = new HankookTire1();
	
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
