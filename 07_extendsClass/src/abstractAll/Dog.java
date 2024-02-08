package abstractAll;

public class Dog extends Animal {
	public Dog() { // 생성자
		// super(); 기본생성자 생략되어있음
		this.kind="포유류";
	}

	@Override
	public void sound() { // 추상 클래스를 상속받을때는 꼭 재졍의 해야한다.
		System.out.println("멍멍");
	}
}
