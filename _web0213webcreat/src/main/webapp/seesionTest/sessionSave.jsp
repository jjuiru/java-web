<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    session.setAttribute("aaa", "한글되나요?");
    //서버에 저장하기 때문에 한글처리를 하지 않아도 된다. (파일일 경우 꺠질 수 있어서 필요)
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
세션 저장하기
</body>
</html>