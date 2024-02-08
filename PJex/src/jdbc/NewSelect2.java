package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class NewSelect2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		List<LList> list= new ArrayList<>();
//		LList list1= new LList(0, null, null);
		
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root"; 
		String pass = "mysql"; 
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn= DriverManager.getConnection(url,id,pass);//접속메니저
		Statement stmt= conn.createStatement();
		
		String sql="select * from emp";
		ResultSet rs= stmt.executeQuery(sql);
		while (rs.next()) { 
			int empno=(rs.getInt("empno"));
			String ename=(rs.getString("ename"));
			Double sal=(rs.getDouble("sal"));
			
//			System.out.print(rs.getInt("empno")+" / ");//컬럼 이름이 꼭 같아야한다.
//			System.out.print(rs.getString("ename")+" / ");
//			System.out.println(rs.getDouble("sal"));	
			list.add(new LList(empno,ename,sal));
		}
		for( LList a : list) {
			System.out.println(a);
		}
	}
}