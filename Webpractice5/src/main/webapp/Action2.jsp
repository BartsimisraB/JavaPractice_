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
	request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String role = request.getParameter("Login");

	if (role.equals("user")) {
	%>
	<!-- forward의 특성으로 
	>> 서버 상에서 처리하기 때문에 
	>> 브라우저는 알아채지 못하고 URL도 변경되지 않는다.
		로 인해 request가 2번 호출되어도 살아있다. -->
	<jsp:forward page = "ActionMain.jsp">
		<jsp:param value='<%=URLEncoder.encode("고객들","UTF-8") %>' name="userName"/>
	</jsp:forward>
	<%
	} else {
	%>
	<jsp:forward page="ActionMain2.jsp">
		<jsp:param value='<%=URLEncoder.encode("고객관리","UTF-8") %>' name="userName"/>
	</jsp:forward>
	<%
	}
	%>
</body>
</html>