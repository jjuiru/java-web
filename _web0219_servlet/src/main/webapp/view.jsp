
<%@page import="dto.Board"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>

<%

// 로그인체크
//String memberId = (String)session.getAttribute("MEMBERID");
//if(memberId==null){
//response.sendRedirect("sessionLoginForm.jsp");
//}
    // 지정된 글 번호 얻기
   
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        table { width:680px; text-align:center; }
        th    { width:100px; background-color:cyan; }
        td    { text-align:left; border:1px solid gray; }
    </style>
</head>
<body>

<table>
    <tr>
        <th>제목</th>
        <td>${member.title}</td>
    </tr>
    <tr>
        <th>작성자</th>
        <td>${member.writer}</td>
    </tr>
    <tr>
        <th>작성일시</th>
        <td>${member.regtime}</td>
    </tr>
    <tr>
        <th>조회수</th>
        <td>${member.hits}</td>
    </tr>
    <tr>
        <th>내용</th>
        <td>${member.content}</td>
    </tr>
</table>

<br>
<input type="button" value="목록보기" onclick="location.href='list.jsp'">
<input type="button" value="수정"
       onclick="location.href='write.jsp?num=${member.num}'">
<input type="button" value="삭제"
       onclick="location.href='delete.jsp?num=${member.num}'">
<!--get방식으로 값 전달한다.  -->
</body>
</html>
