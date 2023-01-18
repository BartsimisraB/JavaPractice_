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
	String id = (String)session.getAttribute("id3");
	String pw = (String)session.getAttribute("pw3");
	Integer score = (Integer)session.getAttribute("score");
%>

<%=id %>
<%=pw %>
<%=score %>
</body>
</html>