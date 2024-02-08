package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex {
	private static String url = "jdbc:mysql://localhost:3306/firm";
	private static String id = "root";
	private static String pass = "mysql";
	private static String selectAll = "select * from emp";
	private static ResultSet rs = null;
	static Scanner scan = new Scanner(System.in);
	static boolean start = true;

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, id, pass);
			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(selectAll);

			A: while (start) {
				System.out.println("------------------------------------------");
				System.out.println("|1.자료입력 |2.자료검색 |3.자료수정 |4.자료삭제 | 5.종료 |");
				System.out.println("------------------------------------------");
				System.out.println("메뉴를 선택하세요 : ");
				String menunum = scan.nextLine();
				switch (menunum) {
				case "1":

					System.out.println("<자료를 입력해 주세요>");
					System.out.println("자료번호 :");
					int empno = Integer.parseInt(scan.nextLine());
					System.out.println("name :");
					String ename = (scan.nextLine());
					System.out.println("job :");
					String job = (scan.nextLine());
					System.out.println("mgr :");
					int mgr = Integer.parseInt(scan.nextLine());
					System.out.println("hiredate :");
					String hiredate = scan.nextLine();
					System.out.println("sal :");
					Double sal = Double.parseDouble(scan.nextLine());
					System.out.println("comm :");
					Double comm = Double.parseDouble(scan.nextLine());
					System.out.println("deptno :");
					int deptno = Integer.parseInt(scan.nextLine());
					String insertPrint = "insert into emp(empno, ename, job, mgr ,hiredate, sal, comm,deptno)values"
							+ "(" + empno + ",'" + ename + "','" + job + "'," + mgr + ",'" + hiredate + "'," + sal + ","
							+ comm + "," + deptno + ")";
					int num1 = stmt.executeUpdate(insertPrint);
					System.out.println(
							"[empno:" + empno + "| ename:" + ename + "| job:" + job + "| Mgr:" + mgr + " | Hiredate:"
									+ hiredate + "| Sal:" + sal + "| Comm:" + comm + "| DeptNo:" + deptno + "|]");

					break;
				case "2":
					while (start) {
						System.out.println("----------------------------------------");
						System.out.println("|1.전체자료검색 |2.자료번호검색 |3.이름검색 | 4.돌아가기 |");
						System.out.println("----------------------------------------");
						System.out.println("메뉴를 선택하세요 : ");
						String menunum2 = scan.nextLine();
						switch (menunum2) {
						case "1":
							System.out.println("<전체 자료를 불러옵니다>");

							String empnoSelect = "select * from emp";
							rs = stmt.executeQuery(empnoSelect);
							while (rs.next()) {
								System.out.print("[empno:" + rs.getInt("empno") + "\t");
								System.out.print("|ename:" + rs.getString("ename") + "\t");
								System.out.print(("|job:" + rs.getString("job") + "\t"));
								System.out.print("|Mgr:" + rs.getInt("mgr") + "\t");
								System.out.print("|Hiredate:" + rs.getString("hiredate") + "\t");
								System.out.print("|Sal:" + rs.getDouble("sal") + "\t");
								System.out.print("|Comm:" + rs.getDouble("comm") + "\t");
								System.out.println("|DeptNo:" + rs.getInt("deptno") + "|]");
							}
							break;
						case "2":
							System.out.println("<자료번호로 검색합니다>");
							System.out.println("입력 :");
							String empno2 = scan.nextLine();
//							for(list )
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
								System.out.println("[empno:" + empno11 + "| ename:" + ename11 + "| job:" + job11
										+ "| Mgr:" + mgr11 + " | Hiredate:" + hiredate11 + "| Sal:" + sal11 + "| Comm:"
										+ comm11 + "| DeptNo:" + deptno11 + "|]");
							}
							break;
						case "3":
							System.out.println("<이름으로 검색합니다>");
							System.out.println("입력 :");
							String ename2 = scan.nextLine();
							String enameSelect = "select * from emp where ename = '" + ename2 + "'";
							rs = stmt.executeQuery(enameSelect);
							while (rs.next()) {
								int empno11 = rs.getInt("empno");
								String ename11 = rs.getString("ename");
								String job11 = rs.getString("job");
								int mgr11 = rs.getInt("mgr");
								String hiredate11 = rs.getString("hiredate");
								double sal11 = rs.getDouble("sal");
								double comm11 = rs.getDouble("comm");
								int deptno11 = rs.getInt("deptno");
								System.out.println("[empno:" + empno11 + "| ename:" + ename11 + "| job:" + job11
										+ "| Mgr:" + mgr11 + " | Hiredate:" + hiredate11 + "| Sal:" + sal11 + "| Comm:"
										+ comm11 + "| DeptNo:" + deptno11 + "|]");
							}
							break;
						case "4":
							System.out.println("이전 메뉴로 돌아갑니다.");
							continue A;
						}
					}
					break;
				case "3":
					System.out.println("<수정할 자료를 입력해주세요>");
					System.out.println("자료번호 :");
					int empno22 = Integer.parseInt(scan.nextLine());
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
					System.out.println("다음과 같이 데이터를 수정합니다>\n [empno:" + empno22 + "| ename:" + ename22 + "| job:" + job22
							+ "| Mgr:" + mgr22 + " | Hiredate:" + "| Sal:" + sal22 + "| Comm:"
							+ comm22 + "| DeptNo:" + deptno22 + "|]");
					

					String updateSelect = "update emp set ename = '" + ename22 + "', job = '" + job22 + "', mgr ="
							+ mgr22 + ", sal =" + sal22 + ",comm =" + comm22 + ",deptno=" + deptno22 + " where empno = "
							+ empno22;

					Statement stmt1 = conn.createStatement();
					try {
						int rs = stmt1.executeUpdate(updateSelect);

						if (rs == 1) {
							System.out.println("수정 성공!");
						} else {
							System.out.println("수정 실패: 데이터가 없거나 문제가 발생했습니다.");
						}
					} catch (SQLException e) {
						System.out.println("SQL 오류: " + e.getMessage());
						e.printStackTrace();
					}

					break;
				case "4":
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

					break;
				case "5":
					System.out.println("<시스템을 종료합니다>");
					start = false;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("sql에 접속할 수 없습니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버를 찾을 수 없습니다.");
		} finally {
			start = true;
		}
	}
}
