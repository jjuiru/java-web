package empPro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpModul {//---- 모든 메소드에서 필요한 필드선언
//---------jdbc주소와 아이디 패스워드 정보
	private static String url = "jdbc:mysql://localhost:3306/firm";
	private static String id = "root";
	private static String pass = "mysql";
//---------스캐너, while문 등 실행시 필요한 필드 선언
	static Scanner scan = new Scanner(System.in);
	static boolean start = true;
	private static ResultSet rs = null;

	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection(url, id, pass);
			Statement stmt = conn.createStatement();
			Class.forName("com.mysql.cj.jdbc.Driver");

			A: while (start) {
				MainMenu();
				String menunum = scan.nextLine();

				switch (menunum) {
				case "1":
					insertData(stmt);
					break;
				case "2":
					searchMenu(stmt);
					continue A;
				case "3":
					updateData(stmt, conn);
					break;
				case "4":
					deleteData(stmt, conn);
					break;
				case "5":
					System.out.println("<시스템을 종료합니다>");
					start = false;
					break;
				}
			}
		} catch (RuntimeException |SQLException | ClassNotFoundException e) {
//			e.printStackTrace();
			System.out.println("정확한 정보를 다시 입력해 주세요.");
		} finally {
			start = true;
		}
	}

	//  메인 메뉴 화면 출력
	static void MainMenu() {
		System.out.println("--------------------------------------------");
		System.out.println("|1.자료입력 |2.자료검색 |3.자료수정 |4.자료삭제 | 5.종료 |");
		System.out.println("--------------------------------------------");
		System.out.println("메뉴를 선택하세요 : ");
	}

	// 1번선택 직원 정보 입력
	static void insertData(Statement stmt) throws SQLException {
		System.out.println("<자료를 입력해 주세요>");
		
		//--------자료입력
		System.out.println("자료번호 :");
		int empno = Integer.parseInt(scan.nextLine());
		System.out.println("이름 :");
		String ename = (scan.nextLine());
		System.out.println("직무 :");
		String job = (scan.nextLine());
		System.out.println("상급자번호 :");
		int mgr = Integer.parseInt(scan.nextLine());
		System.out.println("입사일(YYYY-MM-DD) :");
		String hiredate = scan.nextLine();
		System.out.println("급여 :");
		Double sal = Double.parseDouble(scan.nextLine());
		System.out.println("인센티브 :");
		Double comm = Double.parseDouble(scan.nextLine());
		System.out.println("부서번호 :");
		int deptno = Integer.parseInt(scan.nextLine());
		
		//-------입력 쿼리문
		String insertPrint = "insert into emp(empno, ename, job, mgr ,hiredate, sal, comm,deptno)values" + "(" + empno
				+ ",'" + ename + "','" + job + "'," + mgr + ",'" + hiredate + "'," + sal + "," + comm + "," + deptno
				+ ")";
		int num1 = stmt.executeUpdate(insertPrint);

		//------입력 결과 출력
		System.out.println("[자료번호:" + empno + "| 이름:" + ename + "| 직무:" + job + "| 상급자번호:" + mgr + " | 입사일자:"
				+ hiredate + "| 급여:" + sal + "| 인센티브:" + comm + "| 부서번호:" + deptno + "|]");
	}

	// 2번 자료 검색 화면 출력
	private static void displaySearchMenu() {
		System.out.println("------------------------------------------");
		System.out.println("|1.전체자료검색 |2.자료번호검색 |3.이름검색 | 4.돌아가기 |");
		System.out.println("------------------------------------------");
		System.out.println("메뉴를 선택하세요 : ");
	}

	// 2번 자료 검색 메뉴
	static void searchMenu(Statement stmt) throws SQLException {
		B: while (start) {
			displaySearchMenu();
			String menunum2 = scan.nextLine();

			switch (menunum2) {
			case "1":
				searchAll(stmt);
				continue B;
			case "2":
				searchNumber(stmt);
				continue B;
			case "3":
				searchName(stmt);
				continue B;
			case "4":
				System.out.println("이전 메뉴로 돌아갑니다.");
			}
			break;
		}
	}

	// 2번-1번 전체 자료 검색
	 static void searchAll(Statement stmt) throws SQLException {
		System.out.println("<전체 자료를 불러옵니다>");
		String empnoSelect = "select * from emp";
		rs = stmt.executeQuery(empnoSelect);
		while (rs.next()) {
			System.out.print("[자료번호:" + rs.getInt("empno") + "\t");
			System.out.print("|이름:" + rs.getString("ename") + "\t");
			System.out.print(("|직무:" + rs.getString("job") + "\t"));
			System.out.print("|상급자번호:" + rs.getInt("mgr") + "\t");
			System.out.print("|입사일자:" + rs.getString("hiredate") + "\t");
			System.out.print("|급여:" + rs.getDouble("sal") + "\t");
			System.out.print("|인센티브:" + rs.getDouble("comm") + "\t");
			System.out.println("|부서번호:" + rs.getInt("deptno") + "|]");
		}
	}

	// 2번-2번 자료번호로 자료 검색
	static void searchNumber(Statement stmt) throws SQLException {
		System.out.println("<자료번호로 검색합니다>");
		System.out.println("입력 :");
		String empno2 = scan.nextLine();
		String empnoSelect1 = "select * from emp where empno = '" + empno2 + "'";
		rs = stmt.executeQuery(empnoSelect1);

		while (rs.next()) {
			int empno11 = rs.getInt("empno");
			String ename11 = rs.getString("ename");
			String job11 = rs.getString("job");
			int mgr11 = rs.getInt("mgr");
			String hiredate11 = rs.getString("hiredate");
			double sal11 = rs.getDouble("sal");
			double comm11 = rs.getDouble("comm");
			int deptno11 = rs.getInt("deptno");
			System.out.println(
					"[자료번호:" + empno11 + "| 이름:" + ename11 + "| 직무:" + job11 + "| 상급자번호:" + mgr11 + " | 입사일자:"
							+ hiredate11 + "| 급여:" + sal11 + "| 인센티브:" + comm11 + "| 부서번호:" + deptno11 + "|]");
		}
	}

	// 2번-3번 이름으로 자료 검색
	static void searchName(Statement stmt) throws SQLException {
		System.out.println("<이름으로 검색합니다>");
		System.out.println("입력 :");
		String ename2 = scan.nextLine();
		//--- 이름검색 쿼리문
		String enameSelect = "select * from emp where ename = '" + ename2 + "'";
		rs = stmt.executeQuery(enameSelect);
		//---검색된 행의 정보를 읽어온다
		while (rs.next()) {
			int empno11 = rs.getInt("empno");
			String ename11 = rs.getString("ename");
			String job11 = rs.getString("job");
			int mgr11 = rs.getInt("mgr");
			String hiredate11 = rs.getString("hiredate");
			double sal11 = rs.getDouble("sal");
			double comm11 = rs.getDouble("comm");
			int deptno11 = rs.getInt("deptno");
			System.out.println(
					"[자료번호:" + empno11 + "| 이름:" + ename11 + "| 직무:" + job11 + "| 상급자번호:" + mgr11 + " | 입사일자:"
							+ hiredate11 + "| 급여:" + sal11 + "| 인센티브:" + comm11 + "| 부서번호:" + deptno11 + "|]");
		}
	}

	// 3번 자료 수정하기
	static void updateData(Statement stmt, Connection conn) throws SQLException {
		System.out.println("<수정할 자료를 입력해주세요>");
		System.out.println("자료번호 :");
		int empno22 = Integer.parseInt(scan.nextLine());		
		//--- 이름검색 쿼리문
		String enameSelect = "select * from emp where ename = '" + empno22 + "'";
		rs = stmt.executeQuery(enameSelect);
		//---검색된 행의 정보를 읽어온다
		if (rs.next()) {
			int empno11 = rs.getInt("empno");
			String ename11 = rs.getString("ename");
			String job11 = rs.getString("job");
			int mgr11 = rs.getInt("mgr");
			String hiredate11 = rs.getString("hiredate");
			double sal11 = rs.getDouble("sal");
			double comm11 = rs.getDouble("comm");
			int deptno11 = rs.getInt("deptno");
			System.out.println(
					"[자료번호:" + empno11 + "| 이름:" + ename11 + "| 직무:" + job11 + "| 상급자번호:" + mgr11 + " | 입사일자:"
							+ hiredate11 + "| 급여:" + sal11 + "| 인센티브:" + comm11 + "| 부서번호:" + deptno11 + "|]");
		}
		System.out.println("<해당 자료를 수정합니다>");
		System.out.println("<수정내용 입력>");
		System.out.println("name :");
		String ename22 = (scan.nextLine());
		System.out.println("job :");
		String job22 = (scan.nextLine());
		System.out.println("mgr :");
		int mgr22 = Integer.parseInt(scan.nextLine());
		System.out.println("sal :");
		double sal22 = Double.parseDouble(scan.nextLine());
		System.out.println("comm :");
		double comm22 = Double.parseDouble(scan.nextLine());
		System.out.println("deptno :");
		int deptno22 = Integer.parseInt(scan.nextLine());
		System.out.println("다음과 같이 데이터를 수정합니다>\n [자료번호:" + empno22 + "| 이름:" + ename22 + "| 직무:" + job22 + "| 상급자번호:"
				+ mgr22 + " | 입사일자:" + "| 급여:" + sal22 + "| 인센티브:" + comm22 + "| 부서번호:" + deptno22 + "|]");
        //---- 업데이트 쿼리문 
		String updateSelect = "update emp set ename = '" + ename22 + "', job = '" + job22 + "', mgr =" + mgr22
				+ ", sal =" + sal22 + ",comm =" + comm22 + ",deptno=" + deptno22 + " where empno = " + empno22;
		try {
			int rs = stmt.executeUpdate(updateSelect);

			if (rs == 1) {
				System.out.println("수정 성공!");
			} else {
				System.out.println("수정 실패: 데이터가 없거나 문제가 발생했습니다.");
			}
		} catch (SQLException e) {
			System.out.println("SQL 오류: " + e.getMessage());
			e.printStackTrace();
		}
	}

	// 4번 자료번호 초회후 해당 자료 삭제
	static void deleteData(Statement stmt, Connection conn) throws SQLException {
		System.out.println("<삭제할 자료 번호를 입력해주세요>");
		System.out.println("자료번호 :");
		int empno33 = Integer.parseInt(scan.nextLine());
		String deleteSelect = "delete from emp where empno=" + empno33;
		Statement stmt2 = conn.createStatement();
		try {
			int rs = stmt2.executeUpdate(deleteSelect);
			if (rs == 1) {
				System.out.println("삭제 성공!");
			} else {
				System.out.println("삭제 실패: 데이터가 없거나 문제가 발생했습니다.");
			}
		} catch (SQLException e) {
			System.out.println("SQL 오류: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
