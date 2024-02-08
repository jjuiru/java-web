<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
        table { width: 400px; text-align: center; }
        th    { background-color: cyan; }
	</style>
</head>
<body>
<%
    String userId = null;

    Cookie[] cookies = request.getCookies();           
    if (cookies != null) {
        for(Cookie cookie : cookies) {           
            if (cookie.getName().equals("userId")) { // userId 쿠키의 값을
                userId = cookie.getValue();          // 변수 userId에 넣음
                break;
            }
        }
    }
    
    if (userId != null) {          // 로그인 상태일 때의 출력 
%>
         <form action="logoutPS.jsp" method="post"> <!--8-3.jsp:로그아웃 처리--> 
            <%=userId%>님 로그아웃 하시겠습니까?
            <input type="submit" value="로그아웃"> 
        </form>

<!--     <button onclick="location.href='loginCK.jsp'">로그아웃</button>  -->
    <br/>
_______________________________________________________
<br/><br/>
<% 
String numU= "";
String nameU= "";
String korU= "";
String engU= "";
String mathU= "";

     Class.forName("oracle.jdbc.driver.OracleDriver");
try ( 
    Connection conn = DriverManager.getConnection(
            "jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery("select * from score where num = "+ request.getParameter("num"));
) {
    while (rs.next()) {
    	numU= rs.getString("num");
    	nameU= rs.getString("name");
    	korU= rs.getString("kor"); 
    	engU= rs.getString("eng");
    	mathU=rs.getString("math");
    }
}catch(Exception e) {
    e.printStackTrace();
}
%>
<form method="post" id="frm">
        학번 :  <input type="text" name="num" value="<%=numU %>"/><br /> <br /> 
        이름 :  <input type="text" name="name" value="<%=nameU %>"/><br /> <br /> 
		국어 :  <input type="text" name="kor" value="<%=korU %>"/><br /> <br /> 
		영어 :  <input type="text" name="eng" value="<%=engU %>"/><br /> <br /> 
		수학 :  <input type="text" name="math" value="<%=mathU %>"/><br /> <br /> 
<!-- 		<input type="submit" value="수정" /> -->	
<!--  		<button>수정</button>-->
	</form>
	<br/>
	<button onClick ="clean()">지우기</button>
	<button onClick ="insert()">입력</button>
	<button onClick ="update()">수정</button>
	<br/>
	______________________________________________________
    <br/>
    <br/>
<table>
    <tr>
        <th>번호</th><th>이름</th>
        <th>국어</th><th>영어</th><th>수학</th>
        <th>총점</th><th>평균</th><th>삭제</th>
    </tr>
<%
    Class.forName("oracle.jdbc.driver.OracleDriver");
    try ( 
        Connection conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from score where num= ?");
    ) {
        while (rs.next()) {
        	int num = rs.getInt("num");
        	
        	String name = rs.getString("name");
            int sum = rs.getInt("kor") + rs.getInt("eng") + 
                      rs.getInt("math");
%>          
            <tr>
                <td><%=rs.getInt   ("num" )%></td>
                <td><a href="index.jsp?num=<%=num %>"><%=name %></a></td>
                <td><%=rs.getInt   ("kor" )%></td>
                <td><%=rs.getInt   ("eng" )%></td>
                <td><%=rs.getInt   ("math")%></td>
                <td><%=sum%></td>
                <td><%=String.format("%.2f", (float)sum / 3)%></td>
                <td><a href="delete.jsp?num=<%=num %>">삭제</a></td>
            </tr>
<%          
        }
        
    } catch(Exception e) {
        e.printStackTrace();
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
		document.getElementById('frm').action='insert.jsp';
		document.getElementById('frm').submit();
	}
	
	function update(){
		document.getElementById('frm').action='update.jsp';
		document.getElementById('frm').submit();
	}	
	<%  
    } else {                       // 로그인되지 않은 상태일 때의 출력
%>
        <form action="loginPS.jsp" method="post"> <!--8-2.jsp:로그인 처리-->
            아이디:   <input type="text"     name="id">&nbsp;&nbsp;
            비밀번호: <input type="text" name="pw">
            <input type="submit" value="로그인"> 
        </form>
<%
    }
%>
	</script>
</body>
</html>