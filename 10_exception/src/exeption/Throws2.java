package exeption;

class AnyClass12 {
	void anyMethod() throws Exception {
	}

	void method() {
		try {
			anyMethod();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Throws2 {
	public static void main(String[] args) {
		AnyClass12 ac = new AnyClass12();
		ac.method();
	}
}
