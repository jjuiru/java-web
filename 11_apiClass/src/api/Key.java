package api;

public class Key {
	public int number;// 참조x 기본타입 

	public Key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		//매개변수의 다형성(Object로부터 상속)
		if (obj instanceof Key) { //Key클래스의 객체인가
			Key compareKey = (Key) obj; //Key클래스 변수에 대입
			if (this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return number;
	}

}
