package kind;

public class Cat extends Animal {
	public Cat() {
	this.kind="포유류"; // 고양이의 종류는 포유루
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");	
	}
}
