<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="script/login.js"></script>
<title>로그인 홈</title>
</head>
<body>
	<b><font size="5" color="skyblue">메인화면입니다.</font></b>
	<br>
	<br>
	<%
	if (session.getAttribute("sessionID") == null) // 로그인이 안되었을 때
	{
		response.sendRedirect("login.jsp");
	} else {
	%>
	<%
	}
	%>
	<div align="center">
		<table border="1" bordercolor="skyblue" width="300">
			<tr height="50" align="center">
				<td><font color="red"><%=session.getAttribute("sessionID")%></font>
					님 로그인되었습니다.</td>
			</tr>
		</table>
		<br> <input type="button" value="로그아웃" onclick="logoutPro()">
	</div>
</body>
</html>