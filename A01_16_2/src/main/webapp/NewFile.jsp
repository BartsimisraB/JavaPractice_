<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
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
	Context ctx = new InitialContext();
	Context envctx = (Context)ctx.lookup("java:comp/env");
	//데이터 소스 객체 선언 
	DataSource ds = (DataSource)envctx.lookup("jdbc/pool");
	Connection con = ds.getConnection();
	out.print("DBCP 연동 성공");
	
%>
</body>
</html>