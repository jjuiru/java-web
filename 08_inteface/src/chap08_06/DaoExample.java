package chap08_06;

public class DaoExample {
	
	public static void dbWork(DataAccessObject dao) { //매개변수를 선언하면서 줘도 시행가능 ,
		dao.select(); //추상메소드의 객체를 매개로 메소드를 호출한다.
		dao.insert(); //이후 메인메소드에서 호출한 메소드의 매개변수 값에 따라 어떤 자식의 메소드가 실행될지가 결정된다.
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
//		DataAccessObject dao = new OracleDao();
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
}
