package chap02;

public class TypeConversion1 {
 public static void main(String[]args) {
	 
	 // 형변환 문자열><실수
	 String str3= "3.14";
	 System.out.println(str3+3.1); //문자열일때 3.143.1
	 double value= Double.parseDouble(str3); // 문자열을 실수로 바꾸기
	 System.out.println(value+3.1); //실수로 바꿨을때   6.24
	 
	 
	 // 형변환 문자열><정수
	 String str2 = ""+10+2; //문자열로 만들기   102
	 System.out.println(str2);
	 int num1= Integer.parseInt(str2); // 정수로 만들기
	 
	 String str = 10+2+"";// 꼼수  12
	 System.out.println(str);
	 
	 String str1= String.valueOf(10+2); // 정수>문자열로 전환 형변환
	 
	 System.out.println("---------------------"); 
	 
	 
	 byte value1= 10; 
	 int value2= 100;
//	 byte sum= value1+value2;  오류 하나는 int기 때문
	 byte sum= (byte)(value1+value2);
	 System.out.println(sum);
	 
	 int intValue=10;
	 double doublevalue=5.5;
//	 int result= intValue+doublevalue;
	 int result= (int)(intValue+doublevalue);	 
	 System.out.println(result);
	 
	 System.out.println(1/2.0);
	 // 위와 아래는 같다
	 int x=1;
	 int y=2;
	 double result2=x/(double)y;
	 System.out.println(result2);
	 
	 System.out.println("---------------------");  
	 
	 
	 byte var1= 127;
	 int var2= 129;
	 long var3= 100000000L;
	 float var4=var3;
	 System.out.println(var4);
	 
	 var1= (byte) var2; // 작은값에 큰값을 넣을 수는 있지만 값이 깨질 수 있다.(온전하게 출력이 안될수있다)
	 System.out.println(var1);
 }
}
