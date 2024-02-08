<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel=”stylesheet” href=”css/style.css?55” >
</head>
<style>
input[type="text"] {
	border-radius: 10px; /* 둥근 테두리를 설정합니다. */
	padding: 5px 10px; /* 내부 여백을 추가하여 텍스트 상자의 크기를 조정합니다. */
}

input[type="password"] {
	border-radius: 10px; /* 둥근 테두리를 설정합니다. */
	padding: 5px 10px; /* 내부 여백을 추가하여 텍스트 상자의 크기를 조정합니다. */
	color: #01B0F3;
}

input[type="submit"] {
	border-radius: 5px; /* 둥근 테두리를 설정합니다. */
	padding: 5px 10px; /* 내부 여백을 추가하여 텍스트 상자의 크기를 조정합니다. */
	color: #FF483A;
}

input[type="reset"] {
	border-radius: 5px; /* 둥근 테두리를 설정합니다. */
	padding: 5px 10px; /* 내부 여백을 추가하여 텍스트 상자의 크기를 조정합니다. */
	color: #01B0F3;
}
</style>
<body>
<h1>테스트 텍스트</h1>
	<form action="select.jsp">
		<br><br><br><br><br><br><br><br><br>
		<div style="text-align: center">
			<img src="im/스크린샷_2024-02-01_174913-removebg-preview.png"> <br />
			<br />
			<br />
			<pre>
ID      <input type="text" name="id" /><br /><br />
PASS    <input type="password" name="pass"/><br /><br />

        <input type="submit" value="로그인" />   <input type="reset"
					value="지우기" />
		
</pre>
		</div>
	</form>
</body>
</html>