package com.domain.chap09;

	/** ¹Ù±ù Å¬·¡½º**/
    class A1 {
	A1() { System.out.println("A1 °´Ã¼°¡ »ý¼ºµÊ"); }
	
	class B1 {
		B1() { System.out.println("B1 °´Ã¼°¡ »ý¼ºµÊ"); }
		int field1;
		//static int field2;
		void method1() {}
		//static void method2() {}
	}
	
	/**Á¤Àû ¸â¹ö Å¬·¡½º**/
	static class C1 {
		C1() { System.out.println("C1 °´Ã¼°¡ »ý¼ºµÊ"); }
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		/**·ÎÄÃ Å¬·¡½º**/
		class D1 {
			D1() {System.out.println("D °´Ã¼°¡ »ý¼ºµÊ"); }
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
