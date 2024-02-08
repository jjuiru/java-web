package arrayAndCmd;

public class Array_Class {
	int sum1(int[] values) {
		int sum = 0;

		for (int val : values) { // 향상 포문
			sum += val;
		}
//		for(int i=0; i<values.length; i++) { //일반 포문
//			sum+= values[i];		
//		}
		return sum;
	}

	int sum2(int... values) {
		int sum = 0;

		for (int val : values) { // 향상 포문
			sum += val;
		}
		return sum;
	}
}
