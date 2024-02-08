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
<a href="index.jsp">목록으로 돌아가기</a>
	<%
	request.setCharacterEncoding("UTF-8");
	//insert 파일과 Form 파일은 requset 기본객체를 공유하여 사용한다. 그래서 인코딩 방법을 맞춰야한다.
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	Class.forName(driver);
	Connection conn = DriverManager.getConnection(url, "scott", "tiger");
	//mysql과는 다르게 직접 아이디 비밀번호를 입력한다.
	//포트 번호 다음 스키마 사용
	String sql = "update emp1 set job=?,sal=? where ename=? ";
	
	PreparedStatement pstmt = conn.prepareStatement(sql);
	//바로 사용가능하게 바꿔준다
//	pstmt.setString(1,request.getParameter("ename"));
	pstmt.setString(1,request.getParameter("job"));
	pstmt.setString(2,request.getParameter("sal"));
	pstmt.setString(3,request.getParameter("ename"));
//	pstmt.setDouble(3, Double.parseDouble(request.getParameter("sal")));
		
	int result = pstmt.executeUpdate();
	if(result==1){
		out.println("입력 성공");
	}	
	%>
	<br />
<button onclick="location.href='select.jsp'">사원 목록으로 돌아가기 </button>
			<br/><br/>
<button onclick="location.href='index.jsp'">메인으로 돌아가기 </button>
	<br/><br/>
	<h1>정상 작동!</h1>
</body>
</html>