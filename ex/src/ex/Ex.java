package ex;

public class Ex {
	OnSelectListener listener;
	void setOnSelectListener(OnSelectListener listener) { //인터페이스타입 객체를 저장해주는 메소드
			this.listener= listener;
	}		
	void select() {
		listener.onSelect();
	}	
	static interface OnSelectListener{// 선택하면 온해주는 이벤트 인터페이스
		void onSelect(); 
	}
}
