package chap09_05;

public class Ex {

	public static void main(String[] args) {
		A.method2();
		A.B b= A.field3; 
		A.C c= A.field4;
		
		A a= new A();// A 객체를 생성
		a.method1(); // 객체안의 method1 을 실행 
		A.B b1= a.field3; 
		A.C c2= a.field4;		
	}
}
