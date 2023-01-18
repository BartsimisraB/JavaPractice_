<%@page import="java.net.URLEncoder"%>
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
	String id = "pink";
	String pw = "1234";
	String name = "건용";

	request.setCharacterEncoding("UTF-8");

	if (id.equals(request.getParameter("id")) && pw.equals(request.getParameter("pwd"))) {
		//쿼리 스트링
		response.sendRedirect("LoginM.jsp?name=" + URLEncoder.encode(name, "UTF-8"));
		//개발자가 직접 한글을 쿼리 스트링으로 만들어 페이지로 이동할 경우 
		//URLEncoder.encode 메소드로 인코딩 과정을 거쳐야 함
	} else {
		response.sendRedirect("Login.jsp");
	}
	%>
</body>
</html>