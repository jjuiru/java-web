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
Cookie ck= new Cookie("loginId","admin");
// 앞이 쿠키의 이름(aaa) 뒤가 쿠키의 값(bbb)
ck.setMaxAge(15); //60*60*24 1달치 저장정보
//기본값은 -1이다(브라우저 창이 닫히면) 쿠기의 저장 시간 1=1초
//값을 0으로 하면 쿠키를 삭제하는 기능을 한다.
response.addCookie(ck);
%>
<%= ck.getName()%><br/>
<%= ck.getValue()%>
</body>
</html>