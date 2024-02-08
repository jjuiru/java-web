package accessModifier;

public class Final_PersonEx {
	public static final double PI=3.141592; // 고정 상수
	final String name;// final >값을 변경할 수 없다. 초기값이 없을 경우 생성자 1회 형성가능, 값이 있을 경우 생성자 사용불가

	public Final_PersonEx(String name) { //생성자 이름도 바꿀수 없다
		this.name=name;
	}
	public static void main(String[] args) {
		Final_PersonEx final_PersonEx = new Final_PersonEx("홍길동"); // 한번은 생성자 형성이 가능하다.
//		person.name = "홍길동";
		
		final int x; 
		x=300;
//		x=500; 처음만 값을 지정해 줄 수 있다.
	}
}
