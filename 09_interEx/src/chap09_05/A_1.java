package chap09_05;

public class A_1 {
 int field1;
 void method1() {}
 
 static int field2;
 static void method2() {}
 
 class B{
	 void method() {
		 field1=10;
		 method1();
		 
		 field2=10;
		 method2();		 
	 }
 }
 
 static class C{
	 void method() {
		 B a= new A_1(). new B();
//         field1=10;
//         method1{};
		 
		 field2=10;
		 method2();
	 }
 }
}
