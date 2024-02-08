<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!--insert 파일과 Form 파일은 requset 기본객체를 공유하여 사용한다. 그래서 인코딩 방법을 맞춰야한다.  -->
<title>Insert title here</title>
</head>
<body>
<br/><br/>
<br/><br/>
<div style="text-align: center">
<h1 style="border: 3">성적 입력하기</h1>
<h6 style="border: 1">*같은학번을 중복으로 저장할 수 없습니다*</h6>

_______________________________________________________
<br/><br/>
	<form action="6_insertOracle.jsp" method="get">
        학번 :  <input type="text" name="num" /><br /> <br /> 
        이름 :  <input type="text" name="name" /><br /> <br /> 
		국어 :  <input type="text" name="kor" /><br /> <br /> 
		영어 :  <input type="text" name="eng" /><br /> <br /> 
		수학 :  <input type="text" name="math" /><br /> <br /> 
		<input type="submit" value="확인" /> 
		<input type="reset" value="지우기" />
		<br/><br/>
_______________________________________________________
		<br/>
	</form>
	<br/>
<button onclick="location.href='6_insertOracle.jsp'">목록으로</button>
<button onclick="location.href='1_indexOracle.jsp'">메인화면</button>
	<br/><br/>
	</div>
</body>
</html>