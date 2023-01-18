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
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");

	session.setAttribute("ii", id);
	session.setMaxInactiveInterval(60);
%>
<form action = "Food3.jsp">
	좋아하는 음식은?
	<input type = "radio" name = "food" value="피자">피자
	<input type = "radio" name = "food" value="파스타">파스타
	<input type = "radio" name = "food" value="탕수육">탕수육
	
	<input type = "submit" value = "결과"	>
</form>
</body>
</html>