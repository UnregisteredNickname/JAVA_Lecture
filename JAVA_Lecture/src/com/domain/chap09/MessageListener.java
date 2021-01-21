package com.domain.chap09;

public class MessageListener implements Button1.OnClickListener {
	@Override
	public void onClick() {
		System.out.println("메시지를 보냅니다.");
	}
}