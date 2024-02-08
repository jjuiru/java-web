package chap09_09;

public class Chiled0 {
	void parentMethod() {
	};
}

class Child extends Chiled0 {

	@Override
	void parentMethod() {
		// TODO Auto-generated method stub
		super.parentMethod();
	}

}
//-----------------------
class A {
	void method1(Chiled0 p) {
	}

	void method2() {// 매개변수 익명객체 생성
		this.method1(new Chiled0() {
			int x;

			@Override
			void parentMethod() {
				System.out.println(this.x);
				super.parentMethod();
			}

		});
	}
//--------------------------
	// 클래스 내부에서 익명객체생성
	Chiled0 field = new Chiled0() {

		@Override
		void parentMethod() {
			// TODO Auto-generated method stub
			super.parentMethod();
		}

	};

	void method() {// 메소드 내부에서 익명객체생성
		Chiled0 var = new Chiled0() {

			@Override
			void parentMethod() {
				// TODO Auto-generated method stub
				super.parentMethod();
			}

		};
	}
}
