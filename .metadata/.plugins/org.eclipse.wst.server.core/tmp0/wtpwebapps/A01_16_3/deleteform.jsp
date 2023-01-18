<%@page import="bean.BoardBean"%>
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
	int num = Integer.parseInt(request.getParameter("num"));
	BoardDAO bdao = new BoardDAO();
	BoardBean bean = bdao.oneupdateBoard(num); 
%>
<center>
	<h2>게시글 삭제</h2>
<form action="updateproc.jsp" method="post">
	<table width="600" border="1" bordercolor="yellow" bgcolor="pink">
		<tr height="40">	
			<td width="150" align="center">작성자</td>	
			<td width="150" align="center"><%=bean.getWriter() %></td>	
			<td width="150" align="center">작성일</td>	
			<td width="150" align="center"><%=bean.getReg_date() %></td>	
		</tr>
		
		<tr height="40">
			<td width="150" aling="center">제목</td>
			<td width="150" aling="center"><%=bean.getSubject() %></td>
		</tr>
		
		<tr height="40">
			<td width="150" aling="center">비밀번호</td>
			<td width="450" colspan="3">&nbsp;
			<input type="password" name="password"></td>
		</tr>
		
		<tr height="40">
			<td colspan="4" aling="center">
			<input type="hidden" name="num" value="<%=num %>">
			<input type="submit" value="글 삭제">&nbsp;
			<input type="button" onclick="location.href='boardlist.jsp'" value="전체글보기">
			</td>
		</tr>
	</table>
	</form>
</center>
</body>
</html>