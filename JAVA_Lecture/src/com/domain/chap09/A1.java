package com.domain.chap09;

	/** �ٱ� Ŭ����**/
    class A1 {
	A1() { System.out.println("A1 ��ü�� ������"); }
	
	class B1 {
		B1() { System.out.println("B1 ��ü�� ������"); }
		int field1;
		//static int field2;
		void method1() {}
		//static void method2() {}
	}
	
	/**���� ��� Ŭ����**/
	static class C1 {
		C1() { System.out.println("C1 ��ü�� ������"); }
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		/**���� Ŭ����**/
		class D1 {
			D1() {System.out.println("D ��ü�� ������"); }
			int field1;
			//static int field2;
			void method1() {}
			//static void method2() {}
		}
		D1 d = new D1();
		d.field1 = 3;
		d.method1();
	}
}
