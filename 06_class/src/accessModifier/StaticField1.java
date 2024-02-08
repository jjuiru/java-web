package accessModifier;

public class StaticField1 {
 int field1;
 void method1() {}
 static int field2; // 사용가능
 static void method2() {} // 사용가능
 static void method23() { // 사용가능
	 StaticField1 num = new StaticField1();
//	 field1=10;// 왜 접근할 수 없는가? 즉시사용 불가능(객체를 생성해야한다) 인스턴스라
	 num.field1=10;
	 StaticField1.field2=10;// 사용가능 static은 이미 실행가능상태(메모리에 올라가있다)
 }
 void method4(){ //객체 생성후 사용가능 static과 인스턴스 다 사용가능
	 this.field1=10;
	 StaticField1.field2=10;
 }
}
