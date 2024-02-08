package Ex;

public class FindAndReplaceEx {

	public static void main(String[] args) {
		String str ="모든 프로그램은 자바 언어로";
		int index = str.indexOf("자바");
		// 위치를 정수로 변환
		System.out.println(index);
		str= str.replace("자바", "java");
		// 문자열을 바꿔준다
		System.out.println(str);
	}
}
