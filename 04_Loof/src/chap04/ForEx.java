package chap04;

public class ForEx {

	public static void main(String[] args) {
		String star = "*";
		for (int i = 0; i < 4; i++) { // 전체반복 '줄'
			for(int j=3; j>= 0; j--) {
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.print(star);
				}
			}
			System.out.println();
		}

	}

}
