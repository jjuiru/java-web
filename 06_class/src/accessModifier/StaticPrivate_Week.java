package accessModifier;

public class StaticPrivate_Week { // 열거타입처럼 만들어서 사용할 수 있다.
	public static final boolean MONDAY = true;

	public static void main(String[] args) {
		boolean day = StaticPrivate_Week.MONDAY;
		System.out.println(day);
	}
}
