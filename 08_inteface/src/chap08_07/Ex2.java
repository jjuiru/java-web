package chap08_07;

interface Inter { // 인터페이스 
	void disp(); //추상메소드
}

public class Ex2 {

	public static void main(String[] args) {
		Inter it = new Inter() {
// 인터페이스는 객체 생성이 안된다.
// 바로 사용하기 위해 익명의 자식객체를 익명의 구현객체로 만들어 
//오버라이딩 한 메소드를 사용할 수 있게한다.
			int y = 100;

			public void disp2() {
				System.out.println("disp2");
				// 즉시 실행이 안되고 오버라이등 안에서 사용가능
			}

			@Override
			public void disp() {
				System.out.println(y); // 100출력
				disp2(); // disp2출력 메소드 호출로만 사용된다.
			}
		};
		it.disp();
	}
}
