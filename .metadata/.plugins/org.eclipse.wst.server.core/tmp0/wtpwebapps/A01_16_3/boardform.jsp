<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<h2>게시글</h2>
<form action="boardwriteform.jsp" method="post">
	<table width="600" border="1" bordercolor="tomato" bgcolor="gray">
		<tr height="50">
			<td width="150" align="center">작성자</td>
			<td width="450"><input type="text" name="writer" size="50"></td>
		</tr>
		<tr height="50">
			<td width="150" align="center">제목</td>
			<td width="450"><input type="text" name="subject" size="50"></td>
		</tr>
		<tr height="50">
			<td width="150" align="center">이메일</td>
			<td width="450"><input type="email" name="email" size="50"></td>
		</tr>
		<tr height="50">
			<td width="150" align="center">비밀번호</td>
			<td width="450"><input type="password" name="password" size="50"></td>
		</tr>
		<tr height="50">
			<td width="150" align="center">글내용</td>
			<td width="450">
				<textarea rows="10" cols="50" name="content" size="60"></textarea>
			</td>
		</tr>
		<tr height="40">
			<td align="center" colspan="2">
				<input type="submit" value="작성 완료">
				<input type="reset" value="재작성">
				<input type="button" value="전체글 보기" onclick="location.href='boardlist.jsp'">
			</td>
		</tr>
	</table>
</form>
</center>
</body>
</html>