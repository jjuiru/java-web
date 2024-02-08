package classEx;

class YourClass {
	int x;
}

public class Passing2 {

	public static void main(String[] args) {
		YourClass yc3=null;      //   주소값이 연결되지 않고 주소스텍에 null이 들어갔다.
		System.out.println(yc3); // null 출력후 연결된 주소가 없어 널포인트오류가 난다.
		yc3.x=200;      //주소가 없어 넣을수가 없음
			
		YourClass yc = new YourClass(); // 객체 생성(기본생성자 실행)
		System.out.println("main:" + yc.x); // 
		method1(yc);
		System.out.println("main:" + yc.x); // yc와 연결된 YourClass 안의 주소값이 method1에 전송되어 int x 로 선언된 값을 사용하여 리턴할 수 있다.

	}

	public static void method1(YourClass yc) {
		yc.x = 300;
		return;
	}
}
