<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%request.setCharacterEncoding("utf-8");%>
<jsp:forward page="two.jsp">
<jsp:param value="Tom" name="name"/>
<jsp:param value="tennis" name="hobby"/>
</jsp:forward>
</body>
</html>