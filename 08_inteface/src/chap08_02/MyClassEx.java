package chap08_02;

public class MyClassEx {

	public static void main(String[] args) {
		System.out.println("1--------------");
		MyClass myClass1= new MyClass();
		myClass1.rc.turnOn(); //텔레비전 턴온 티비를 켠다
		myClass1.rc.setVolume(5);//텔레비전 set볼륨
		
		System.out.println("2--------------");
		
		MyClass myClass2= new MyClass(new Audio());
		//오디오의 생성자를 마이클래스 생성자의 매개값으로 줌>리모트 컨트롤로 자동 타입변환
		
		System.out.println("3--------------");
		MyClass myClass3=new MyClass();
		myClass3.methodA(); //오디오 실행
		
		System.out.println("4--------------");
		MyClass myClass4=new MyClass();
		myClass4.methodB(new Television()); //텔레비전 실행		
	}
}
