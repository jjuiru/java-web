<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="test0105.student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
for(int i=0; i< student.names.length;i++){
%>	
<%=student.names[i]%><br>
<% }%>
</body>


<!-- 이 코드는 제목을 표시하는 코드입니다. -->
</html>