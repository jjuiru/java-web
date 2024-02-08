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
<h2>입력</h2>
________________________________
<br/><br/>
	<form action="insert.jsp" method="get">

		이름 : <input type="text" name="ename" /><br /> 
		직무 : <input type="text" name="job" /><br /> 
		월급 : <input type="text" name="sal" /><br /> <br /> 
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