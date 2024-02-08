package abstractAll;

public class SmartPhone extends Phone {

	public SmartPhone(int x) {
		super(x); // 부모의 생성자
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ring() { 
		/* 재정의가 없을 경우 해당 클래스는 추상 클래스가 되어야 한다.
		 * 부모의 클래스를 상속받아 추상 메소드 또한 가지고 있는 상태로 보기 때문에
		 * 꼭 재정의 해야한다
		 */
		// TODO Auto-generated method stub	
	}
}
