package string;

import java.io.UnsupportedEncodingException;

public class StringGetBytesEx {

	public static void main(String[] args) {
		String str = "안녕하세요	abc";
		
		//--------문자열을 두번째 문자열로 변경을 한다.
		String nstr= str.replace("abc", "감사합니다");
		System.out.println(str);
		System.out.println(nstr);
		// 새로운 문자열을 생성한다. 고치는거 x
		
		
		//----------인덱스 출력
		System.out.println(str.length());
		int index = str.indexOf("세요");
		System.out.println(index);
		
		int index1 = str.indexOf("가요");
		System.out.println(index1);
		//단어가 없다면 -1리턴
		

		//----------문자열이 얼마의 바이트를 차지하는지 인코딩에 따라 다름을 확인 할 수 있다.
		byte[] bytes1 = str.getBytes(); // 바이트코드로 변경했다가 다시 스트링으로 변경하는 것
		System.out.println("bytes1.length: " + bytes1.length);
		//byte는 메소드를 가질 수 없어서 length는 ()를 가질 수 없다.
		String str1 = new String(bytes1);
		System.out.println("bytes1->String: " + str1);

		try {
			byte[] bytes2 = str.getBytes("EUC-KR");// UTF8에서 바꾸기
			System.out.println("bytes2.length: " + bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2->String: " + str2);

			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length: " + bytes3.length);
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes3->String: " + str3);

		} catch (UnsupportedEncodingException e) {
			// 지원하지 않는 인코딩 타입일 경우 발생하는 에러
			e.printStackTrace();
		}

	}

}
