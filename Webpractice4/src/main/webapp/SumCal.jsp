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
	int i = 0;
	int sum = 0;
	while(i<11){
		sum += i;
		i++;
	}
%>
	합은 : <%=sum %>
</body>
</html>