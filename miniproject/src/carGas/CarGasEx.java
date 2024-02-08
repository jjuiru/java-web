package carGas;

import java.util.Scanner;

public class CarGasEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CarGas car = new CarGas(); // 스캔값 설정 boolean gasState = car.isLeftGas(); // 가스가 있는지 확인하는 메소드 호출, 그리고
									// gasState선언
		boolean key = true; // 시동을 건다
		String yesno;
//----------------------------가스 주입		

		while (key) {
			System.out.println("주입할 기름의 양을 입력하세요:");
			int push = Integer.parseInt(scan.nextLine());
			car.setGas(push); // 기름량 설정

//----------------------------출발 가능한지 여부		
			boolean gasState = car.isLeftGas(); // 가스값이 0일때와 실행종료
			if (gasState)// 가스가 있었다면 실행 아니면 실행하지 않음
			{
				System.out.println("출발합니다.");
				car.run(); // 가스량 확인 메소드 호출
			} else {
				System.out.println("운행이 불가합니다.");
				System.out.println("기름을 주입해 주세요.");
				continue;
			}
//----------------------------출발 가능한지 여부		

//			if (car.isLeftGas()) { // 가스량이 없으면 false 있으면true
//				System.out.println("gas를 주입할 필요가 없습니다.");
//				break;
//			} else 

			if (!car.isLeftGas()){
				System.out.println("gas를 주입해주세요.");
				System.out.println("가스를 주입하시겠습니까?(Y/N):");
				yesno = scan.nextLine();
				if (yesno.equals("Y") || yesno.equals("y")) {
					continue;
				}
				if (yesno.equals("N") || yesno.equals("n")) {
					System.out.println("운행을 종료합니다.");
				}
				break;
			}
		}
	}
}
