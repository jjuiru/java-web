<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!--insert 파일과 Form 파일은 requset 기본객체를 공유하여 사용한다. 그래서 인코딩 방법을 맞춰야한다.  -->
<title>Insert title here</title>
</head>
<body>

<%
	request.setCharacterEncoding("UTF-8");
	//insert 파일과 Form 파일은 requset 기본객체를 공유하여 사용한다. 그래서 인코딩 방법을 맞춰야한다.
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	Class.forName(driver);
	Connection conn = DriverManager.getConnection(url, "scott", "tiger");
	//mysql과는 다르게 직접 아이디 비밀번호를 입력한다.
	//포트 번호 다음 스키마 사용
	String sql = "select * from emp where ename=?";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, request.getParameter("ename"));
	ResultSet rs = pstmt.executeQuery();
	String empno=""; String ename=""; String job=""; String sal=""; String hiredate=""; String comm="";
	if (rs.next()) {
	ename= rs.getString("ename");
    job= rs.getString("job"); 
    sal= rs.getString("sal"); 
}%>


<h2>입력</h2>
________________________________
<br/><br/>
	<form action="update.jsp" method="post">

		이름 : <input type="text" name="ename" value="<%=ename%>"/><br /> 
		직무 : <input type="text" name="job" value="<%=job%>"/><br /> 
		월급 : <input type="text" name="sal"value="<%=sal%>" /><br /> <br /> 
		<input type="submit" value="확인" /> 
		<input type="reset" value="지우기" />
		
	</form>
	<br/>
<button onclick="location.href='select.jsp'">사원 목록으로 돌아가기 </button>
	<br/><br/>
<button onclick="location.href='index.jsp'">메인으로 돌아가기 </button>
	<br/><br/>
</body>
</html>