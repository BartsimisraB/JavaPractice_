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
	<jsp:setProperty property="*" name="mbean"/>
</jsp:useBean>

<%
	String id=request.getParameter("id");
	MemberDAO mdao=new MemberDAO();
	
	String pass=mdao.getPass(id);
	//데이터베이스에서 가져온 패스워드를 가져와야한다.
	
	if(mbean.getPass1().equals(pass)){
		mdao.updateMember(mbean);
		response.sendRedirect("MemberArray.jsp");
		
		//데이터베이스 패스와 입력값이 같다면 member테이블을 수정하겠다.
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