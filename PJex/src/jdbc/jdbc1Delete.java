package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc1Delete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root"; 
		String pass = "mysql"; 
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn= DriverManager.getConnection(url,id,pass);//접속메니저
		Statement stmt= conn.createStatement();
		String sql="delete from emp where empno=7777;";// delete문 입력
		int result =stmt.executeUpdate(sql); //성공한 행의 수 명령어를 넣는다.
		if(result>=1) {
			System.out.println("삭제성공!"+result);
		}else {
			System.out.println("삭제실패!"+result);
		}
	}
}
