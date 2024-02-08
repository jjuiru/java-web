package chap09_02;

public class A {
	static class C {
		C() {} // 클래스 c의 생성자
		int field1;
		static int field2;
		void method() {}
		static void method2() {}
	}
	void methodA() {
		C c= new C();
		c.field1=3;
		c.method();
//		c.method2();
		C.field2=10; 
		//static 필드이기 때문에 객체생성을 통해 사용하지 않아도 된다.	
	}
}
