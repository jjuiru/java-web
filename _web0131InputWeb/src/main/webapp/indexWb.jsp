<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stlesheet" href="index.css">
</head>
<body>
<%request.setCharacterEncoding("UTF-8"); %>

국어: <%=request.getParameter("ko") %>
<br/>
수학: <%=request.getParameter("ma") %>
<br/>
영어: <%=request.getParameter("en") %>

</body>
</html>