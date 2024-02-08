package chap08_01;

public class Ex {

	public static void main(String[] args) {
//		new RemoteControl(); 인터페이스는 객체생성이 불가하다.
		
//		RemoteControl remote= new RemoteControl();// 자기자신으로 객체생성불가
		
		RemoteControl audio= new Audio();
		RemoteControl tv= new Television();
		//부모타입의 인스턴스를 식클래스 생성자로 만든다. 
		//----------------
		audio.turnOn();
		tv.turnOn();
		audio.turnOff();
		tv.turnOff();
		//----------------
		System.out.println(audio.MIN_VOLUME);
//		rc.MAX_VOLUME=100; 인터페이스 상수는 수정할 수 없다.
	}
}
