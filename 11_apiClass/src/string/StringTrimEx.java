package string;

public class StringTrimEx {

	public static void main(String[] args) {
		String str = "            가 나   다                ";
		System.out.println(str.length()); // 공백포함 35바이트?
		System.out.println(str.trim().length()); //공백제거 7바이트
		
		
		String ss= 10+"30";
		String str1= String.valueOf(10);
		System.out.println(ss); 
		System.out.println(str1+30); //문자열
		
	}
}
