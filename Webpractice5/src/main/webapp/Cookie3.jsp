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
	Cookie c = new Cookie("id","");
	c.setMaxAge(0); // 쿠키의 유효기간 만료
	response.addCookie(c);
%>
	<a href="Cookie2.jsp">확인</a>
</body>
</html>