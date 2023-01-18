<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	%>
	<jsp:useBean id="m" class="Bean.PersonBean">
		<jsp:setProperty property="*" name="m" />
	</jsp:useBean>
	
	이름 : <jsp:getProperty property="name" name="m"/>
	별명 : <jsp:getProperty property="nickname" name="m"/>
	직업 : <jsp:getProperty property="job" name="m"/>
	이메일 : <jsp:getProperty property="email" name="m"/>
	
</body>
</html>