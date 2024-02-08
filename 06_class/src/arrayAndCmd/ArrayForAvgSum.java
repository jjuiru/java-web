package arrayAndCmd;

public class ArrayForAvgSum {

	public static void main(String[] args) {
		int[][] array = { { 95, 86 }, // int[0][2] int[]
				{ 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		int sum = 0;
		double avg = 0.0;
		double count = 0;

//		for (int[] num : array) {
//			for (int num2 : num) {
//				sum += num2;
//				count++;
//			}
//			avg = sum / count;			    향상된 for문을 이용해서 하기
//		}

		for (int i = 0; i < array.length; i++) { // array의 행의 길이를 구함 (3)
			int rowSum = 0; // 합을 저장할 변수 설정
			int rowLength = array[i].length; // 열의 길이를 구함
			for (int j = 0; j < rowLength; j++) {
				rowSum += array[i][j];
			}
			count++;
			sum += rowSum; // 전체 합을 구함
		}
		avg = sum / count;

		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}

}
