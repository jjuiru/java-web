package exeption;

//public class ArrEx {
//	public static void main(String[] args) {
//		int[] arr=new int[4]; //4개의 인덱스
//		for (int i=0; i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
////		System.out.println(arr[4]);
//	}
//}

public class ArrEx{
	public static void main(String[]args) {
		try {
			String str= args[0]; // arg에 입력값이 1개 있어서 출력성공
			String str1=args[1];
			System.out.println(str);
			System.out.println(str1);// 값이 없어서 오류
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getLocalizedMessage());
			System.out.println("예외발생!");
		}
	}
}

