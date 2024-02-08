package exeption;

class ThrowClass {
	void method(int x) throws Exception {
		if (x > 10) {
			throw new Exception("예외발생");// 예외를 만들어서 실행한다.
		} else {
			System.out.println(x);
		}
	}
}

public class Ex {

	public static void main(String[] args) {
		ThrowClass tc = new ThrowClass();
		try {
			tc.method(10);
		} catch (Exception e) {
			System.out.println("예외확인");
		}
	}
}
