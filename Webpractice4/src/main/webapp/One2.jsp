<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=pageContext.setAttribute("name", "준형")%>
	<%=request.setAttribute("name", "건용")%>
	<%=session.setAttribute("name", "현오")%>
	<%=application.setAttribute("name", "형민")%><br>
	
	<a href="One3.jsp">다른 페이지</a>
</body>
</html>