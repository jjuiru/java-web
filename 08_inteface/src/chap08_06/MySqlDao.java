package chap08_06;

public class MySqlDao implements DataAccessObject { //추상메소드를 상속받음

	@Override
	public void select() {
		System.out.println("MySql select");
	}

	@Override
	public void insert() {
		System.out.println("MySql insert");
	}

	@Override
	public void update() {
		System.out.println("MySql update");
	}

	@Override
	public void delete() {
		System.out.println("MySql delete");
	}
}
