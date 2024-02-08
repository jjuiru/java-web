package chap09_01;

public class A {
	class B {
		B() {}// 클래스 B의 생성자
		int field1; // 클래스 안에서 변수선언 >필드
//		static int field2; //B의 객체 생성이 되어야 static을 사용할 수 있다.
		void method1() {}
//		static void method2() {}
	}
	void methodA() {
		B b= new B(); //인스턴스 클래스이기 때문에 객체를 생성해서 사용한다.
		b.field1=3;
		b.method1();
	}
}
