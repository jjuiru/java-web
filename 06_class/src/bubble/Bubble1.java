package bubble;

public class Bubble1 {
	public static void printArr(int a[]) {
		for (int n : a) {
			System.out.print(n + ",");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int a[] = { 10, 3, 1, 4, 2 };
		
		printArr(a);   //출력
		for (int i = 0; i < a.length; i++) { // 전체 반복 횟수
			for (int j = 0; j < a.length - 1; j++) { //
				if (a[j] > a[j + 1]) { // 두개씩 비교하는 프로그램
					// 서로 값 바꾸기(swap)
					int tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
					printArr(a);  //출력
				} // if
			} // 두번째 포문
		} // 첫번째 포문
		printArr(a);   //출력
	}// 메인메소드
}
