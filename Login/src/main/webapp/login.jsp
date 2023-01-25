<%@page import="mgr.MemberBean"%>
<%@page import="mgr.MemberMgr"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">	
<link rel="stylesheet" type="text/css" href="css/login.css">
<script defer type="text/javascript" src="script/login.js"></script>
<title>Insert title here</title>
</head>
<body>

<center>
<div></div>
	<form action="loginProc.jsp" name="form" method="post"
		onsubmit="return checkValue(this)">
		<table>
			<tr>
				<td bgcolor="skyblue">아이디</td>
				<td>
				
				<input type="text" name="id" maxlength="50"></td>
			</tr>
			<tr>
				<td bgcolor="skyblue">비밀번호</td>
				<td><input type="password" name="pw" maxlength="50"></td>
			</tr>
		</table>
		<br> <input type="submit" value="로그인" /> <input type="button"
			value="회원가입" onclick="goJoinForm()" />

	<%
	String msg = request.getParameter("msg");

	if (msg != null && msg.equals("0")) {
		out.println("<br>");
		out.println("<font color='red' size='5'>비밀번호를 확인해 주세요.</font>");
	} else if (msg != null && msg.equals("-1")) {
		out.println("<br>");
		out.println("<font color='red' size='5'>아이디를 확인해 주세요.</font>");
	}
	%>
	</form>
</center>
</body>
</html>