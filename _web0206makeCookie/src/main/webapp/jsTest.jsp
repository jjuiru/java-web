<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<button onClick="test()">클릭</button>
<h1 id= "title">Hello JSP</h1>
<h1 class= "title2">Hello JSP2</h1>
<script>
function test() {
	let str=document.getElementById("title");
	let str2=document.querySelector("#title");
	let str3=document.querySelector(".title2");
	//<h1> 스크립트 안에 html을 사용하면 안된다.
	console.log("안녕 JSP",'이것도 나오나',str,str2,str3);
	str3.innerHTML="테스트";
}

</script>
</body>
</html>