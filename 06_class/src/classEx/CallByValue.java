package classEx;

public class CallByValue {

	public static void main(String[] args) {

		int n = 100;
		MyClass mc = new MyClass(); // -------------->mc 클래스 생성만 함
		System.out.println("1번" + mc.n); // ------------->mc 클래스 생성후 아무런 값을 전달하지 않았기 때문에 0출력
//		increase(n,mc); // 호출 값 101출력
		increase(n, new MyClass()); // ------------->n인 100 과 MyClass 의0값을 보냈기 때문에 101과 1 출력
		System.out.println("4번" + n); // ------------>그대로 100이 출력/ 호출값은 전달받지 않는다(리턴값이 없다)
		System.out.println("5번" + mc.n); // ------------->mc n 은 그대로 0
	}

//-----------------------------------------------	

	public static void increase(int n, MyClass mc) { // static 이기 때문에 인자를 받아 값 101을 생성
		n += 1;
		System.out.println("2번" + n);
		mc.n += 1;
		System.out.println("3번" + mc.n);
	}

//-----------------------------------------------
}

class MyClass {
	int n;// 초기값 0
}