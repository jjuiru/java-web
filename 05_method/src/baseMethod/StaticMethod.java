package baseMethod;

public class StaticMethod {

	static int y; // 정적필드 
	
	public static void main(String[] args) {
		System.out.println(y);
		y=300;
		int x = 100; // 지역변수
		m1(100); // m1 메소드 내용이 실행됨
		System.out.println(x); // 출력 100, m1메소드 내용에 영향받지 않음
	}

	public static void m1(int x) { // 지역변수 x를 매개로 가져와 쓸순 있지만, m1에서 정해진 값 x,y는 main 메소드에 영향을 끼치지 않는다.
		System.out.println(y); // y static 필드가 존재하기 때문에 선언하지 않아도 바로 사용 가능하다.
		System.out.println(x);
	}

}
