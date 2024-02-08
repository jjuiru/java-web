package constructor.acsses.valus1;

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1; // default 같은패키지
//		a.field3 = 1; // pribate 다른 클래스

		a.method1();
		a.method2();
//		a.method3(); // pribate 다른 클래스
	}
}
