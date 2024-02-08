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
	String str = "안녕하세요";
	//자바 코드를 직접 써도 된다.
	out.println("<h1>"+str+"</h1>");
	%>
	<br />
	<h1><%=str
//변수나 값을 써야 한다.
%></h1>
</body>
</html>