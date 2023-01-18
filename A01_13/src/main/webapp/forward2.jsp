<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");

	String ram =request.getParameter("name");
	String ram2 =request.getParameter("hobby");
%>

<%=ram %>님의 취미는 <%=ram2 %>입니다.
</body>
</html>