package accessModifier;

public class StaticField2 {
	static int x;

	static int p1() {
		return x + 100;
	}

	static int m1() {
		return x - 100;
	}

	static void m2() {
		System.out.println(x);
	}

	public static void main(String[] args) {
		StaticField2 c1= new StaticField2();
		c1.m2(); // 정상적인 사용법이 아님 객체 생성과 상관이 없음
		
		x = 100;
		int y = p1();
		System.out.println(y);
		StaticField2.m2();
	}
}
