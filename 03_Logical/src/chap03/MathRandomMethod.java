package chap03;

import java.util.Scanner;
import java.util.Random;

//ctl shft o
public class MathRandomMethod {

	public static void ex1() {
		Scanner scan = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {
			int v1 = (int) (Math.random() * 10) + 1;
			int v2 = (int) (Math.random() * 10) + 1;
			System.out.printf("%d X %d 는 무엇인가요?", v1, v2);
			int sum = scan.nextInt();// 입력
			int U = (v1 * v2);
			if (sum == U) {
				System.out.println("정답입니다!");
				break;
			} else {
				System.out.println("틀렸습니다!");
			}
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			ex1();
		}
		System.out.println("종료");
	}
}