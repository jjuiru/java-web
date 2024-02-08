package arrayAndCmd;

public class ArrayPassing {

	public static void increase(int a[]) {
		for (int i = 0; i < a.length; i++) {
			a[i]++; // i 인덱스 값이 반복할수록 값이 1씩 증가
		}
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };
//		increase(a); // 1씩 증가된 값이 생성
		increase(new int[] { 1, 2, 3, 4 }); {
			for (int n : a) {
				System.out.println(n);
			}
		}

	}
}
