<%@page import="dto.Board"%>
<%@page import="java.util.List"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<%@ page import="java.sql.*" %>
<%
	String memberId = (String)session.getAttribute("MEMBERID");
 if(memberId==null){
 	response.sendRedirect("sessionLoginForm.jsp");
}
 boolean login = memberId == null ? false : true;
 BoardDao dao = BoardDao.getInstanec();
 List<Board> list = dao.selectList(); // selectList() 호출해보기
 

%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        table     { width:680px; text-align:center; }
        th        { background-color:cyan; }
        
        .num      { width: 80px; }
        .title    { width:230px; }
        .writer   { width:100px; }
        .regtime  { width:180px; }
                
        a:link    { text-decoration:none; color:blue; }
        a:visited { text-decoration:none; color:gray; }
        a:hover   { text-decoration:none; color:red;  }
    </style>
</head>
<body>

<% if (login) {          // 로그인 상태일 때의 출력 
%>
         <form action="sessionloginForm.jsp" method="post" onsubmit="return confirmLogout()"> <!--8-3.jsp:로그아웃 처리--> 
            <%=memberId%>님 로그아웃 하시겠습니까?
            <input type="submit" value="로그아웃"> 
        </form>
<script>
function confirmLogout() {
    return confirm("로그아웃 되었습니다.");
}
</script>
<!--     <button onclick="location.href='loginCK.jsp'">로그아웃</button>  -->
    <br/>   

<table>
    <tr>
        <th class="num"    >번호    </th>
        <th class="title"  >제목    </th>
        <th class="writer" >작성자  </th>
        <th class="regtime">작성일시</th>
        <th                >조회수  </th>
    </tr>
   <%   for(Board board: list) {   %>   
   
        <tr>
            <td><%=board.getNum()%></td>
            <td style="text-align:left;">
                <a href="view.jsp?num=<%=board.getNum()%>">
                    <%=board.getTitle()%>
                </a>
            </td>
            <td><%=board.getWriter()%></td>
            <td><%=board.getRegtime()%></td>
            <td><%=board.getHits()%></td>
        </tr>
        <% }%>
</table>

<br>
<input type="button" value="글쓰기" onclick="location.href='write.jsp'">
             <!-- onclick="location.href='write.jsp?num=num'"> -->
<% } else{%>
<script>
alert('접근 권한이 없습니다. 로그인 해주세요!');
	 location.href = "member/sessionLoginForm.jsp";
	 </script>
<% }%>
</body>
</html>



