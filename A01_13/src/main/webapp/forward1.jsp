<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:forward page="forward2.jsp">
		<jsp:param name="name" value="홍길동"/>
		<jsp:param name="hobby" value="수영"/>
	</jsp:forward>
</body>
</html>