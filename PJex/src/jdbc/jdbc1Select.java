package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc1Select {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/company"; 
		// mysql 접속 주소
		// 3306 내컴퓨터 내의 포트번호를 사용했지만 추후 ip등으로 서버 주소를 사용할 수 있다.
		String id = "root"; // 사용자 루트
		String pass = "mysql"; // 암호
		Class.forName("com.mysql.cj.jdbc.Driver"); // 드라이버 위치
//		System.out.println("mysql 드라이버 로딩!");
		Connection conn = // conn을 닫아주지 않으면 에러
		DriverManager.getConnection(url, id, pass);
//		System.out.println("mysql 접속 성공!");
		Statement stmt = conn.createStatement();
		// 메소드 사용을 위해 선언, createStatement 는 쿼리문을 텍스트로만들어 데이터베이스에 명령어를 전달한다.
		ResultSet rs = stmt.executeQuery("select * from emp");
		// 위 실행문의 결과물을 가져와 rs에 저장한다.
		while (rs.next()) {
			String ename = rs.getString("ename");// 컬럼 명과 타입과 일치하다.
			double sal = rs.getDouble("sal");
			System.out.printf("%s,%f\n", ename, sal); // 가져와서 출력한다.
		}
		conn.close(); // 닫아줘서 에러를 없엔다(생략가능)
	}
}
//select ename, sal from emp;