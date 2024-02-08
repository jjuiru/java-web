package lottoRanDuplicateRemove;

import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			int num = (int) (Math.random() * 10) + 1; // (Math.random()*45+1)를 int로 형변환
			int v1= num;
			if (v1 == num) {
				System.out.println(v1);
			} else if (v1 != num) {
				System.out.println();
			}
		}
//			System.out.println(v1);
//난수 발생 2번
//		}
//		System.out.println("-------------------------");
//		Random rd = new Random();
		for (int i = 0; i < 6; i++) {
//	 System.out.println(rd.nextInt(10)); // 0~9
//	 System.out.println(rd.nextInt(10)+1); // 1~10
//			System.out.println(rd.nextInt(10) + 1); // 1~45
		}
	}
}
