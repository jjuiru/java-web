package chap02;

public class TypeConversion4 {
	public static void main(String[] args) {
		float v1 = 123.555555666666777777888888F;
		double v2 = 123.555555666666777777888888;

		System.out.println("float형 변수 v1:" + v1); // float형 변수 v1:123.55556
		System.out.println("double형 변수 v2:" + v2); // float형 변수 v2:123.55555566666678

		double var = 0.1;
		for (int i = 0; i < 1000; i++) {// 10회 반복
			var += 0.1; // var= var+0.1

		}
		System.out.println(var);
	}
}
