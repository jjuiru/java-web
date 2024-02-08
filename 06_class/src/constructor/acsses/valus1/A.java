package constructor.acsses.valus1;

public class A {
	public int field1; // 모든 접근 가능
	int field2; // 같은 패키지 접근 가능
	private int field3; // 같은 클래스 접근 가능
	
	public A() { // 클래스 내부에는 모든 접근 가능
		field1=1;
		field2=2;
		field2=3;
		
		method1();
		method2();
		method3();	
	}
	
	public void method1() {} //모든 접근
	void method2(){} //같은 패키지
	private void method3() {} // 같은 클래스
}
