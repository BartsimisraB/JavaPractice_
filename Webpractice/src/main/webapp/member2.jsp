<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script defer type="text/javascript" src="member2.js"></script>
<title>Insert title here</title>
</head>
<body>
	<form action="Hello" method="get" name="f">

		아이디:<input type="text" name="id"><br> 
		나이:<input type="text" name="age"><br> 
		<input type="submit" value="전송" onclick="return check()">

	</form>
</body>
</html>