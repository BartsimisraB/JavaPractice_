<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=session.getAttribute("id") %> 님 환영합니다.
<%String id= request.getParameter("id");
		%><br>
<%=id %> 님 환영합니다.
</body>
</html>