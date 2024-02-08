package chap08_02;

public class SmartTelevisionEx {

	public static void main(String[] args) {
	 SmartTelevision tv=new SmartTelevision();
	 //인터페이스 내용을 모두 상속받은 스마트 텔레비전의 인스턴스 생성
	 
	 RemoteControl rc1 = tv;
	 Searchable searchable=tv;
	}
}
