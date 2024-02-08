package scoreinput;

import java.util.Scanner;

public class ScoreInputIfElse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("학점을 입력하세요>");
		int score = scan.nextInt();

		if (score >= 90) {
			System.out.println("점수가100~90점 입니다.");
			System.out.println("등급은 A입니다.");
		} else if (score >= 80) {
			System.out.println("점수가80~89입니다.");
			System.out.println("등급은 B입니다.");
		} else if (score >= 70) {
			System.out.println("점수가70~79입니다.");
			System.out.println("등급은 C입니다.");
		} else {
			System.out.println("점수가70점 미만입니다.");
			System.out.println("등급은 F입니다.");
		}

		System.out.print("지현 입력>");// 처리(UI)
		int v1 = scan.nextInt();// 입력
		System.out.print("수현 입력>");// 처리(UI)
		int v2 = scan.nextInt();// 입력
		System.out.print("하영 입력>");// 처리(UI)
		int v3 = scan.nextInt();// 입력
		System.out.print("경수 입력>");// 처리(UI)
		int v4 = scan.nextInt();// 입력
		System.out.print("상훈 입력>");// 처리(UI)
		int v5 = scan.nextInt();// 입력

		System.out.printf("지현:%d,수현:%d,하영:%d,경수:%d,상훈:%d\n", v1, v2, v3, v4, v5);

		if (89 < v1 && v1 <= 100) {
			System.out.printf("지현:A ");
		} else if (79 < v1 && v1 <= 90) {
			System.out.printf("지현:B ");
		} else if (69 < v1 && v1 <= 80) {
			System.out.printf("지현:C ");
		} else if (v1 < 70) {
			System.out.printf("지현:F ");
		}
		if (89 < v2 && v2 <= 100) {
			System.out.printf("수현:A ");
		} else if (79 < v2 && v2 <= 90) {
			System.out.printf("수현:B ");
		} else if (69 < v2 && v2 <= 80) {
			System.out.printf("수현:C ");
		} else if (v2 < 70) {
			System.out.printf("수현:F ");
		}
		if (89 < v3 && v3 <= 100) {
			System.out.printf("하영:A ");
		} else if (79 < v3 && v3 <= 90) {
			System.out.printf("하영:B ");
		} else if (69 < v3 && v3 <= 80) {
			System.out.printf("하영:C ");
		} else if (v3 < 70) {
			System.out.printf("하영:F ");
		}
		if (89 < v4 && v4 <= 100) {
			System.out.printf("경수:A ");
		} else if (79 < v4 && v4 <= 90) {
			System.out.printf("경수:B ");
		} else if (69 < v4 && v4 <= 80) {
			System.out.printf("경수:C ");
		} else if (v4 < 70) {
			System.out.printf("경수:F ");
		}
		if (89 < v5 && v5 <= 100) {
			System.out.printf("상훈:A\n");
		} else if (79 < v5 && v5 <= 90) {
			System.out.printf("상훈:B\n");
		} else if (69 < v5 && v5 <= 80) {
			System.out.printf("상훈:C\n");
		} else if (v5 < 70) {
			System.out.printf("상훈:F\n");
		}

	}
}
