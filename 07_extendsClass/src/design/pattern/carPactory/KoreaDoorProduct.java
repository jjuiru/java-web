package design.pattern.carPactory;

public class KoreaDoorProduct extends DoorProduct { //국산 도어 생산

	@Override
	public String makeAssemble() { // 만든다는 부모메소드 시그니처를 사용해 오버라이딩
		return "국산도어";
	}

}
