<%@page import="bean.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<body>
<%
	request.setCharacterEncoding("utf-8");

%>
<jsp:useBean id="boardbean" class="bean.BoardBean">
	<jsp:setProperty name="boardbean" property="*"/>
</jsp:useBean>
<%
	BoardDAO bdao = new BoardDAO();
	bdao.rewriteBoard(boardbean);
	
	response.sendRedirect("boardlist.jsp");
%>


</body>