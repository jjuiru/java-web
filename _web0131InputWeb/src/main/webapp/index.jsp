<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="indexWb.css">
<title>Insert title here</title>
</head>
<body>
	<form action="indexWb.jsp" method="post">
		<div>
			<h1>성적표 출력하기</h1>
			국어 : <input type="text" name="ko"> <br /> 
			수학 : <input type="text" name="ma"> <br /> 
			영어 : <input type="text" name="en">
		</div>
		<br /> <input type="submit" value="입력">
	</form>
</body>
</html>