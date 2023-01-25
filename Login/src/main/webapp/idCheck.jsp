<%@page import="mgr.MemberBean"%>
<%@page import="mgr.MemberMgr"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="script/login.js"></script>
<title>id 중복 확인</title>
</head>
<body>
	<%
	String inputid = request.getParameter("id");
	MemberMgr mgr = new MemberMgr();
	MemberBean bean = new MemberBean();
	String id = mgr.getId(bean.getId());
	%>
	<div style="text-align: center">
		<h3>* 아이디 중복확인 *</h3>
		<form method="post" action="idCheckProc.jsp"
			onsubmit="return blankCheck(this)">
			아이디 : <input type="text" name="id" maxlength="10" autofocus>
			<input type="submit" value="중복확인">
		</form>
	</div>
</body>
</html>