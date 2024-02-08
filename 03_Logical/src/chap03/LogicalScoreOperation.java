package chap03;

import java.util.Scanner;

public class LogicalScoreOperation {

	public static void sum(Scanner scan) {

		System.out.printf("점수를 입력하세요>");
		int score1 = scan.nextInt();
		char grade = (score1 > 90) ? 'A' : ((score1 > 80) ? 'B' : 'C'); // if 와 같다.
// 타입을 바꿔 쓸 수 있다. String> "합격" "불합격" 등		
		// if문으로 쓸 경우
//			if(score>90) {
//				grade='A';						
//			}else if(score>80) {
//				grade='B;
//			}else {
//				grade='c';
//			}

		System.out.println(score1 + "점은" + grade + "등급입니다.");

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		sum(scan);
		sum(scan);
		sum(scan);
		sum(scan);
		sum(scan);
		System.out.println("종료합니다.");
	}

}

// 5회까지 반복후 0을 입력하면 종료