<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Emp1 Table</h2>
________________________________
<br/><br/>

<table border="1">
	<%
	request.setCharacterEncoding("UTF-8");
	//insert 파일과 Form 파일은 requset 기본객체를 공유하여 사용한다. 그래서 인코딩 방법을 맞춰야한다.
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	Class.forName(driver);
	Connection conn = DriverManager.getConnection(url, "scott", "tiger");
	//mysql과는 다르게 직접 아이디 비밀번호를 입력한다.
	//포트 번호 다음 스키마 사용
	String sql = "select * from emp";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	ResultSet rs = pstmt.executeQuery();%>
	<% while (rs.next()) {%>
	<tr>
	<td><a href="updateForm.jsp?ename=<%= rs.getString("ename")%>">
	<%= rs.getString("empno") %></a></td>
	<td><%= rs.getString("ename") %></td>
	<td><%= rs.getString("job") %></td>
	<td><%= rs.getString("sal") %></td>
	<td><%= rs.getString("mgr") %></td>
	<td><%= rs.getString("hiredata") %></td>
	<td><%= rs.getString("comm") %></td>
	<td><%= rs.getString("deptno") %></td>
	<td><a href="delete.jsp?ename=<%= rs.getString("ename") %>">삭제</a></td>
	</tr>
<%}%>

</table>
________________________________
	<br/><br/>
<button onclick="location.href='index.jsp'">메인으로 돌아가기 </button>
	<br/><br/>
<button onclick="location.href='insertForm.jsp'">입력으로 돌아가기 </button>
<!--<a href="index.jsp">목록으로 돌아가기</a>  -->
<br/>
</body>
</html>