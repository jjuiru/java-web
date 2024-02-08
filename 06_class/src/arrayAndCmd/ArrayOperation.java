package arrayAndCmd;

import java.util.Scanner;

public class ArrayOperation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = null;
		int[] arr2 = null;
		
		System.out.println("크기:");
		int size = scan.nextInt();
		arr2 = new int[size];
		
		arr= arr2; // 힙에 있는 메모리 주소를 복사함
		
		
		for(int i=0; i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
		arr2[1]=100;
		System.out.println(arr[1]); // arr도 주소값이 arr2와 같기 때문에 같은 값이 나온다
		
	}

}
