package accessModifier;

class MyClass1 {// ----- 클래스
	void method1() { // static이 없는 인스턴스 메소드
		System.out.println(this.toString());
		System.out.println("method1");
	}

	static void method2() { // static이 있는
		System.out.println("method2");
	}
}

public class StaticClass { // ----- 퍼블릭 클래스
	static void method3() {
		System.out.println("method3");
	}

//---------메인----------------------------------	
	public static void main(String[] args) {
		StaticClass.method3();
		MyClass1.method2();

		MyClass1 mc = new MyClass1();
		mc.method1();
		mc.method2();

		MyClass1 mc2 = new MyClass1();
		mc.method1();
		mc.method2();

	}

}