package chap08_03;

public class SoundableExameple {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

	public static void main(String[] args) {
		printSound(new Cat()); //soundable로 자동타입변환되어 재정의된 메소드가 호출된다.
		printSound(new Dog());
	}
}

class Cat implements Soundable {

	@Override
	public String sound() {
		return "야옹";
	}
}

class Dog implements Soundable {

	@Override
	public String sound() {
		return "멍멍";
	}
}
