<%@page import="bean.BoardDAO"%>
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
	<jsp:useBean id="boardbean" class="bean.BoardBean">
		<jsp:setProperty name="boardbean" property="*" />
	</jsp:useBean>

	<%
	BoardDAO bdao = new BoardDAO();
	String pass = bdao.getPass(boardbean.getNum());

	if (pass.equals(boardbean.getPassword())) {
		bdao.updateBoard(boardbean);
		response.sendRedirect("boardlist.jsp");
	}
	else {
	%>
		<script type="text/javascript">
			alert("패스워드 불일치! 다시 입력하세요");
			hitory.go(-1);
		</script>
	<%
	} 
	%>
	
</body>
</html>