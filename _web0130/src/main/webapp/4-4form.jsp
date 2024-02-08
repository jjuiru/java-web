<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>가입 결과</title>
</head>
<body>
<% request.setCharacterEncoding("utf-8"); %>
<!--  <form action="4-4form.jsp" method="host">
host 일때는 위에 인코딩 방식을을 꼭 지정 해줘야 한다. get일 때는 상관없음
-->

아이디: <%=request.getParameter("id") %><br/>
비밀번호: <%=request.getParameter("pw") %><br/>
성별: <%=request.getParameter("gender") %><br/>
가입경로: <%=request.getParameter("intro") %><br/>
주소지: <%=request.getParameter("addr") %><br/>
메모: <%=request.getParameter("memo") %><br/>

</body>
</html>