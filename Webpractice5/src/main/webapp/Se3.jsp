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

	if(session.getAttribute("user")==null){
		response.sendRedirect("Se.jsp");	
	}
	else{
%>
	<%=session.getAttribute("user")%>님 안녕하세요.
	<form method="post" action = "Se4.jsp">
		<input type="submit" value="로그아웃">
	</form>
<%	
	}
%>
</body>
</html>