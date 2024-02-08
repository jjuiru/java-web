package accessModifier;

public class StaticPrivate_StudentService {
	StaticPrivate_Student staticPrivate_Student= new StaticPrivate_Student(); // 10명의 배열 필드 생성
	private static StaticPrivate_StudentService staticPrivate_StudentService = new StaticPrivate_StudentService();

	private StaticPrivate_StudentService() {
	}// 클래스 내에서 호출이 가능하지만 다른클래스에서는 호출 못함
	
	public static StaticPrivate_StudentService getInstance() {
		//코딩 부분
		return staticPrivate_StudentService;
	}
}
