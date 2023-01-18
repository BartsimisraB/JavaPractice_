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

	String name = request.getParameter("name");
	String gender[] = request.getParameterValues("gender");
	String color[] = request.getParameterValues("color");
	%>
	이름 :
	<%
	out.print(name + "<br>");
	%>

	성별 :<%
	for (String g : gender) {
		if (g.equals("남자")) {
			out.print("남자");
		} else if (g.equals("여자")) {
			out.print("여자");
		}
		;
	}
	%><br> 
	좋아하는 색은 :<%
	for (String c : color) {
		switch (c) {
		case "파란색":
			out.print("파란색");
			break;
		case "붉은색":
			out.print("붉은색");
			break;
		case "노란색":
			out.print("노란색");
			break;
		default:
			out.print("선택하지 않음");
		}
	}
	%>
</body>
</html>