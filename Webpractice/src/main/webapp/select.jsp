<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="SelServlet">
		<label for="job">직업</label>
		<select id="job" name="job" size="4" multiple="multiple">
			<option value="student">학생</option>	
			<option value="pro">프로그래머</option>
			<option value="teacher">선생님</option>
			<option value="doctor">의사</option>
		</select>
		<input type="submit" value="전송">
	</form>
</body>
</html>