<%@page import="bean.MemberDAO"%>
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
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="mbean" class="bean.MemberBean">
	<jsp:setProperty name="mbean" property="*"/>
</jsp:useBean>

<%
	MemberDAO mdao=new MemberDAO();

	String pass=mdao.getPass(mbean.getId());
	
	if(mbean.getPass1().equals(pass)){
		mdao.deleteMember(mbean.getId());
		response.sendRedirect("MemberArray.jsp");
	}
	else{
%>	
	<script type="text/javascript">
		alert("패스워드 틀렸다. 다시 입력해라");
		history.go(-1);
	</script>
<% 
	}%>	



</body>
</html>