<%@page import="java.sql.ResultSet"%>
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
<% String url="jdbc:oracle:thin:@localhost:1521:xe";
Connection conn = DriverManager.getConnection(url, "scott", "tiger");
String sql = "select * from score1 where num=?";
PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setString(1, request.getParameter("num"));
ResultSet rs= pstmt.executeQuery();
String num= "";
String name= "";
String kor= "";
String eng= "";
String math= "";
if(rs.next()){//무조건 한 건은 찾는다(기본키라)
	num= rs.getString("num");
	name= rs.getString("name");
	kor= rs.getString("kor");
	eng= rs.getString("eng");
	math= rs.getString("math");	
}
%>
<br/><br/>
<br/><br/>
<div style="text-align: center">
<h1 style="border: 3">성적 입력하기</h1>
<h6 style="border: 1">*같은학번을 중복으로 저장할 수 없습니다*</h6>

_______________________________________________________
<br/><br/>
<a href="index.jsp">처음으로</a>
<!--  	<form action="oraupdate.jsp" method="post"> -->
<form method="post" id="frm">
        학번 :  <input type="text" name="num" value="<%=num %>"/><br /> <br /> 
        이름 :  <input type="text" name="name" value="<%=name %>"/><br /> <br /> 
		국어 :  <input type="text" name="kor" value="<%=kor %>"/><br /> <br /> 
		영어 :  <input type="text" name="eng" value="<%=eng %>"/><br /> <br /> 
		수학 :  <input type="text" name="math" value="<%=math %>"/><br /> <br /> 
<!-- 		<input type="submit" value="수정" /> -->	
<!--  		<button>수정</button>-->
		<br/><br/>
_______________________________________________________
		<br/>
	</form>
	<input type="button" onclick="update()" value="수정">
	<button onClick ="delete2()">삭제</button>
	<script>
	funtion delete2(){
     	lcation.href='oradelete.jsp?num=<%=num%>';
		document.getElementById('frm').action='oradelete.jsp';
		document.getElementById('frm').submit();
	}
	
	funtion up(){
		document.getElementById('frm').action='oraupdateForm.jsp';
		document.getElementById('frm').submit();
	}
	
	
	</script>
	
			<button onClick="location.href='oradelete.jsp?num=<%=num%>'">삭제</button>
<!-- 			자바스크립트 코드 onclick -->
	<br/>
	<br/><br/>
	</div>
</body>
</html>