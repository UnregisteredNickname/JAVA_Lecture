package com.domain.chap08;

public class Vehicle2Example {
	public static void main(String[] args) {
		Vehicle2 vehicle = new Bus2();
		
		vehicle.run();
		//vehicle.checkFare(); (x)
		
		Bus2 bus = (Bus2) vehicle;
		
		bus.run();
		bus.checkFare();
	}
}
