<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Action2.jsp">
	ID : <input type = "text" name= "id">
	PW : <input type = "password" name= "pw">

	<input type="radio" name="Login" value="user" checked="checked"> 사용자
	<input type="radio" name="Login" value="manager"> 관리자
	
	<input type = "submit" value = "로그인">
	
	</form>
	
</body>
</html>