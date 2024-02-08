package accessModifier;

public class StaticPrivate_StudentEx {
	public static void main(String[] args) {
		StaticPrivate_StudentService ss = StaticPrivate_StudentService.getInstance();
		ss.staticPrivate_Student.name = "홍길동";
		ss.staticPrivate_Student.hakbun = "241010";
		ss.staticPrivate_Student.kor = 92;
		ss.staticPrivate_Student.eng = 86;
		ss.staticPrivate_Student.math = 95;

		StaticPrivate_StudentService ss1 = StaticPrivate_StudentService.getInstance();
		System.out.println(ss.staticPrivate_Student.name);
		System.out.println(ss1.staticPrivate_Student.name);
		if (ss.staticPrivate_Student == (ss1.staticPrivate_Student)) {
			System.out.println("같다");
		}

		if (ss.staticPrivate_Student.equals(ss1.staticPrivate_Student)) {
			System.out.println("같다");
		}
	}

}
