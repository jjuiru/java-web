package chap09_09;

public class UiButton {
	OnClickListener listener; //인터페이스 타입 필드

	void setOnclickListener(OnClickListener listener) { 
		//인터페이스 타입 객체를 매개변수로 받아 필드에 값을 저장
		this.listener = listener;
	}

	void touch() { //인터페이스의 추상클래스를 실행하는 메소드
		listener.onClick();
	}

	static interface OnClickListener { //인터페이스 
		void onClick();
	}
}
