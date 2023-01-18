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
		String name = request.getParameter("name");
		String color[] = request.getParameterValues("color");
	%>

	<%=name %>이 좋아하는 색은
	<% for(String c : color){
		if(c.equals("red")){
			out.write("red");
		}
		else if(c.equals("yellow")){
			out.write("yellow");
		}
		else{
			out.write("blue");
		}
	}%>이다.
</body>
</html>