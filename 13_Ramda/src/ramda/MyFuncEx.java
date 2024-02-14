package ramda;

public class MyFuncEx {

	public static void main(String[] args) {
		MyFunc mf, mf2, mf3;
		
		mf3 =(a) -> {System.out.println("method");}; //문장이 하나면 겉 중괄호도 생략가능
		mf3.method(20);
		
		mf = new MyFunc() {
			
			public void method(int x) {
				System.out.println(x);
			}			
		};
mf.method(10);
//mf2=()-> {System.out.println("method");};

}
}
