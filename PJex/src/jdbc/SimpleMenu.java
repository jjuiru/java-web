package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SimpleMenu {
	SimpleMenu simple = new SimpleMenu();
	private static final String DB_URL = "jdbc:mysql://localhost:3306/firm";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "mysql";
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
			boolean exit = false;

			while (!exit) {
				System.out.println("1. 데이터 보기");
				System.out.println("2. 데이터 삽입");
				System.out.println("3. 종료");
				System.out.print("선택하세요: ");

				int choice = Integer.parseInt(scanner.nextLine());

				switch (choice) {
				case 1:
					viewData(connection);
					break;
				case 2:
					insertData(connection);
					break;
				case 3:
					System.out.println("시스템을 종료합니다.");
					exit = true;
					break;
				default:
					System.out.println("유효하지 않은 선택. 다시 시도하세요.");
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void viewData(Connection connection) {
		Statement stmt = null;
		ResultSet rs;
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery("select * from dept");
			while (rs.next()) {
				int deptno = rs.getInt("deptno");// 컬럼 명과 타입과 일치하다.
				String dname= rs.getString("dname");
				String loc = rs.getString("loc");				
				System.out.printf("%d,%s,%s\n",deptno, dname, loc); // 가져와서 출력한다.
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("에러");
		}

	}

	private static void insertData(Connection connection) {
		Statement stmt = null;
		try {
			stmt = connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("부서 번호 :");
		int deptno = Integer.parseInt(scanner.nextLine());
		System.out.println("부서이름 :");
		String dname = scanner.nextLine();
		System.out.println("부서위치 :");
		String loc = scanner.nextLine();
		String sql = "insert into dept(deptno,dname,loc)values(" + deptno + ",'" + dname + "','" + loc + "')";
		try {
			int result = stmt.executeUpdate(sql);
			if (result >= 1) {
				System.out.println("입력성공!" + result);
			} else {
				System.out.println("입력실패!" + result);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} // 명령어를 넣는다.
	}
}
