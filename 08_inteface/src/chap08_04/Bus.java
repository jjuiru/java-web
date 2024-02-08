package chap08_04;

public class Bus implements Vehicle {
	//탈것인터페이스를 상속받은 버스 클래스
	//버스가 달리는 동작과 승차요금을 체크하는 동작의 메소드로 재정의
	
	@Override
	public void run() {
		System.out.println("버스가 달린다");
		
	}
	public void checkFare() {
		System.out.println("승차요금을 체크합니다");
	}
}
