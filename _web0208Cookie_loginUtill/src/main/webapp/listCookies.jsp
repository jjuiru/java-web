<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String nameU= "";
    String valueU= "";
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
        table { width: 400px; text-align: center; }
        th    { background-color: #04ADEE; }
	</style>
</head>
<body>
<h1>쿠키관리소<img src="images/pngwing.com.png" width="90" height="30" alt="쿠키"></h1>
<img src="images/선.png" width="420" height="20" alt="선">
<br /><br />
<form method="post" id="frm">
        쿠키 이름 :  <input type="text" name="name" value="<%=nameU %>"/><br /> <br /> 
        쿠키 값&nbsp;&nbsp;&nbsp;&nbsp;:  <input type="text" name="value" value="<%=valueU %>"/><br /> <br /> 
	</form>
	<button onClick ="clean()">초기화</button>
	<button onClick ="insert()">입력</button>
	<button onClick ="update()">수정</button>
	<br/>
<img src="images/선.png" width="420" height="20" alt="선">

<table>
    <tr>
        <th>쿠키이름</th><th>쿠키 값</th><th>삭제</th>
    </tr>
<%
Cookie[] cookies = request.getCookies();
if(cookies!= null && cookies.length>0){
	for(Cookie ck : cookies){
		if(!ck.getName().equals("JSESSIONID")){
		
	
%>
            <tr>
            	<td><%=ck.getName() %></td>
				<td><%=URLDecoder.decode(ck.getValue(), "utf-8") %></td>
				<td><a href="delCookie.jsp?name=<%=ck.getName() %>">삭제</a></td>
           </tr>
<%
		}
	  }
	}
%>
</table>
<script>
	function clean() {
		var el = document.getElementById('frm');
		for(var i=0; i<el.length; i++){
			el[i].value = '';
		}
	}	
	function insert(){
		document.getElementById('frm').action='mkCookie.jsp';
		document.getElementById('frm').submit();
	}
	
	function update(){
		document.getElementById('frm').action='upCookie.jsp';
		document.getElementById('frm').submit();
	}	
	</script>
</body>
</html>