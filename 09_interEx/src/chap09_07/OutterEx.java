package chap09_07;

public class OutterEx {

	public static void main(String[] args) {
		Outter outter=new Outter();
		Outter.Nested nested= outter. new Nested();
		nested.methdo();
	}
}
