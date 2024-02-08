package kind;

public class Dog extends Animal {
	public Dog() {
		this.kind = "포유류"; // 포유류로 필드값 재설정
	}

	@Override
	public void sound() {
		System.out.println("멍멍");

	}
}
