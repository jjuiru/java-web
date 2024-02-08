package arrayAndCmd;

import java.util.Scanner;

public class ArrayIndexNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = { 10, 3, 1, 4, 2 };
		int i = 0;

		System.out.println("{ 10,3,1,4,2 }중 인덱스 번호를 원하는 값을 넣으세요 >");
		int num = scan.nextInt();

		for (i = 0; i < a.length; i++) {
			if (a[i] == num) {
				System.out.println(i);
			}
		}

//---------------------------------------------------		
		for (i = 0; i < a.length; i++) {
			if (a[i] == 4) {

				System.out.println("a[" + i + "]");
			}
		}

//---------------------------------------------------		swap
		int num2 = 0;
		int x = 10;
		int y = 20;

		System.out.println(x + "," + y);

		num2 = x; // num2 10
		x = y; // x 20
		y = num2; // y=10

		System.out.println(x + "," + y);

	}

}