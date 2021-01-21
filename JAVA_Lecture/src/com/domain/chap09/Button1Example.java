package com.domain.chap09;

public class Button1Example {
	public static void main(String[] args) {
		Button1 btn = new Button1();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}
}
