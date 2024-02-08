package arrayAndCmd;

import java.util.Scanner;

public class ArrayInArray {

	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		double avg = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("index 값을 입력하세요 :");
		int index = scan.nextInt();
		System.out.println("index2 값을 입력하세요 :");
		int index2 = scan.nextInt();
		int[][] scores = new int[index][index2];

		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.printf("(%d, %d)의 값을 입력하세요: ", i, j);
				scores[i][j] = scan.nextInt();				
			}
		}
		
		for (int[] num: scores) {
			for (int val: num) {
				sum += val;	
				count++;
			}					//??? 향상된 포문을 쓸수 없을까??? > 쓸수있다!!!!
		}
			    								
//			for (int i = 0; i < scores.length; i++) {
//			for (int j = 0; j < scores[i].length; j++) {
//				sum += scores[i][j];
//				count++;
//			}
//		}		
		
		avg = sum / (double) count;
		System.out.println("총합 :" + sum);
		System.out.println("평균 :" + avg);

	}

}
