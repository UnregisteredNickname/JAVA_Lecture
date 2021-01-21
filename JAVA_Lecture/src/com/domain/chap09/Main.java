package com.domain.chap09;

public class Main {
	public static void main(String[] args) {
		A1 a = new A1();
		
		//인스턴스 멤버 클래스 객체 생성
		A1.B1 b = a.new B1();
		b.field1 = 3;
		b.method1();
		
		//정적 멤버 클래스 객체 생성
		A1.C1 c = new A1.C1();
		c.field1 = 3;
		c.method1();
		A1.C1.field2 = 3;
		A1.C1.method2();
		
		//로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
	}
}
