package chap08_02;

public class MyClass {
	
	RemoteControl rc = new Television(); //자식으로 부모인스턴스 생성
	
	MyClass(){
		
	}
	MyClass(RemoteControl rc) { 
		//텔레비전 객체를 참조하는 인터페이스 rc를 매개변수로 사용
		this.rc=rc; // 만들어진 인스턴스에 매개변수를 저장
		rc.turnOn(); //this 생략가능 >부모메소드에 오버라이딩 된 텔레비전 메소드 호출
		rc.setVolume(5);//볼륨 5로 설정후 호출
	}	
	void methodA() { //라디오의 객체를 부모타입인 rc변수에 저장
		RemoteControl rc= new Audio();
		rc.turnOn(); 
		rc.setVolume(5);
	}
	void methodB(RemoteControl rc) {
		//텔레비전 객체를 참조하는 리모트 컨트롤을 매개변수로 사용
		rc.turnOn();
		rc.setVolume(5);
	}
}
