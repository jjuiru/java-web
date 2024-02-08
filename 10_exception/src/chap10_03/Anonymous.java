package chap10_03;

public class Anonymous {
	private int field;
	public void method(int arg1,int arg2 ) {
		int varl=0;
		int var2=0;
//		arg1=20; // x 받은 값을 그대로 써야한다. 
		Calculatable calc =new Calculatable(){

			@Override
			public int sum() {
				int result=field+arg1+arg2+var2;
				return result;
			}			
		};
		System.out.println(calc.sum());
	}	
	public static void main(String[]args) {
		Anonymous anony=new Anonymous();
		anony.method(10, 10);
	}

}
