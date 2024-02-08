package exeption;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FinallyEx4 {
	
	void method() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		String sql = "select * from emp";
		Connection conn = DriverManager.getConnection(url, id, pass);
		Statement stmt = conn.createStatement();
	    ResultSet rs = stmt.executeQuery(sql);

		try(conn; stmt; rs){
			
			while (rs.next()) {
				System.out.print(rs.getInt("empno") + "\t");
				System.out.print(rs.getString("ename") + "\t");
				System.out.println(rs.getDouble("sal"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void main(String[] ar) {
		FinallyEx4 cs = new FinallyEx4();
		try {
			cs.method();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		method();
	}

}