package chap04;

public class BreakEx {

	public static void main(String[] args) {
		Outter: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == 3 && j == 3) {
					break Outter;// ddd{} break ddd; >
				}
				System.out.printf("(%d, %d)\n", i, j);
			}
		}

//		 for (int i=0; i< 100; i++) {
//			 if (i==55) {
//				 //System.out.println(i);
//				// break; //루프를 빠져나감
//				 continue; //루프의 시작시점으로 돌아감 55는 출력되지 않고 56부터 진행
//			 }
//			 System.out.println(i);
//		 }
//		 System.out.println("종료");
	}
}
