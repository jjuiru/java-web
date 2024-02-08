package abstractAll;

public class SmartPhone2 extends Phone {
	int y;
	// System.out.println(x);  실행 코드들은 메소드 안에 들어가야 한다.	
	public SmartPhone2(int x, int y) { // 생성자
		super(x);
		this.y = y;
	}
	
	public void printX() {
		System.out.println(x);
	}

	@Override
	public void ring() {
		// TODO Auto-generated method stub		
	}
}
