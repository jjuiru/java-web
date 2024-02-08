package polymorphism;

public class CarTireMaxEx {
public static void main(String[]args) {
	CarTireMax carTireMax = new CarTireMax(); //car 객체 생성
	
	for(int i=1;i<=5;i++) {  //car객체의 run메소드 5회 반복 실행
		int problemLocation= carTireMax.run();
		
		switch(problemLocation) {
		case 1 :
			System.out.println("앞왼쪽 HankookTire로 교체");
			carTireMax.frontLeftTire=new CarTireHankookTire("앞왼쪽",15);
			break;
		case 2 :	
			System.out.println("앞오른쪽 KumhoTire로 교체");
			carTireMax.frontRightTire=new CarTireHankookTire("앞오른쪽",15);
			break;
		case 3 :
			System.out.println("뒤왼쪽 HankookTire로 교체");
			carTireMax.backLeftTire=new CarTireHankookTire("뒤왼쪽",15);
			break;
		case 4 :
			System.out.println("뒤오른쪽 KumhoTire로 교체");
			carTireMax.backRightTire=new CarTireHankookTire("뒤오른쪽",15);
			break;
		}
		System.out.println("-------------------------------"); //1회 시전시 출력되는 내용 구분
	}
}
}
