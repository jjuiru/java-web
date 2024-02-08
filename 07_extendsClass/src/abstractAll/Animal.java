package abstractAll;

public abstract class Animal {// 추상 클래스
	public String kind;
	
		
	public void breathe() { // 숨을 쉰다는 동작의 메소드
		System.out.println("숨을 쉽니다.");
	}
	public abstract void sound(); // 추상 메소드 선언> 바디 부분이 있으면 오류
}
