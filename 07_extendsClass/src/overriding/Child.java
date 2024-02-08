package overriding;

public class Child extends Parent {
public String field2;
	
	public void method3() {
		System.out.println("Child-method3()");
	}

	@Override
	public void method2() {
		System.out.println("바꿨지롱");
//		super.method2();
	}
	
	
}
