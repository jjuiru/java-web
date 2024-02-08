package exeption;

class MyClass{
	void method() {}
}
public class NPEex {
	public static void main(String[] args) {
		MyClass mc=null;
		System.out.println(mc);
		mc.method();
		
//		String adta=null;
//		System.out.println(data.toString());
	}
}
