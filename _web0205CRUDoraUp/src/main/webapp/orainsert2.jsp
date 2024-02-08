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
String sql = "insert into score1(num, name, kor, eng, math) values(?,?,?,?,?)";
PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setString(1, request.getParameter("num"));
pstmt.setString(2, request.getParameter("name"));
pstmt.setString(3, request.getParameter("kor"));
pstmt.setString(4, request.getParameter("eng"));
pstmt.setString(5, request.getParameter("math"));

int result = pstmt.executeUpdate();
if(result==1){
	//반복문을 돌리면 여럭의 값도 저장 가능, 하지만 여기선 하나밖에 안됨!
	out.println("입력성공");
}


//    Class.forName("oracle.jdbc.driver.OracleDriver");
 //   try { 
  //  	Connection conn = DriverManager.getConnection(
  //      		"jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
 //   	String sql = "insert into score1(num, name, kor, eng, math) values(?,?,?,?,?)";
 //   	PreparedStatement pstmt = conn.prepareStatement(sql);
 //   	pstmt.setString(1, request.getParameter("num"));
 //   	pstmt.setString(2, request.getParameter("name"));
 //   	pstmt.setString(3, request.getParameter("kor"));
 //   	pstmt.setString(4, request.getParameter("eng"));
  //  	pstmt.setString(5, request.getParameter("math"));
    	
 //   	int result = pstmt.executeUpdate();
 //   	if(result==1){
 //   		out.println("입력성공");
 //   	}
        
//    } catch(Exception e) {
 //       e.printStackTrace();
		
 //   } 
%>
		<% response.sendRedirect("oralist.jsp"); %>
</body>

</html>