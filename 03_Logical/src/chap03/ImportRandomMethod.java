package chap03;

import java.util.Random;
import java.util.Scanner;

public class ImportRandomMethod {
	public static int create(Random random) {
		return random.nextInt(10) + 1; // 한자리 랜덤 정수
	}

//----------------------------------------------------------------------	
	public static void multiple() {

		Random random = new Random();
		Scanner scan = new Scanner(System.in);

		int num1 = create(random); // 한자리 랜덤 정수
		int num2 = random.nextInt(10) + 1; // 두자리 랜덤 정수
		int multi = num1 * num2;

		System.out.printf("%d X %d 는 무엇인가요?", num1, num2);
		for (;;) {
			System.out.println("입력>");
			int input = Integer.parseInt(scan.nextLine());
			if (input == multi) {
				System.out.println("정답입니다!");
				break; // 루프 종료 조건
			} else {
				System.out.println("틀렸습니다!");
			}
		}
	}
//---------------------------------------------------------------------
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			multiple();
		}
		System.out.println("종료");
	}

}
