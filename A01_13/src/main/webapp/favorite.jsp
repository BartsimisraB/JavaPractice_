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
	request.setCharacterEncoding("UTF-8");
%>

<jsp:useBean id="m" class="co.sjw.movie.FavoBean">
	<jsp:setProperty property="*" name="m"/>
</jsp:useBean>

좋아하는 색 : <jsp:getProperty property="color" name="m"/>
좋아하는 음악 : <jsp:getProperty property="music" name="m"/>
</body>
</html>