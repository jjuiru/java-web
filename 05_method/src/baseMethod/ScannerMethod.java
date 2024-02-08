package baseMethod;

import java.util.Random;
import java.util.Scanner;

public class ScannerMethod {
	public static void multi(Scanner scanner) {
		
		System.out.print("첫번째 수:");
		String strNum1 = scanner.nextLine();
		System.out.print("두번째 수:");
		String strNum2 = scanner.nextLine();
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 * num2;
		System.out.println("곱셈 결과:" + result);

	}
	
	public static void sum(Scanner scanner) {  //상위 메소드에 초기화값을 받아서 쓴다
//		Scanner scanner = new Scanner(System.in); // new 명령어를 계속적으로 사용하면 안좋다.>메모리 차지>매개변수를 사용한다.
		//Scanner scanner; // 오류발생> 선언 초기화가 없음
		System.out.print("첫번째 수:");
		String strNum1 = scanner.nextLine();
		System.out.print("두번째 수:");
		String strNum2 = scanner.nextLine();
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈 결과:" + result);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		sum(scanner); // new Scanner를 하위 메소드에 전송
//		sum(scanner);
//		sum(scanner);
		
		multi(scanner);
		multi(scanner);
		multi(scanner);
		
	}
}
