package chap09_03;

public class LocalClass {
	void method() {
		class D { //로컬 변수는 메소드 안에서만 사용할 것이기 때문에 
			D() {}
			int field1;
//		static int field2; 11버전에서는 스태틱 사용 불가
			void method1() {}
//		static void method2() {}
		}
		D d= new D(); //객체 생ㅅ엉후
		d.field1=3; //필드와 메소드 사용가능
		d.method1();
	}// 메소드 내에서 클래스를 불러 사용이 가능하다.
}
