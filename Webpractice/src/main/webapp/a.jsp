<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <%!String str = "Hi";
	int a = 5;
	int b = -4;

	public int max(int a, int b) {
		return a > b ? a : b;
	}%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%--<%
	out.print(str + "<br>");
	out.print(max(a, b));
	%> --%>
	
	<%-- <%=str%><br>
	<%=max(a, b)%> --%>
	<%
		int i = 0, sum = 0;
		for(i = 1; i <= 10; i++) {
			if(i < 10) {
	%>		<%=i + " + " %> <!-- 1+2+3+4+5+6+7+8+9 -->
			
	<%		}
			else{
				out.print(i + "=");	//1+2+3+4+5+6+7+8+9+10=
			}
			sum +=i;
		}
	%>
	<%=sum %>
</body>
</html>