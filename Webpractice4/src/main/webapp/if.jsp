<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="if1.jsp">
		이름 : <input type="text" name="name"><br>
		<label for="color">좋아하는 색</label>
		<select id="color" name="color" size="3">
		<option value="red">red</option>	
		<option value="yellow">yellow</option>
		<option value="blue">blue</option>	
		</select>
		<input type="submit" value="전송">
	</form>
</body>
</html>