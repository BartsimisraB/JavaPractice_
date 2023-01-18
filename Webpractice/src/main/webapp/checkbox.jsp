<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="CheckServlet">
		<input type="checkbox" name="ch" value="Java">자바
		<input type="checkbox" name="ch" value="C">C언어<br>
		<input type="checkbox" name="ch" value="DB">데이터베이스
		<input type="checkbox" name="ch" value="HTML">HTML
		
		<input type="submit" value="전송">
	</form>
</body>
</html>