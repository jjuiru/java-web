package exeption;

public class NumFormatEx {

	public static void main(String[] args) {
		try {
			int x= Integer.parseInt("aa"); //숫자로 변환이 안딘다.
			System.out.println(x);
		}catch(NumberFormatException e){
			System.out.println("예외가 발생했습니다.");
		}
	}
}
