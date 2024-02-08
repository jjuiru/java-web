package abstractAll;

public abstract class Phone {
	int x;

	public Phone(int x) { //매개변수 값이 있는 생성자를 만들경우 자식 클래스도 부모생성자를 호출해야함
		super();
		this.x = x;
	}	
	public abstract void ring();
	/* 추상 메소드는 바디가 없다. 자식의 오퍼라이딩을 이용해야함\
	 * 같은 시그니처를 사용해야 혼란이 없기 때문에 이름만 빌린다고 할 수 있다.
	 */
}
