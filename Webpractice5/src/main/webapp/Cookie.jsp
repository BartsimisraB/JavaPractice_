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
	//1. 쿠키 객체 생성
	Cookie c = new Cookie("id","gildong");
	Cookie c2 = new Cookie("id2","crong");

	//2. 유효 시간 설정
	c.setMaxAge(60*60*24*10);//10일
	
	//3. 클라이언트에 쿠키 전송
	response.addCookie(c);
	response.addCookie(c2);
	
	response.addCookie(new Cookie("pw","1234"));
	
%>
</body>
</html>