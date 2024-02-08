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
Class.forName("oracle.jdbc.driver.OracleDriver");
try ( 
    Connection conn = DriverManager.getConnection(
    		"jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
        Statement stmt = conn.createStatement();
    ) {
        
        String[][] score1 = {
            { "1", "이지현", "50", "60", "70" }, 
            { "2", "이수현", "65", "75", "85" }, 
            { "3", "이지현", "60", "80", "70" }
        };
        
        for (int i = 0; i < score1.length; i++) {
            String sql = String.format(
                    "insert into score1 values (%s, '%s', %s, %s, %s)",
                    score1[i][0], score1[i][1], score1[i][2], 
                    score1[i][3], score1[i][4]);
            
            stmt.executeUpdate(sql);
            out.println("쿼리 실행 성공 : " + sql + "<br>");
        }
        
    } catch(Exception e) {
        e.printStackTrace();
    }
%>

</body>
</html>