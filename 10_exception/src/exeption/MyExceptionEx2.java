package exeption;

class MyClass4{
	void method() {
		throw new MyException2("내가 만든 실행 예외");
		//실행예외는 실행전에는 시스템에서 예외처리를 강제하지 않는다.
	}
}

public class MyExceptionEx2 {

	public static void main(String[] args) {
		MyClass4 mc= new MyClass4();
		try {
			mc.method(); // 예외 없는 상태로 실행
		}catch(MyException2 e) {
			System.out.println("내가만든 실행 예외 캐치!");
		}
	}
}
