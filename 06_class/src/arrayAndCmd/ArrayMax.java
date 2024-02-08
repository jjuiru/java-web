package arrayAndCmd;

public class ArrayMax {

	public static void main(String[] args) {
		int[] a = { 1, 3, 10, 2, 8 };

		int sum = 0;
		int max = 0;
		double avg = 0.0;
		double count = 0;

		// 향상된 포문
		for (int num : a) {
			sum += num;
			count++;
			if (max < num) {
				max = num;
			}
		}

		// 포문
//		for (int i = 0; i < a.length; i++) {
//			sum += a[i];
//			count++;
//			avg = sum / count;
//			if (max < a[i]) { 
//				max = a[i];
//			}
//		}                    
		avg = sum / (double) a.length;
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		System.out.println("max : " + max);

	}

}
