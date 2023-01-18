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
	//데이터가 넘어올 때 한글이 깨질 수 있기 때문에
	request.setCharacterEncoding("UTF-8");

	//사용자로부터 넘어온 데이터를 저장
	String id = request.getParameter("id");
	String pw1 = request.getParameter("pass1");
	String pw2 = request.getParameter("pass2");
	String email = request.getParameter("email");
	String tel = request.getParameter("tel");

	String hobby[] = request.getParameterValues("hobby");
	String movid = request.getParameter("movie");
	String age[] = request.getParameterValues("age");
	String info = request.getParameter("info");
	
	if(!pw1.equals(pw2)){
%>
	<script type="text/javascript">
	alert("비밀 번호가 틀립니다.");
	history.go(-1);
	</script>
<% 
	}
%>
	<%= id %>
<%
	for(int i = 0; i < hobby.length; i++){
%>
	<%=hobby[i] %>
<%
	}
%>


</body>
</html>