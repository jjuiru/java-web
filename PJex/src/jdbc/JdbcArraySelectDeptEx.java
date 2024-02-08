package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class Dept {
	private int deptno;
	private String dname;
	private String loc;

	public Dept(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public int getDeptno() {
		return deptno;
	}

	public String getDname() {
		return dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}

}

public class JdbcArraySelectDeptEx {

	public static void main(String[] args) {
		List<Dept> list = new ArrayList<>();
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		Statement stmt; // 블록안은 지역변수로 작용하기 떄문에 바깥에 변수선언을 해준다.
		Connection conn; // null을 쓰는 이유??????
		ResultSet rs;
		String sql = "select deptno, dname, loc from dept";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
//				int deptno=rs.getInt(1); //첫번째 컬럼이라는 뜻이다.
				int deptno = rs.getInt("deptno"); // 컬럼 이름도 같은 결과
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
//				String str=(deptno+","+dname+","+loc); //문자열을 계속 붙여넣는거라 메모리 측면에서는 ...
//				System.out.println(deptno+","+dname+","+loc);
				Dept dept = new Dept(deptno, dname, loc);
				list.add(dept);
			}
		} catch (SQLException e) { // 상위 오류처리가 먼저 실행되면 다음순서는 오류처리가 실행되지 않는다.
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Dept a : list) {
			System.out.println(a.getDname()+"\t"+a.getDeptno()+"\t"+a.getLoc());
		}
	}
}