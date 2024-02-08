package abstractAll;

public class PhoneEx {

	public static void main(String[] args) {
		Phone phone = new SmartPhone2(10,20); 
		System.out.println(phone.x);
		/* Phone인 추상클래스 자체는 인스턴스화 할 수 없다.
		 * 따라서 인스턴스를 만들기 위해 상속받은 자식클래스를 사용해야 한다 > 상속 강제성
		 */
		if(phone instanceof SmartPhone ) {
			SmartPhone sp=(SmartPhone) phone;
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		/* 1과 2는 다른 객체이기 때문에 실패가 뜬다
		 */
	}
}
