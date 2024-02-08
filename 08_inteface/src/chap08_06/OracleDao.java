package chap08_06;

public class OracleDao implements DataAccessObject { // 추상매소드를 상속받음

	@Override
	public void select() {
		System.out.println("오라클 select");		
	}

	@Override
	public void insert() {
		System.out.println("오라클 insert");		
	}

	@Override
	public void update() {
		System.out.println("오라클 update");		
	}

	@Override
	public void delete() {
		System.out.println("오라클 delete");	
	}
}
