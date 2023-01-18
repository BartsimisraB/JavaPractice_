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
	
	<jsp:useBean id="m" class="co.sjw.movie.MovieBean">
		<jsp:setProperty property="*" name="m"/>
	</jsp:useBean>

	영화 제목 : <%=m.getTitle() %>
	가격 : <jsp.getProperty property="price" name="m">
	감독 : <jsp.getProperty property="director" name="m">
	시놉시스 : <jsp.getProperty property="synopsis" name="m">
	장르 : <jsp.getProperty property="genre" name="m">
</body>
</html>