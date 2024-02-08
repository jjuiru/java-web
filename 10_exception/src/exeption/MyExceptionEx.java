package exeption;

class MyClass3{
	void method() throws MyException {
		throw new MyException("내가만든 예외");
	}
}
public class MyExceptionEx {

	public static void main(String[] args) {
		MyClass3 mc=new MyClass3();
		try {
			mc.method();
		} catch (MyException e) {
			System.out.println("나의 예외 캐치");
		}
	}
}
