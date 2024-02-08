package design.pattern.carPactory;

public class KoreaCarFactory extends CarFactory {

	@Override
	public TireProduct createTire() { 
		//공장의 추상클래스 타이어만들기를 오버로딩해 한국타이어를 리턴
		return new KoreaTireProduct();
	}
	@Override
	public DoorProduct cteateDoor() {
		//공장의 추상클래스 도어만들기를 오버로딩해 한국타이어를 리턴
		return new KoreaDoorProduct();
	}
}
