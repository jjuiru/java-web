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
	<%
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	Class.forName(driver);
	Connection conn = DriverManager.getConnection(url, "scott", "tiger");
	//mysql과는 다르게 직접 아이디 비밀번호를 입력한다.
	//포트 번호 다음 스키마 사용
	String sql = "create table emp1 as select ename, job, sal from emp";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	pstmt.executeQuery();
	%>
	<h1>정상 작동!</h1>
	<br /> 데이터 테이블 emp1 생성 완료!
</body>
</html>