package chap04;

public class LogicalLoopForWhile {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);// 10회 반복
		}
//--------------기본 for문		
		int k = 0;
		for (; k < 10;) {
			System.out.println(k);
			k++;
		}
//--------------for문을 while 형태로 분해			
		int l = 0;
		for (;;) {
			if (l >= 10) {
				break;
			}
			System.out.println(l);
			l++;
		}
//--------------for문을 조건까지 분해	

		System.out.println("-------------------");

		int i = 0; // 초기화>조건>내용
		while (i < 10) {
			System.out.println(i);
			i++; // while 은 실행후 내용을 유동적으로 바꿀 수 있다
		}
		System.out.println("-------------------");
		int j = 0;
		do {
			System.out.println(j);
			j++;
		} while (j < 10);
// do while은 반복문 위에 적어도 한번은 실행할 프로그램이 있을경우 사용한다.
	}
}
