package com.domain.chap09;

public class Main {
	public static void main(String[] args) {
		A1 a = new A1();
		
		//�ν��Ͻ� ��� Ŭ���� ��ü ����
		A1.B1 b = a.new B1();
		b.field1 = 3;
		b.method1();
		
		//���� ��� Ŭ���� ��ü ����
		A1.C1 c = new A1.C1();
		c.field1 = 3;
		c.method1();
		A1.C1.field2 = 3;
		A1.C1.method2();
		
		//���� Ŭ���� ��ü ������ ���� �޼ҵ� ȣ��
		a.method();
	}
}
