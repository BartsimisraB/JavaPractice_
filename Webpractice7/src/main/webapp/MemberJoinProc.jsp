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
	request.setCharacterEncoding("UTF-8");
	%>
	<!-- request로 넘어온 데이터를 자바빈즈랑 매핑시켜주는 useBean -->

	<jsp:useBean id="sbean" class="bean.StuBean">
		<!-- 객체 생성 StuBean sbean = new StuBean(); -->

		<!-- jsp 내용을 자바빈 클래스에 데이터를 매핑(넣어)해준다 -->
		<jsp:setProperty name="sbean" property="*" />
		<!-- 자동으로 전부 다 매핑시켜라 -->
	</jsp:useBean>

	<h3>
		아이디는
		<jsp:getProperty property="id" name="sbean" /></h3>
	<h3>
		이메일은
		<jsp:getProperty property="email" name="sbean" /></h3>
	<h3>
		전화번호
		<%=sbean.getTel()%></h3>


</body>
</html>