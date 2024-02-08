package baseMethod;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		
//		int[] scores= {83,90,87};       //선언부 int의 배열인 변수 scores 를 선언한다.
//		System.out.println(scores.length); // 값은 3
//		혹은
//		scores[0]=83;
//		scores[1]=90;
//		scores[2]=87;

//      보통은 아래와 같이 입력값에 따라 달라지도록 만든다.		
		Scanner scan= new Scanner(System.in);
		System.out.println("생성할 값:");
		int num=scan.nextInt();
			
		
        // 아래는 배열선언후 인덱스의 값을 초기화 하는 작업이다.
		int[] scores = new int[3]; // 선언부 int 배열인 변수 scores 는 int[3] 의 인덱스값을 갖는다.
		String[] names = new String[5];
		
		
		//인덱스에 저장된 값을 확인하기 위해서 아래와 같이 실행한다.
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
//		System.out.println(scores[3]); // 3번 인덱스가 없기 때문에 오류

		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}

		String[] names1 = new String[5];
		for (int i = 0; i < names1.length; i++) {
			System.out.println(names1[i]);
		}

	}

}
