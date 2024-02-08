<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
    Cookie cookie = new Cookie("userId", null);
    cookie.setMaxAge(0);//쿠키값 삭제           
    response.addCookie(cookie); //파일안의 쿠키도 지우기
        
    response.sendRedirect("8-1.jsp");   // 로그인 메인 화면으로 돌아감
%>