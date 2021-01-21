package com.domain.chap08;

public class RemoteControl4Example {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		
		rc = new Audio2();
		rc.turnOn();
		rc.setMute(true);
	}
}
