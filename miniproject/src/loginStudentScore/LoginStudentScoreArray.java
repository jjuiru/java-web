package loginStudentScore;

import java.util.Scanner;

public class LoginStudentScoreArray {

	public static void main(String[] args) {
		boolean run = true; // 메뉴실행 변수
		boolean run2 = false; // 로그인 실행
		boolean run3 = false; // 점수입력 실행
		int studentNum = 0; // 입력할 학생의 수
		int[] scores = null; //점수값은 우선 초기화함 정수이므로 0값으로 들어감
		Scanner scan = new Scanner(System.in); // 스캐너 메소드 생성

		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.학생수 |2.점수입력 |3.점수리스트 |4.분석 |5.종료 |");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(scan.nextLine());
			
//-----------------------------------------------------------------------------------------메뉴1 학생수
			if (selectNo == 1) {

				System.out.println("<학생의 수를 입력하시오>");
				studentNum = Integer.parseInt(scan.nextLine()); // 문자열이므로 integer로 강제 형변환
				scores = new int[studentNum]; //scores배열에 학생수의 인덱스값 부여
				System.out.println("<학생 수는" + studentNum + "명 입니다>");
				run2 = true;
//-----------------------------------------------------------------------------------------메뉴2 점수입력
			} else if (selectNo == 2) {
				if (!run2) {
					System.out.println("<학생의 수를 먼저 입력해 주세요>");
					continue;
				} else {
					
					for (int i = 0; i < scores.length; i++) {
						System.out.print((i + 1) + "번 학생의 점수를 입력하시오");
						scores[i] = Integer.parseInt(scan.nextLine());
						System.out.println(scores[i] + "를 입력했습니다.");
						run3 = true;
					}
				}
//-----------------------------------------------------------------------------------------메뉴3 점수리스트
			} else if (selectNo == 3) {
				if (!run2) {
					System.out.println("<학생의 수와 점수를 먼저 입력해 주세요>");
					continue;
				}
				if (!run3) {
					System.out.println("<점수를 먼저 입력해 주세요>");
					continue;
				}
				System.out.println("<점수 리스트>");
				for (int i = 0; i < scores.length; i++) {
					System.out.println((i + 1) + "번" + scores[i]);
				}
//-----------------------------------------------------------------------------------------메뉴4 점수분석
			} else if (selectNo == 4) {
				if (!run2) {
					System.out.println("<학생의 수와 점수를 먼저 입력해 주세요>");
					continue;
				}
				if (!run3) {
					System.out.println("<점수를 먼저 입력해 주세요>");
					continue;
				}
				int num = 0;
				int sum = 0;
				double avg = 0;
				for (int i = 0; i < scores.length; i++) {
					if (num < scores[i]) {
						num = scores[i];
					}
					sum += scores[i];
					avg= sum/(double)(scores.length);
				}
				System.out.println("<최고점수>\n" + num);
				System.out.println("<총합>\n" + sum);
				System.out.println("<평균>\n" + (double)avg);
//---------------------------------------------------------------------------------------메뉴5 프로그램 종료
			} else if (selectNo == 5) {
				System.out.println("<성적 프로그램을 종료합니다>");
				run = false;
			}

		}

	}
}