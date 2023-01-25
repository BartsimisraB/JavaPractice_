<%@page import="mgr.MemberMgr"%>
<%@page import="mgr.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="memberbean" class="mgr.MemberBean">
	<jsp:setProperty name="memberbean" property="*"/>
</jsp:useBean>
<%
	MemberMgr mgr = new MemberMgr();
	mgr.insertMember(memberbean);
%>
<jsp:forward page="login.jsp"></jsp:forward>
<h4>완료</h4>

</body>
</html>