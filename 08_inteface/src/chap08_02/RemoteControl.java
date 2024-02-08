package chap08_02;

public interface RemoteControl { //public을 사용하는 이유는 모든곳에서 접근 가능하게 하기위해서
	/* 인터페이스는 변수선언이 불가 
	 * 상수만 사용 가능하다. (public static final) 
	 * 따라서 위의 선언문은 생략이 가능하다. 모든 인터페이스의 필드는 상수이기 때문이다.
	 * 상수는 반드시 선언과 동시에 초기값을 지정해야한다.
	 */
public static final int MAX_VOLUME=10; // 값이 고정되어있고 변경할 수 없는 상수를 필드로 선언한다.
int MIN_VOLUME=0; //static final 은 생략이 가능하다.
int x=100; //상수 변수 선언시 값을 함께 지정해 상수로 만들어 주어야 한다.

public abstract void turnOn(); //위와 같은 이유로 메소드에(Public abstract) 생략가능
void turnOff();
void setVolume(int volume);
}