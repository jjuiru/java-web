<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>   
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>
<br/><br/>
<br/><br/>
<div style="text-align: center">
<h1 style="border: 3">성적 정보 수정</h1>
<h6 style="border: 1">*학번은 수정할 수 없습니다*</h6>

_______________________________________________________

<%

    request.setCharacterEncoding("UTF-8");
    Class.forName("oracle.jdbc.driver.OracleDriver");
    try { 
    	Connection conn = DriverManager.getConnection(
        		"jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
    	String sql = "select * from score where num=?";
    	PreparedStatement pstmt = conn.prepareStatement(sql);
    	pstmt.setString(1, request.getParameter("num"));    	
    	ResultSet rs =pstmt.executeQuery();
    	String num=""; String name=""; String kor=""; String eng=""; String math="";
    	if (rs.next()) {
    	num=rs.getString("num");
    	name= rs.getString("name");
        kor= rs.getString("kor"); 
        eng= rs.getString("eng"); 
        math= rs.getString("math");
  	
    	}%>

<br/><br/>
	<form action="7_updateOracle.jsp" >
	    번호 : <input type="text" name="num" value="<%=num%>"/><br /> 
		이름 : <input type="text" name="name" value="<%=name%>"/><br /> 
		국어 : <input type="text" name="kor" value="<%=kor%>"/><br /> 
		수학 : <input type="text" name="eng"value="<%=eng%>" /><br /> 
		영어 : <input type="text" name="math"value="<%=math%>" /><br /> <br /> 
		<input type="submit" value="확인" /> 
		<input type="reset" value="지우기" />
		
	</form>
	<br/>
	<br/><br/>
<button onclick="location.href='1_indexOracle.jsp'">메인화면</button>
	<br/><br/>
    	

   <%  } catch(Exception e) {
        e.printStackTrace();		
    }%>
    </div>
</body>
</html>