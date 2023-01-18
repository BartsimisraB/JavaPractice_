<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="param" method="POST" onsubmit="return emptycheck()">
ID : <input type="text" name="id" placeholder="필수입력"><br>
나이 : <input type="text" name="age" placeholder="필수입력"> <br>
<input type="submit" value="전송">
</form>
</body>
</html>