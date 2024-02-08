package chap08_07;

class Parent{
	void method() {}
}
public class Child extends Parent {
	

	@Override
	void method() {
		// TODO Auto-generated method stub
		super.method();
	}

	public static void main(String[] args) {
		Parent pa = new Child();
		
		
		new Child(); //익명객체(변수가없는)- 생성한 객체를 다시 부를수 없다.
		Parent parent=new Parent(); //부모객체
		Parent parent1=new Parent() {// 상속관계에 있늘때는 상속받은 클래스의 익명객체를 부를 수 있다.

			@Override
			void method() {
				super.method(); 
			}			
		};
	}

}
