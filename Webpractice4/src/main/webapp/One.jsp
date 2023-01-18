<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("name", "준형");
	request.setAttribute("name", "건용");
	session.setAttribute("name", "현오");
	application.setAttribute("name", "형민");

	System.out.println(pageContext.getAttribute("name"));
	System.out.println(request.getAttribute("name"));
	System.out.println(session.getAttribute("name"));
	System.out.println(application.getAttribute("name"));

	request.setAttribute("One2.jsp", "name");
%>