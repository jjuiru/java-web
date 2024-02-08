package singleton;

public class Singleton {
	//private 접근제한은 자신 클래스 내에서만 접근 가능
	private static Singleton singleton =new Singleton(); //객체생성
	private Singleton() {} // 생성자-를 private로 하면?
	static Singleton getInstance() {//메소드  -싱글톤은 오직 이 메소드만을 이용해서 호출 가능하다.
		return singleton;
	}
}
