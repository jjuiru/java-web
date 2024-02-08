package abstractAll;

public class Bird extends Animal {
	public Bird() {
		this.kind="조류";
	}
	@Override
	public void sound() { // 추상 클래스를 상속받을때는 꼭 재졍의 해야한다.
		System.out.println("삐약");
	}
}
