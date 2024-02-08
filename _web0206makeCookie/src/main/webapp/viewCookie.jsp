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
Cookie cookie[]= request.getCookies();
if(cookie !=null){
	out.print("쿠키의 개수:" +cookie.length+"<br/>");

	for(Cookie co: cookie){
		out.print(co.getName()+"="+co.getValue()+"<br/>");
	}
} else{
	out.print("쿠키없음");
}

%>
</body>
</html>