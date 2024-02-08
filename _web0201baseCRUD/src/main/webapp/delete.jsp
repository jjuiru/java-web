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
<title>DB</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	Class.forName(driver);
	Connection conn = DriverManager.getConnection(url, "scott", "tiger");
	String sql = "delete from emp where ename= ?";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, request.getParameter("ename"));
	pstmt.executeUpdate();
	%>
	<h1>삭제 완료!</h1>
	<br />
<button onclick="location.href='select.jsp'">사원 목록으로 돌아가기 </button>
		<br/><br/>
<button onclick="location.href='index.jsp'">메인으로 돌아가기 </button>
	<br/><br/>
			<% response.sendRedirect("select.jsp"); %>
</body>
</html>