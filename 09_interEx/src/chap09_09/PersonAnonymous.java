package chap09_09;

public class PersonAnonymous {
	Person field = new Person() {//필드는 자식객체의 주소값을 가지고 있음
		void work() {// 단독사용 x
			System.out.println("출근");
		}

		@Override
		void wake() {
			System.out.println("6시 기상");//부모 메소드 재정의 후
			work(); //자기자신인 메소드도 호출
		}
	};

	void method1() {
		Person localVar= new Person() {
			void walk() {
				System.out.println("산책");
			}

			@Override
			void wake() {
				System.out.println("7시 기상");
				walk();
			}			 
		};
	}
	void methdo2(Person person) {
		person.wake(); //매개변수로 받은 자식익명객ㅊ의 wake를 호출
	}
}
