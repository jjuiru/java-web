package design.pattern.carPactory;

public class StateDoorProduct extends DoorProduct {//미국산 도어 생산

	@Override
	public String makeAssemble() {
		return "미국산 도어";
	}
}
