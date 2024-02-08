package loginStudentScore;

import java.util.Scanner;

public class LoginStudentScoreSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		boolean run2 = false;
		int studentNum = 0;
		int[] scores = null; //
//		System.out.println(scores.length);///////

		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 |");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch (menuNum) {
//-----------------------------------------------------------------------------------------메뉴1 학생수			
			case 1:
				System.out.println("<학생 수를 입력해주세요>");
				System.out.print("학생 수 입력: \n");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
				System.out.println("<학생 수는" + studentNum + "명 입니다>");
				run2=true;
				break;
//-----------------------------------------------------------------------------------------메뉴2 점수입력								
			case 2:
				if (run2==false) {
					System.out.println("<학생의 수를 먼저 입력해 주세요>");
					continue;
				}
				System.out.println("<점수 입력해주세요>");
				for (int i = 0; i < scores.length; i++) {
					System.out.print("점수" + (i + 1) + ":");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
				break;
//-----------------------------------------------------------------------------------------메뉴2 점수입력								
			case 3:
				System.out.println("<점수리스트>");
				for (int i = 0; i < scores.length; i++) {
					System.out.println("점수" + (i + 1) + ":" + scores[i]);
				}
				break;
//-----------------------------------------------------------------------------------------메뉴2 점수입력								
			case 4:
				System.out.println("<분석>");
				int max = 0, sum = 0;
				for (int num : scores) {
					if (max < num) {
						max = num;
					}
					sum += num;
				}
				double avg = (double) sum / studentNum;
				System.out.println("최고점수: " + max);
				System.out.println("총합: " + sum);
				System.out.println("평균: " + avg);
				break;
//-----------------------------------------------------------------------------------------메뉴2 점수입력						
			case 5:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
