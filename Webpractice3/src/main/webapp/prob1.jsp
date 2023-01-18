<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="prob1_1.jsp">
	
	이름 : <input type="text" name="name"><br>
	<label for="gender">성별 : </label>
	<input type="radio" name="gender" id="gender" value="남자">남자
	<input type="radio" name="gender" id="gender" value="여자">여자
	<br>
	<label for="color">좋아하는 색 : </label>
	<input type="checkbox" name="color" value="파란색">파란색
	<input type="checkbox" name="color" value="붉은색">붉은색
	<input type="checkbox" name="color" value="노란색">노란색
	<br>
	<input type="submit" value="전송">
	<input type="reset" value="취소">
	</form>
</body>
</html>