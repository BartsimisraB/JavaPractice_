<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="mem" class="bean.MemberBean"/>

		<jsp:setProperty property="name" name="mem" value="건상" />
		<jsp:setProperty property="name" name="mem"/>


	<!-- MemberBean mem = new MemberBean()  -->
<%-- <%
	mem.setName("건상");
	mem.setId("gunsang");
%> --%>

	이름 : <%=mem.getName()%>
	아이디 : <%=mem.getId()%>
	
</body>
</html>