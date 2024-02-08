package exeption;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FinallyEx2 {
	static void method() {// static 으로 불러올 수 있다.
		String url = "jdbc:mysql://localhost:3306/fime";
		String id = "root";
		String pass = "mysql";
		String sql = "select * frome emp";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.print(rs.getInt("empno") + "\t");
				System.out.print(rs.getString("ename") + "\t");
				System.out.println(rs.getDouble("sal"));
			}
		} catch (Exception e) {
			System.out.println("예외캐치!");
//			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) {
				}
			if (stmt != null)
				try {
					stmt.close();
				} catch (Exception e) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {
				}
		}
	}

	public static void main(String[] args) {
//		FinallyEx22 final = new FinallyEx22();
//		final.method();
		method();
		
		
	}

}