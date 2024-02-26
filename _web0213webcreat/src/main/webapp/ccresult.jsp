<%@page import="util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
// Cookies cookies = new Cookies(request);여기서는 꼭 객체정보를 사용하지 않아도 Cookies를 사용할 수 있다.
//static 메소드 사용 but 쿠키 정보를 가져오기 위해서는 사용해야한다.
String check = request.getParameter("check");
String email = request.getParameter("email");
if (check != null && check.equals("on")) {
	//체크 파일이 체크가 되면 값이 remember값이 on으로 넘어온다. 
	// 이메일을 작성하지 않았거나, 체크박스에 체크를 하지 않았다면 쿠키를 지우고 둘다 참이라면 쿠키를 생성해서 저장한다.
	response.addCookie(Cookies.createCookie("email", email, "/", 60 * 60));
	// 쿠키글 저장(쿠키를 생성 (1시간 쿠키가 살아있을 수 있도록 설정 ));
} else {
	response.addCookie(Cookies.createCookie("email", "", "/", 0));
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=email %>
</body>
</html>