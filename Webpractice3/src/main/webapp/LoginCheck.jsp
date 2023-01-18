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
		String aa = request.getParameter("aa");
	%>
	<p style="background:<%=aa %>"> 나는 <%=aa %>색을 좋아한다</p>
</body>
</html>