package chap04;

import java.util.Scanner;

public class IfSwitch {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		int grade = score / 10;

		switch (grade) {
		case (10):
			System.out.println("학점은 A입니다.");
			break;
		case (9):
			System.out.println("학점은 A입니다.");
			break;
		case (8):
			System.out.println("학점은 B입니다.");
			break;
		case (7):
			System.out.println("학점은 C입니다.");
			break;
		default:
			System.out.println("학점은 D입니다.");
			break;
		}
	}
}
