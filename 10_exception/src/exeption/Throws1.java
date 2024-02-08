package exeption;

class AnyClass {
	void anyMethod() throws InterruptedException {
		throw new InterruptedException();
//		throw new RuntimeException();
	}

}

public class Throws1 {
	public static void main(String[] args) {
		AnyClass ac = new AnyClass();
		try {
			ac.anyMethod();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
