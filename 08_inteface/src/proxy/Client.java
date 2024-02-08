package proxy;

public class Client {

	public static void main(String[] args) {
//		Isubject sub1=new RealSubject();
//		sub1.action(); 
		//기존 호출 방식
		
		Isubject sub=new Proxy(new RealSubject());
		//프록시의 액션을 실행하면서 realsybject도 실행한다.
		sub.action();
	} // proxy라는 중간단계에서 데이터를 하나로 모아 한단계 거쳐서 호출된다.

}
