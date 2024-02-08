package baseMethod;

public class MethodEx {
	public static String input() { /// 선언부분
		String str = "100";
		return str;// 리턴값은 하나의 값만 리턴함
	}

	public static void main(String[] args) {
		String str = input();
		System.out.println(input()); // 실행
	}

}
