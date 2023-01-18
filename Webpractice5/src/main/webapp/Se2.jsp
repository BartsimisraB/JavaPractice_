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
	String id = "crong";
	String pw = "9999";
	String name = "크롱";
	
	if(id.equals(request.getParameter("id")) && pw.equals(request.getParameter("pwd"))){
		session.setAttribute("user", name);
		response.sendRedirect("Se3.jsp");
		
	}
	else {
	response.sendRedirect("Se.jsp");
	}
	
	
	
%>
</body>
</html>