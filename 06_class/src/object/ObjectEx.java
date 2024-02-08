package object;

public class ObjectEx {

	public static void main(String[] args) { //메인 메소드는 순차적으로 실행 (객체지향x 절차지향)
		System.out.println("ObjectEx");
		new Object(); // 클래스 선언
		Object ob = null;
		ob = new Object(); // Object ob= new Object(); 로 합쳐도 된다.
		Object ob1= new Object(); // 독립적인 객체가 힙 영역에 생겨남
		Object ob2= new Object();
		Object ob3= new Object();
		Object ob4= new Object();
	} 

}