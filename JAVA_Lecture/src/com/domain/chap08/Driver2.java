package com.domain.chap08;

public class Driver2 {
	public void drive(Vehicle2 vehicle) {
		if(vehicle instanceof Bus2) {
			Bus2 bus = (Bus2) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
