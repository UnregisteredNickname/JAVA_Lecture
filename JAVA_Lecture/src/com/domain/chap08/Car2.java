package com.domain.chap08;

public class Car2 {
	Tire1[] tires = {
			new HankookTire1(),
			new HankookTire1(),
			new HankookTire1(),
			new HankookTire1()
	};
	
	void run() {
		for(Tire1 tire: tires) {
			tire.roll();
		}
	}
}
