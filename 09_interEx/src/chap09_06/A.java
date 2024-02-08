package chap09_06;

public class A {
	 public static void main(String[] args) {
		 B b =new B();
		 b.method();
		 //스태틱은 A객체의 생성과 상관없이 바로 실행된다.
		 //그래서 수동으로 A객체형성과 b객체 형성을 함게 해야 b객체를 사용 가능하다.
//		 A a= new A();
//		 B b= a.new B();
//		 B b= new A().new B();
//		 b.method();
	 }	 
	int field1;
	void method1() {}
	 
	 static int field2;
	 static void method2() {}
	 
	 static class B{// static 클래스가 선언되면 A객체와 상관없어진다.(종속성없어짐)
		 void method() {
//			 field1=10; //A 객체가 생성되지 않아서 안의 필드사용불가
//			 method1();
//			 System.out.println("method() :"+field1);
			 
			 field2=10;
			 method2();		 
		 }
	 }
	 
	 static class C{
		 void method() {
//			 B a= new A(). new B();
//	         field1=10;
//	         method1{};
			 
			 field2=10;
			 method2();
		 }
	  }
	}
