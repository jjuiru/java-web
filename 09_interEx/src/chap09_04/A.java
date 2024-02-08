package chap09_04;

public class A {//외부 클래스
	A() {//A 생성자
		System.out.println("A 객체 생성");
	}

	class B { //B 내부 클래스
		B() { // B 생성자
			System.out.println("B 객체 생성");
		}
		int field1;
		// static int field2;
		void method1() {}
	}
	static class C {
		C(){
			System.out.println("C 객체 생성");
		}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	void method() {
		class D{
			D(){
				System.out.println("D 객체 생성");}
				int field1;
				//static int field2;
				void method1() {}
				//static void maethod2;		
		}
		D d =new D();
		d.field1=3;
		d.method1();
	}
}
