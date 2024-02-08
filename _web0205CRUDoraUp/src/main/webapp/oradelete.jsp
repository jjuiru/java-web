<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>   
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>

<%

request.setCharacterEncoding("utf-8");
//post 방식일때 한글이 깨질까봐
//String driver="oracle.jdbc.driver.OracleDriver";
String url="jdbc:oracle:thin:@localhost:1521:xe";
Connection conn = DriverManager.getConnection(url, "scott", "tiger");
String sql = "delete from score1 where num=?";
PreparedStatement pstmt = conn.prepareStatement(sql);


pstmt.setString(1, request.getParameter("num"));
int result = pstmt.executeUpdate();

%>
		<% response.sendRedirect("oralist.jsp"); %>
</body>

</html>