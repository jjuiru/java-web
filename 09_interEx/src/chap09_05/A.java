package chap09_05;

public class A {
	B field1=new B();  //필드 내에서는 순서와 상관없이 객체 생성이 가능하다.
	C field2=new C();
//	static B field3= new B();
	//A객체가 생성되어야 B도 객체 생성이 된다.
	static B field3= new A().new B(); // A객체를 먼저 생성했기 때문에 가능
	static C field4= new C();
	
	void method1() {
		B var1= new B();
		C var2= new C();
	}
	static void method2() {
//		B var1= new B();
		C var2= new C();
	}
	class B {}
    static class C{}
}
