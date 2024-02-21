<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%
    request.setAttribute("name","홍길동"); //포워딩 된 것으로 가정!
    request.setAttribute("arr2",new int[]{10,20,30,40,50});
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

${intArray=[100,200,300,400,500]; ''}
<!-- 배열을 {}중괄호로 선언하면 문자열의 집합으로 인식한다. -->
<c:forEach var="v" items="${intArray}" varStatus="st">
${v} : ${st.index} : ${st.count}<br>
</c:forEach>


${sum=0}<br>
<c:forEach var="i" begin="1" end="10">
${i;''}<br>
${sum=sum+i }<br>
</c:forEach>
1~10까지의 합: ${sum}<br>

<c:forEach var="i" begin="0" end="10" step="2" varStatus="sta">
${i}<br>
${s=s+i;'' }<br>
</c:forEach>
1~10까지의 합: ${s}<br>

${name}<br>
${aaa='100'}<br>
${aaa+100}<br>
${aaa=aaa+10}<br>
${"10"+1}<br>
${null+10}<br>
${null+null}<br> <!-- null을 자동으로 0으로 계산한다. -->

</body>
</html>