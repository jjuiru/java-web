package singleton;

public class SingletonEx {

	public static void main(String[] args) {
//		Singleton sing1=new singleton(); // private 생성자이기 때문에 외부 클래스에서 생성이 안된다.
		Singleton sing2= Singleton.getInstance();
		Singleton sing3= Singleton.getInstance();
		
		if(sing2==sing3) { //객체 주소값 비교
			System.out.println("싱글턴은 항상 같은 객체가 서비스된다");			
		}
		if(sing2.equals(sing3)) { //객체 자체 비교
			System.out.println("싱글턴은 항상 같은 객체가 서비스된다");
		}
	}
}
