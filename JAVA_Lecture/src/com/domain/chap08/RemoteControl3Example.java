package com.domain.chap08;

public class RemoteControl3Example {
	public static void main(String[] args) {
		
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio1();
		rc.turnOn();
		rc.turnOff();
		
	}
}
