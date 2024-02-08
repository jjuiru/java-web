package proxy;

public class RealSubject implements Isubject {

	@Override
	public void action() {
		System.out.println("원본객체 액션");		
	}
}
