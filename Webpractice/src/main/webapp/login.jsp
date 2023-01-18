<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="LoginServlet" name="fr">
		<!-- 		<label for="id">id :</label>
		<input type="text" name="idx" id="id"><br>
		id라는 라벨을 클릭해도 텍스트를 입력하도록 하려면 input에 label의 이름 id를 입력해야한다.
		<input type="submit" value="전송"> -->
		<label for="gender">성별 :</label> 
		<input type="radio" name="gender" id="gender" value ="man" checked>남자
		<input type="radio" name="gender" id="gender" value ="woman">여자<br><br>
	
		<label for="con">자기소개</label>
		<textarea id="con" name="con" rows="3" cols="30"></textarea>
		
		<input type="submit" value="전송">
	</form>
</body>
</html>