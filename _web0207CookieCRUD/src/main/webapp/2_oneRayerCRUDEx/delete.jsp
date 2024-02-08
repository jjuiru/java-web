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
    Connection conn = null;
 
    Class.forName("oracle.jdbc.driver.OracleDriver");
    try { 
        conn = DriverManager.getConnection(
        		"jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
    	String sql = "delete from score where num= ?";
    	PreparedStatement pstmt = conn.prepareStatement(sql);
    	pstmt.setString(1, request.getParameter("num"));
    	pstmt.executeUpdate();
    	
        out.println("삭제완료");
        
    } catch(Exception e) {
        e.printStackTrace();
		
    } finally {
        if (conn != null) 
	          conn.close();
    }
	
%>
<% response.sendRedirect("index.jsp"); %>
</body>
</html>