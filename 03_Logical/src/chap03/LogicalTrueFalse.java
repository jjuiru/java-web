package chap03;

public class LogicalTrueFalse {
public static void main(String[]args) {
	int charCode='a'; //65
	
	if((charCode>=65)&(charCode<=90)) { //모두 참일 경우 참이면 출력
		System.out.println("대문자군요");
	}
	if((charCode>=97)&&(charCode<=122)) {//앞이 거짓이면 뒤는 비교하지 않음> 둘다 참일때 출력
		System.out.println("소문자군요");
	}
	if((charCode<48)&& !(charCode>57)) {//뒤가 거짓일 경우 모두 참(!)으로 출력
		System.out.println("0~9 숫자군요");
	}	
	int value=6;
	
	if((value%2==0)|(value%3==0)) {
		System.out.println("2또는 3의 배수군요");
	}
	if((value%2==0)|| (value%3==0)) {
		System.out.println("2또는 3의 배수군요");
	}
	
}
}
