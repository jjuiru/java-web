package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class Emp {
	private int empno;
	private String ename;
	private String job;
	private String sal;
	public Emp(int empno, String ename,String job, String sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job=job;
		this.sal = sal;
		
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getEmpno() {
		return empno;
	}
	public String getEname() {
		return ename;
	}
	public String getSal() {
		return sal;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}

	
}

public class JdbcArraySelectEmptEx {

	public static void main(String[] args) {
		List<Emp> list = new ArrayList<>();
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		Statement stmt; // 블록안은 지역변수로 작용하기 떄문에 바깥에 변수선언을 해준다.
		Connection conn; // null을 쓰는 이유??????
		ResultSet rs;
		String sql = "select empno, ename,job, sal from emp";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
//				int deptno=rs.getInt(1); //첫번째 컬럼이라는 뜻이다.
				int empno = rs.getInt("empno"); // 컬럼 이름도 같은 결과
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				String sal = rs.getString("sal");
//				String str=(deptno+","+dname+","+loc); //문자열을 계속 붙여넣는거라 메모리 측면에서는 ...
//				System.out.println(deptno+","+dname+","+loc);
				Emp emp = new Emp(empno, ename,job, sal);
				list.add(emp);
			}
		} catch (SQLException e) { // 상위 오류처리가 먼저 실행되면 다음순서는 오류처리가 실행되지 않는다.
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Emp a : list) {
			System.out.println(a.getEmpno()+"\t"+a.getEname()+"\t"+a.getJob()+"\t"+a.getSal());
		}
	}
}