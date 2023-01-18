<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script defer type="text/javascript" src='param.js'></script>
</head>
<body>
	
	<form method ="get" action ="ParamServlet" name="fr">
		id : <input type="text" name = "id"><br>
		study : <input type = "text" name = "st"><br>
		age : <input type = "text" name = "age"><br>
		
		<input type="submit" value="전송" onclick ="return ch()">
	</form>
</body>
</html>