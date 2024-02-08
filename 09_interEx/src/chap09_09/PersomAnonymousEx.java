package chap09_09;

public class PersomAnonymousEx {

	public static void main(String[] args) {
		PersonAnonymous anony = new PersonAnonymous();
		anony.field.wake(); // person의 메소드에 접근

		anony.method1();

		anony.methdo2(new Person() {
			void study() {
				System.out.println("공부");
			}

			@Override
			void wake() {
				System.out.println("8시 기상");
				study();
			}

		});
	}
}
