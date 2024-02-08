package chap09_01;

public class Ex {
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B(); // A클래스안의 B클래스의 b 인스턴스를 만든다.
//	A.B b= new A().new B(); // A생성자 안에 B생성자 객채 생성
		b.field1 = 3;
		b.method1();

		// 일반적으로 중첩클래스는 내부에서 편하게 쓰기 위한 것이라 외부에서 생성해 사용할 일은 거의 없다.
		// 하지만 위처럼 사용할 수는 있다.
	}
}
