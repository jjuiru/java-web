package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbc1Insert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root"; 
		String pass = "mysql"; 
		Class.forName("com.mysql.cj.jdbc.Driver");
		//---------스캐너
		Scanner scan=new Scanner(System.in);
		System.out.println("부서 번호 :");
		int deptno =Integer.parseInt(scan.nextLine());
		System.out.println("부서이름 :");
		String dname=scan.nextLine();
		System.out.println("부서위치 :");
		String loc=scan.nextLine();
		//---------변수 설정
		Connection conn= DriverManager.getConnection(url,id,pass);//접속메니저
		Statement stmt= conn.createStatement();
		String sql="insert into dept(deptno,dname,loc)values("+deptno+",'"+dname+"','"+loc+"')";
		//insert into dept(deptno,dname,loc)values(50,'개발','서울')
		System.out.println(sql);
		
		int result =stmt.executeUpdate(sql); // 명령어를 넣는다.
		if(result>=1) {
			System.out.println("입력성공!"+result);
		}else {
			System.out.println("입력실패!"+result);
		}
	}
}
