package string;

import java.util.ArrayList;
import java.util.List;

public class StringJoinEx {

	public static void main(String[] args) {
		List<String>list= new ArrayList<>();
		// String 타입이 아니라면 toString정의를 해줘야 한다.
		list.add("나는");
		list.add("라면을");
		list.add("좋아합니다");
		
		String msg= String.join(" ", list);
		//앞의 문자열을 뒤의 문자 배열 사이에 합치는 기능
		System.out.println(msg);
		
		String msg2= String.join(".","www","naver","com");
		System.out.println(msg2);

	}
}
