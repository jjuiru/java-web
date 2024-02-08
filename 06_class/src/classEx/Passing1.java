package classEx;

public class Passing1 {

	public static void main(String[] args) {
		int x = 100;
		//x = 
		x=method1(x); // 호출
		System.out.println("x값 :"+x);
	}

	public static int method1(int x) {// 함수, 메소드
		x= x-50 ;
		return x; // x 도 지역변수 , 호출한 곳에 값을 복사해줘야 한다.    
	}
}
