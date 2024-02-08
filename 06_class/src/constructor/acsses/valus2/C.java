package constructor.acsses.valus2;

import constructor.acsses.valus1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;
//		a.field2 = 1; // default 다른 패키지 필드 접근 불가
//		a.field3 = 1; // private 다른 클래스 필드 접근 불가

		a.method1();
//		a.method2(); // default 다른 패키지 필드 접근 불가
//		a.method3(); // private 다른 클래스 필드 접근 불가
	}
}
