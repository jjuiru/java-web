package chap09_07;

public class Outter {
	static String str= "static-str";
 String field="Outter-field";
 void method() {
	 System.out.println("Outter-method");
	
 }
 
 class Nested{
	 String field="Nested-field";
	 void methdo() {
		 System.out.println("Nested-method");
	 }
	 
	 void prin() {
		 System.out.println(Outter.str);
		 System.out.println(this.field); //속해있는 가장 가까운 클래스 this
		 this.methdo();
		 System.out.println(Outter.this.field); //바깥 클래스의 this.field
		 Outter.this.method();
	 }
 }
}
