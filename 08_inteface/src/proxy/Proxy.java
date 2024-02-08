package proxy;

public class Proxy implements Isubject { //인터페이스 상속
	private RealSubject realSuvject;// 선언

	
	public Proxy(RealSubject realSuvject) {
		this.realSuvject = realSuvject;
	}

	@Override
	public void action() {
		System.out.println("로깅........."); //기록남기기
		System.out.println("프록시 객체 액션");
		realSuvject.action();
		System.out.println("로깅.........");
	}

}
