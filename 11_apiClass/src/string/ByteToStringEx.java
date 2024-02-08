package string;

public class ByteToStringEx {

	public static void main(String[] args) {
		String sub="자바 프로그래밍";
		System.out.println(sub.charAt(3));
		//3번째 인덱스의 값을 추출해낸다.
		
		byte[] bytes= {72,101,108,108,111,32,74,97,118,97};
		// 한글은 아스키 코드로 나타내는게 불가
		String str= new String(bytes,0,2);
		// 시작 인덱스 부터 2개
		System.out.println(str);
		
		char[] chars= {'H','e','l','l','o','헬','로'};
		//한글은 가능
		str= new String(chars);
		System.out.println(str);
				
		}

	}


