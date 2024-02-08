package design.pattern.carPactory;

import java.util.Scanner;

import tirePactoty.CarTire;

public class Ex {

	public static void main(String[] args) {
//		CarFactory carFactory = new KoreaCarFactory();
		// 추상클래스(자동차 공장)에 한국공장을 넣음 미국산 생산하려면 자식 타입을 StateCarFactory로 바꾼다.
		Scanner scan = new Scanner(System.in);
		CarFactory carFactory = null;

		System.out.println("생산하려는 차종을 선택(1.국산차,2.미국차) : ");
		System.out.println("선택 : ");

		String key = scan.nextLine();
		switch (key) {
		case "1":
			carFactory = new KoreaCarFactory();
		case "2":
			carFactory = new StateCarFactory();
		default:
			System.out.println("다시 선택하세요.");
			break;
		}

		TireProduct tireProduct = carFactory.createTire();
		// 추상클래스(타이어 공장)에
		DoorProduct doorProduct = carFactory.cteateDoor();

		String tire = tireProduct.makeAssemble();
		String door = doorProduct.makeAssemble();
		System.out.println(tire);
		System.out.println(door);
	}
}
