<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String age = request.getParameter("age");
	String name = (String)request.getAttribute("name");

%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="orange">
	이동 페이지<br>
	
	<%=age %><br>
	<%=name %>
	
	
</body>
</html>