package chap02;

public class TypeConversion2 {
	public static void main(String[] args) {
		byte a = 10;
		char b = 'A';
		String c = "A";

//int inv=a;
//int inv=b;
// short shov=b; 에러
//double dov=a;
//char var= (char)c;

		char c1 = 'a'; // a의 유니코드 97 +1 하면 98인 B
		char c2 = (char) (c1 + 1); // int로 변환돼서 오류발생
		System.out.println(c2); // b

		int x = 5;
		int y = 2;
		double result = (double) x / y;
		System.out.println(result);

		double var = 3.5;
		double var1 = 2.7;
		int sum = (int) (var + var1); // 먼저 더해져서 6.2 > 버려져서 6 출력
		System.out.println(sum);

		String n = 2 + "" + 3;
		System.out.println(n);

		long v1 = 2L;
		float v2 = 1.8f;
		double v3 = 2.5;
		String v4 = "3.9";
		int sum2 = (int) (v1 + v2 + v3 + (int) Double.parseDouble(v4));// String을 int값으로 변환(소숫점 날리기) 이후 합을int로 변환
		System.out.println(sum2);// 9

//byte value=
//int value= Integer.p
//float value= Float.parseFloat();
//double value= Double.parseDouble();

	}
}
