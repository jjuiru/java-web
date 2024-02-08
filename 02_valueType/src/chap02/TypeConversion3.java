package chap02;

public class TypeConversion3 {
 public static void main(String[]args) {
//	 byte var1= -129; 범위초과
	 byte var1= -128;
//	 byte var2= 128; 범위초과
	 byte var2= 127;
	 
//	 short var3= -32769; 범위초과
	 short var3= -32768;
//	 short var4= 32768; 범위초과
	 short var4= 32767;
	 
//	 int var5= 2150000000; 범위초과
	 int var5= 215000000;
//	 long var6= 2150000000; 오류. 기본값이 int 이기 때문에 L을 붙여 형변환
	 long var6= 2150000000L;
	 
	 char var7= 'a'; // 결과 a
	 System.out.println(var7); //'' 안에서는 한 글자만 가능 유니코드를 문자로 표현함
	 
	 String str= "a"; // 유니코드 변환 x 바이트 칸에 저장되는 것이 아니고 따로 저장된다.
	 //  "a\"b\"c\\" = a"b"c\ 로 출력된다.
	 
	 float var8= 0.25F; // 기본값이 더블이므로 F로 플로트로 표현
	 double var9= 1.8e307; //숫자에서 e는 10을 나타낸다.  e2는 10의 2승
	 System.out.println(var8);
	 System.out.println(var9);
	 	 
	 int v1=0b1011; //2진수 1x2(3) + 0x2(2)+ 1x2(1) +1x2(0) =8+0+2+1 =11
	 int v2= 0206; //8진수 2x8(2) +0x8(1)+ 6x8(0) = 128+0+6=134
	 int v3= 365; //10진수 365
	 int v4=0xb3; //16진수 11x16(1)+3x16(0)= 176+3 =179
	 
	 //** 16진수 A~F는 각 10~15의 값을 가진다
	 
	 System.out.println("v1:"+v1);
	 System.out.println("v2:"+v2);
	 System.out.println("v3:"+v3);
	 System.out.println("v4:"+v4);
	 
//	 ex)16진수 예시
	 int v5 = -0B111111111;   //-511
	 System.out.println(v5);
	 int v6 = 0XF;
	 System.out.println(v6); // 15
	 
	 
 }
}
