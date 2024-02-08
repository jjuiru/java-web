package chap08_07;

class AnyClass{
	void mmm() {};
}

public class Ex {

	public static void main(String[] args) {		
		AnyClass ac= new AnyClass();
		AnyClass ac1= new AnyClass(){
			 //타입이 없어서 즉시 생성할 수 있다.
			//이름을 찾아 형변환 해 줄수가 없어서 재사용이 불가.
			@Override
			void mmm() {
				//오버라이딩이 된다는 것> 익명의 자식객체라는것
				super.mmm();
			}			
		}; 
	}
}
