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
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
  </head>
  <body>

<% if (login) {          // 로그인 상태일 때의 출력 
%>
         <form action="sessionloginForm.jsp" method="post" onsubmit="return confirmLogout()"> <!--8-3.jsp:로그아웃 처리--> 
            <%=memberId%>님 로그아웃 하시겠습니까?
            <input type="submit" class="btn btn-dark" value="로그아웃"> 
        </form>
<script>
function confirmLogout() {
    return confirm("로그아웃 되었습니다.");
}
</script>
<!--     <button onclick="location.href='loginCK.jsp'">로그아웃</button>  -->
    <br/>   
<div class="container" style="padding-top: 50px;">
<table class="table table-bordered table-hover">
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
             <!--  <input type="button" value="글쓰기" onclick="location.href='write.jsp'">-->
             <!-- onclick="location.href='write.jsp?num=num'"> -->
 <button type="button" class="btn btn-dark" onclick="location.href='write.jsp'" >글쓰기</button>
</div>
<% } else{%>
<script>
alert('접근 권한이 없습니다. 로그인 해주세요!');
	 location.href = "member/sessionLoginForm.jsp";
	 </script>
<% }%>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
  </body>
</html>



