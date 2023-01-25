<%@page import="java.util.List"%>
<%@page import="mgr.MemberBean"%>
<%@page import="mgr.MemberMgr"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="script/login.js"></script>
<title>Insert title here</title>
</head>
<body>
	<%
	MemberMgr mgr = new MemberMgr();
	MemberBean bean = new MemberBean();

	String id = request.getParameter("id");
	String pwd = request.getParameter("pw");

	int check = mgr.loginCheck(id, pwd);
	String msg = "";

	if (check == 1) {
		session.setAttribute("sessionID", id);
		msg = "mainForm.jsp";
	} else if (check == 0) {
		msg = "login.jsp?msg=0";
	} else {
		msg = "login.jsp?msg=-1";
	}

	response.sendRedirect(msg);
	%>



</body>
</html>