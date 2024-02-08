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

    request.setCharacterEncoding("UTF-8");
    Class.forName("oracle.jdbc.driver.OracleDriver");
    try { 
    	Connection conn = DriverManager.getConnection(
        		"jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
    	String sql = "update score set name=?,kor=?,eng=?,math=? where num=?";
    	PreparedStatement pstmt = conn.prepareStatement(sql);

    	pstmt.setString(1, request.getParameter("name"));
    	pstmt.setString(2, request.getParameter("kor"));
    	pstmt.setString(3, request.getParameter("eng"));
    	pstmt.setString(4, request.getParameter("math"));
       	pstmt.setString(5, request.getParameter("num"));  
    	
    	int result = pstmt.executeUpdate();
    	if(result==1){
    		out.println("수정 성공");
    	}	
        
    } catch(Exception e) {
        e.printStackTrace();
        out.println("수정 실패");
    }
%>
		<% response.sendRedirect("2_selectOracle.jsp"); %>
</body>
</html>