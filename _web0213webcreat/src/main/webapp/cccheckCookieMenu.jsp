<%@page import="util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
 Cookies cookies = new Cookies(request);
//static 메소드 사용 but 쿠키 정보를 가져오기 위해서는 사용해야한다.
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="ccresult.jsp">
<%
	if (cookies.exists("email")) {
%>
email: <input type="text" name="email" value="<%=cookies.getValue("email") %>" />
<%
	} else {
%>
email: <input type="text" name="email" />
<%
	}
%>
<div>
save email : <input type="checkbox" name="remember" checked/>
</div>
<input type="submit" />
</form>
</body>
</html>