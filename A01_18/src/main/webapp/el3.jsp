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
	pageContext.setAttribute("name", "건상");
	request.setAttribute("name", "한빈");
	session.setAttribute("name", "준형");
	application.setAttribute("name", "형민");
	
%>
<!-- pageContext.getAttribute("name");-->
${name }<br>
${pageScope.name }<br>

<!-- request.getAttribute("name") -->
${requestScope.name }<br>

<!-- session.getAttribute("name") -->
${sessionScope.name }<br>

<!-- application.getAttribute("name") -->
${applicationScope.name }<br>
</body>
</html>