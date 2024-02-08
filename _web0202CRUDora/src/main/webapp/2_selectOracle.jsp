<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>   
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        table { width: 400px; text-align: center; }
        th    { background-color: #A6AAAA; border-radius: 7px; }
    </style>    
</head>
<body>
<br/><br/>
<br/><br/>
<br/><br/>
<br/><br/>
<br/><br/>
<div style="text-align: center">
<h1 style="border: 3">2024 java class 성적표</h1>
<h6 style="border: 1">update 2024.02.02</h6>

_______________________________________________________
<br/><br/>

<table style="margin: 0 auto;">
    <tr>
        <th>번호</th><th>이름</th>
        <th>국어</th><th>영어</th><th>수학</th>
        <th>총점</th><th>평균</th>
    </tr>
<%
request.setCharacterEncoding("UTF-8");
    Class.forName("oracle.jdbc.driver.OracleDriver");
    try ( 
        Connection conn = DriverManager.getConnection(
        		"jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from score");
    ) {
        while (rs.next()) {
            int sum = rs.getInt("kor") + rs.getInt("eng") + 
                      rs.getInt("math");
%>        

            <tr>
                <td><%=rs.getInt   ("num")%></td>
                <td><%=rs.getString("name")%></td>
                <td><%=rs.getInt   ("kor" )%></td>
                <td><%=rs.getInt   ("eng" )%></td>
                <td><%=rs.getInt   ("math")%></td>
                <td><%=sum%></td>
                <td><%=String.format("%.2f", (float)sum / 3)%></td>
                
<td><a href="3_deleteOracle.jsp?num=<%= rs.getString("num") %>" style="background-color: #7EDBFE; color: #fff;  border-radius: 3px; text-decoration: none;">삭제</a></td>
<td><a href="7_updateOracleForm.jsp?num=<%=rs.getString("num")%>" style="background-color: #7EDBFE; color: #fff;  border-radius: 3px; text-decoration: none;">수정</a></td>
                

            </tr>

<%          
        }
        
    } catch(Exception e) {
//        e.printStackTrace();
    }
%>
</table>
_______________________________________________________
<br/><br/>
<button onclick="location.href='1_indexOracle.jsp'">메인화면</button>
			<br/><br/>
<button onclick="location.href='6_insertOracleForm.jsp'">입력화면</button>
	<br/>

</div>
</body>
</html>