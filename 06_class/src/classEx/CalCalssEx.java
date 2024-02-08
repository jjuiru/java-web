package classEx;

public class CalCalssEx {

	
	public static void main(String[] grgs) {
//	power();// static이 아니라 오류
		CalClass.sx=500;
		CalClass cal = new CalClass(); // cal은 객체변수(주소만 가지고있다)
		cal.power();
		cal.x = 100; // 클래스안의 변수 x의 값을 변경
		cal.printX(); // 변수값 없을땐 0출력, 이후 위에 선언된 변수값이 출력된다.
		
		CalClass cal2 =new CalClass(); //cal2에는 x값이 없어서 기본값 0출력
		System.out.println(cal2.x);
		cal2.power();
		
//		Cal.sx=500;  클래스 안에 static 변수를 선언해서 모든 곳에 사옹가능
//		cal.x = 100; 지역 변수기 때문에 지정된 클래스 안에서만 사용가능
		
	}
}
