package chap08_05;


interface InterA { // 인터페이스 상속
	void method();
}

class B implements InterA{

	@Override
	public void method() {	
	}
}

public class A extends B {
	public static void main(String[]arg) {
		InterA ita= new A();
	}

}
