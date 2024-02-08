package Ex;

public class BytesToStringEx {

	public static void main(String[] args) {
		byte[] bytes=
			{73,32,108,111,118,101,32,121,111,117};
		//아스키 코드값
		String str= new String(bytes); 
		//string은 byte타입 배열도 받을 수 있다.
		System.out.println(str);
		// i love you 출력
	}
}
