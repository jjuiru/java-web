package design.pattern.carPactory;

public class StateCarFactory extends CarFactory{

	@Override
	public TireProduct createTire() {
		//공장의 추상클래스 타이어만들기를 오버로딩해 미국타이어를 리턴
		return new StateTireProduct();
	}

	@Override
	public DoorProduct cteateDoor() {
		//공장의 추상클래스 타이어만들기를 오버로딩해 미국도어를 리턴
		return new StateDoorProduct();
	}
}
