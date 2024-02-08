package exeption;

public class Throws3 {

	void method() {
		System.out.println("method()");
	}
	void method2() {
		try {
			return;
//			method();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("method2()-finally");
		}
	}
	public static void main(String[] args) {
		Throws3 pr = new Throws3();
		pr.method2();

	}
}