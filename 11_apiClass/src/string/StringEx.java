package string;

import javax.swing.plaf.synth.SynthToggleButtonUI;

public class StringEx {

	public static void main(String[] args) {
		String aaa= "aaa";
		String bbb= "bbb";
		long time1 = System.currentTimeMillis(); //시간 체크	
		//----1
		StringBuilder sb= new StringBuilder();
		sb.append(aaa);
		sb.append(bbb);
		// append() 메소드는 StringBuilder 객체의 끝에 문자열이나 다른 데이터를 추가한다.
		//즉, 기존에 있는 문자열 끝에 새로운 문자열을 이어붙이는 역할을 한다.
		System.out.println(sb);
		long time2 = System.currentTimeMillis();
		System.out.println("연산시간: " + (time2 - time1) + "밀리세컨드");//1
		
		//----2
		String str= aaa+bbb;
		System.out.println(str);
		long time3 = System.currentTimeMillis();
		System.out.println("연산시간: " + (time3 - time2) + "밀리세컨드"); //7
		
		//----3
		String str1= aaa.concat(bbb);
		//Java에서 문자열을 이어붙이는 메소드입니다. 
		//이 메소드는 aaa 문자열의 끝에 bbb 문자열을 이어붙여서 새로운 문자열을 생성.
		//기존의 aaa 문자열은 변경되지 않는다.
		System.out.println(str1);	
		long time4 = System.currentTimeMillis();//끝나는 시간 체크	
		System.out.println("연산시간: " + (time4 - time3) + "밀리세컨드"); //1
		
	}
}
