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

	String trip = request.getParameter("trip");
	String overseas = request.getParameter("overseas");
	request.setCharacterEncoding("UTF-8");
%>
	국내 여행 : <%=trip %><br>
	해외 여행 : <%=overseas %><br>
	<a href="Trip.jsp">다시 조회 하기</a>
	
</body>
</html>