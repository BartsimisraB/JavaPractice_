<%@page import="bean.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="boardbean" class="bean.BoardBean">
	<jsp:setProperty property="*" name="boardbean"/>
</jsp:useBean>

<%
	BoardDAO bdao = new BoardDAO();
	bdao.insertBoard(boardbean);	//폼에 작성한 데이터들이 테이블에 추가
	response.sendRedirect("boardlist.jsp");//페이지 이동

%>
</body>
</html>