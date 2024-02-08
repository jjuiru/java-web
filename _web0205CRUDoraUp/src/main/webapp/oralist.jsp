<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!--insert 파일과 Form 파일은 requset 기본객체를 공유하여 사용한다. 그래서 인코딩 방법을 맞춰야한다.  -->
<title>Insert title here</title>
</head>
<body>
<br/><br/>
<br/><br/>
<div style="text-align: center">
  

<table>
    <tr>
        <th>번호</th><th>이름</th>
        <th>국어</th><th>영어</th><th>수학</th>
                <th>총점</th><th>평균</th>
    </tr>

<%
    Class.forName("oracle.jdbc.driver.OracleDriver");
    try ( 
        Connection conn = DriverManager.getConnection(
        		"jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from score1");
    ) {
        while (rs.next()) {
        	int num = rs.getInt("num");
            int sum = rs.getInt("kor") + rs.getInt("eng") + 
                      rs.getInt("math");
%>          
            <tr>
                <td><a href="oraupdateForm2.jsp?num=<%=num%>"><%=num %></a></td>
                <!-- post방식으로 보낼 순 없다. 스크립트에서는 가능 -->
                <td><a href="oraupdateForm2.jsp?num=<%=num%>"><%=rs.getString("name")%></a></td>
                <td><a href="oraupdateForm2.jsp?num=<%=num%>"><%=rs.getInt   ("kor" )%></a></td>
                <td><a href="oraupdateForm2.jsp?num=<%=num%>"><%=rs.getInt   ("eng" )%></a></td>
                <td><a href="oraupdateForm2.jsp?num=<%=num%>"><%=rs.getInt   ("math")%></a></td>
                <td><%=sum%></td>
                <td><%=String.format("%.2f", (float)sum / 3)%></td>
            </tr>
<%          
        }
        
    } catch(Exception e) {
        e.printStackTrace();
    }
%>
</table>
</div>
</body>
</html>