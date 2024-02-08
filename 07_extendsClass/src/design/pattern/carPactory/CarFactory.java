package design.pattern.carPactory;

public abstract class CarFactory {
	public abstract TireProduct createTire(); //추상클래스 타입의 메소드 시그니처 설정
	public abstract DoorProduct cteateDoor();
}
