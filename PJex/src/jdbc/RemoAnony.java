package jdbc;

import chap09_09.RemoteControl;

public class RemoAnony {//익명구현은 인터페이스의 객체를 쉽게 생성하기 위해 많이 사용된다.
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	//필드는 초기화 강제성이 없다.
	void method1() {
		RemoteControl localVar=new RemoteControl() {
			// 변수는 초기화를 해줘야한다.
			@Override
			public void turnOn() {
				System.out.println("오디오를 켭니다.");				
			}
			
			@Override
			public void turnOff() {
				System.out.println("오디오를 끕니다.");				
			}
		};
		//로컬 변수 사용
		localVar.turnOn();
	}
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
