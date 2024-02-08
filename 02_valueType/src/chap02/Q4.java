package chap02;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {

		// ----예제1.다음 코드에서 컴파일 에러가 발생하는 위치와 이유를 설명해보시오

		byte b = 5;
//	    b=-b;
		b = (byte) -b;
		int result = 10 / b;
		System.out.println("예제1: " + result);

		// ----예제2.출력결과는 무엇인가요
		int x = 10;
		int y = 20;
		int z = (++x) + (y--); // 11+20> z에 20을 먼저 할당함
		System.out.println("예제2: " + z);

		// ----예제3.다음 코드에서 stop이 true일때 반복을 멈추고 싶다. while은 조건식이 true가 될 때 중괄호 안의 실행문을
		// 반복해서 실행한다.
		// 맞는 조건식을 작성하시오

		boolean stop = true;
		while (!stop) {
			System.out.println("!");
		}

		// ----예제4.534자루의 연필을 30명의 학생들에게 똑같이 나눠줄때 1인 몇개를 가지는지 몇개가 남는지 구하는 코드 알맞은 코드작성

		int pencils = 534;
		int students = 30;

		// 1명이 가지는 연필 개수
		int pencilsPerStudent = 534 / 30;
		System.out.println("예제4_1: " + pencilsPerStudent);
		// 남은 연필 개수
		int pencilsLeft = 534 % 30; // %는 나머지 구하는 코드
		System.out.println("예제4_2: " + pencilsLeft);

		// ----예제5. 5를 기대했는데 4가 나왔다. 무엇이 잘못되었는가
		int var1 = 5;
		int var2 = 2;
//	    double var3= var1/var2; //2.0
		double var3 = (double) var1 / var2; // 2.5
		int var4 = (int) (var3 * var2); // 5

		System.out.println("예제5: " + var4); // 5

		// ----예제6.십의자리 이하 버리는 코드. 변수v의 값이 356이면 300이 나올수 있도록 코딩하시오(연산자만 사용)

		int v = 356;
		System.out.println("예제6_1: " + (v / 100 * 100));// 연산후엔 인트로 전환되기 때문에 소숫점이 사라진다.
		System.out.println("예제6_2: " + (v - 56));

		// ----예제7."10%입니다"를 기대했는데"10%가 아닙니다"가 나왔다. 무엇이 잘못되었는가

		float v1 = 10f; // 10.0
		float v2 = v1 / 100; // 0.1
//		System.out.println(v2);
		if (v2 == 0.1f) { // 0.1만 한다면 플로트 0.1이 아니기 때문
			System.out.println("10%입니다.");
		} else {
			System.out.println("10%가 아닙니다.");
		}

		// ----예제8.사다리꼴의 넓이 구하는 코드입니다. 정확한 소수 자리가 나올수 있는 코드를 만드시오
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((lengthTop + lengthBottom) * (double) height / 2);
		System.out.println("예제8: " + area);

		// ----예제9.입력된 첫번쨰 수에 두번쨰 수를 나눈 결과를 "결과:값"으로 출력하되, 두번재 수에0 혹은
		// 0.0이 입력되었을 경우 "결과:무한대"가 출력되도록 코드를 작성해보세요

//		Scanner scan = new Scanner(System.in);
//		System.out.printf("첫 번째 수: ");
//		String v3 = scan.nextLine();
//		double v4 = Double.parseDouble(v3);
//
//		System.out.printf("두 번째 수: ");
//		String v5 = scan.nextLine();
//		double v6 = Double.parseDouble(v5);
//
//		if (v6 == 0) {
//			System.out.println("결과:무한대");
//		} else if (v6 == 0.0) {
//			System.out.println("결과:무한대");
//		} else {		
//		System.out.println("결과: " + (double) (v4 / v6));
//		}
//		
		
		
		// ----예제10. 반지름이 10인 원의 넓이 var2, ".", var3을 +연산해서 원주율을 얻고 계산하려합니다.
		 int b1=10;
		 int b2=3;
		 int b3=14;
		 double pi= ((b1*b1)*Double.parseDouble(b2+"."+b3));
		 System.out.println("예제10: " +pi);
		 
		 

		 // ----예제11. 이름은 문자열-java 패스는 정수(int)-12345 로그인 성공 실패
		 
//		 Scanner scanner= new Scanner(System.in);
//		 
//		 System.out.print("아이디:");
//		 String name= scanner.nextLine();
//		 
//		 System.out.print("패스워드");
//		 String strPassword =scanner.nextLine();
//		 int password= Integer.parseInt(strPassword);
//		 
//		 if(name.equals("java")) {
//			 if(password== 12345) {
//				 System.out.println("로그인 성공");
//			 } else {
//				 System.out.println("로그인 실패: 패스워드 다름");
//			 } 
//			 
//			 }else {
//				 System.out.println("로그인 실패: 아이디 다름");
//			 }
		 
		 // ----예제12. 다음 코드는 비교,논리연산자의 복합연산식이다. 출력결과를 넣어라
		 
		 int c=10;
		 int d=5;
		 
		 System.out.println((c>7) && (d<=5)); //------- false
		 System.out.println((c%3==2) || (d%2 !=1)); //------ true
		 
		 // ----예제13. =문으로 변형하라
		 
		 int value=0;
		 
		 value= value +10; //----- value+=10;
		 value= value -10; //----- value-=10;
		 value= value *10; //----- value*=10;
		 value= value /10; //----- value/=10;
		 
		 // ----예제14.다음 코드 출력값음?
		 
		 int score= 85;
		 String rs=(!(score>90))? "가":"나"; // false
		 System.out.println(rs); //"가"
	}
}