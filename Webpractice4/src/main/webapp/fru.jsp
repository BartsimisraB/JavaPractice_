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
	String id = "asd";
	String pw = "1234";
	
	session.setAttribute("id", id);
	request.setCharacterEncoding("UTF-8");
	
	if(id.equals(request.getParameter("id"))&&pw.equals(request.getParameter("pw"))){
		response.sendRedirect("suc.jsp?id");
		
	}
	else {
		response.sendRedirect("log.jsp");
		%>
		alert("다시 입력");
		<%
	}
%>

</body>
</html>