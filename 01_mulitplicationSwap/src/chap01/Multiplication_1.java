package chap01;

import java.util.Scanner;

public class Multiplication_1 {
	public static void main(String[] grgs) {
		Scanner scan = new Scanner(System.in);
		String str;
		for (;;) {
			System.out.print("단을 입력(종료시 q):");
			str = scan.nextLine();
			int dan = Integer.parseInt(str); // q가 문자열이기 때문에 오류처리를 위해 형변환 해준다

			if (str.equals("q")) { // 입력한 값이 q와 같다면 반복문 종료
				break;
			}
			for (int i = 1; i <= 9; i++) { // 입력값이 9이하의 숫자라면
				System.out.printf("%d X %d = %d\n", dan, i, dan * i); // 단*i(1~9)는 단*i
			}
		}
		System.out.println("종료");
	}
}
