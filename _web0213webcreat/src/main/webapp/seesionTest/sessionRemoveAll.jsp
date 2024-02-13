<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    session.invalidate();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String str= (String)session.getAttribute("aaa");
//parsString??
		if(str==null)
%>
삭제할 세션이 없습니다.
<%
else{
%>
세션이 모두 삭제되었습니다.
<%} %>
</body>
</html>