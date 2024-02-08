package kind;

public class AnimalEx {
	

	public static void main(String[] args) { // 메소드 선언후 호출확인
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound(); // 멍멍 호출
		cat.sound(); // 야옹 호출
		System.out.println("/---------");

		Animal animal = null; // 변수 주소값에 널을 넣어 임의로 Animal타입의 변수를 만든다.
		animal = new Dog(); // Dog의 메소드 객체를 animal에 넣으면 자동 타입변환이 이루어지고, 오버라이딩 된 메소드를 사용할 수 있다.
		animal.sound(); //멍멍 호출
		animal= new Cat();
		animal.sound(); //야옹 호출		
		System.out.println("/---------");
		
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) { //동물 소리를 호출할 수 있는 메소드
		animal.sound(); // Dog 오버라이딩 된 부모의 sound 메소드르 호출
	}
}
