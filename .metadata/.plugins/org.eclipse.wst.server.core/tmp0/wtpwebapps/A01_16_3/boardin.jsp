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
	request.setCharacterEncoding("utf-8");
	int num = Integer.parseInt(request.getParameter("num"));
	BoardDAO bdao = new BoardDAO();
	
	BoardBean bean = bdao.oneBoard(num);

%>
<center>
	<table width="600" border="1" bgcolor="pink">
		<tr height="40">
			<td align="center" width="150">글번호</td>
			<td align="center" width="150"><%=bean.getNum() %></td>
			
			<td align="center" width="150">조회수</td>
			<td align="center" width="150"><%=bean.getReadcount() %></td>
		</tr>
		
		<tr height="40">
			<td align="center" width="150">작성자</td>
			<td align="center" width="150"><%=bean.getWriter()%></td>
			
			<td align="center" width="150">작성날짜</td>
			<td align="center" width="150"><%=bean.getReg_date() %></td>
		</tr>
		
		<tr height="40">
			<td align="center" width="150">이메일</td>
			<td align="center" width="150" colspan="3"><%=bean.getEmail()%></td>
		</tr>
		
		<tr height="40">
			<td align="center" width="150">제목</td>
			<td align="center" width="150" colspan="3"><%=bean.getSubject()%></td>
		</tr>
		
		<tr height="40">
			<td align="center" width="150">글내용</td>
			<td align="center" width="150" colspan="3"><%=bean.getContent()%></td>
		</tr>	
	
		<tr height="40">
		<td align="center" colspan="4">
		<input type="button" value="댓글쓰기" 
		onclick="location.href='rewriteform.jsp?num=<%=bean.getNum() %>&ref=<%=bean.getRef() %>&re_step=<%=bean.getRe_step() %>&re_level=<%=bean.getRe_level() %>'">
			
			<input type="button" value="수정" 
			onclick="location.href='updateform.jsp?num=<%=bean.getNum() %>'">
			
			<input type="button" value="삭제" 
			onclick="location.href='deleteform.jsp?num=<%=bean.getNum() %>'">
			
			<input type="button" value="목록" 
			onclick="location.href='boardlist.jsp'">
		</td>
		</tr>
	</table>

</center>
</body>
</html>