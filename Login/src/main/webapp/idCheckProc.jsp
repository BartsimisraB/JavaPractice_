<%@page import="mgr.MemberMgr"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="script/login.js"></script>
<title>아이디 중복 확인</title>
</head>
<body>
<body>
	<div style="text-align: center"></div>
	<h3>* 아이디 중복 확인 결과 *</h3>
	<%
	String id = request.getParameter("id");
	MemberMgr mgr = new MemberMgr();
	int cnt = mgr.duplecateID(id);
	out.println("입력 ID : <strong>" + id + "</stong>");
	if (cnt == 0) {
		out.println("<p>사용 가능한 아이디입니다.</p>");
		out.println("<a href='javascript:apply(\"" + id + "\")'>[적용]</a>");
	%>

	<script>
		function apply(id) {
			opener.document.frm.id.value = id;
			window.close();
		}
	</script>
	<%
	} else {
	out.println("<p style='color: red'>해당 아이디는 사용하실 수 없습니다.</p>");
	}
	%>
	<hr>
	<a href="javascript:history.back()">[다시시도]</a> &nbsp; &nbsp;
	<a href="javascript:window.close()">[창닫기]</a>




</body>
</html>