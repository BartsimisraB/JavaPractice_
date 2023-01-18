<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String []m = {"기생충", "스타이즈본", "아멜리에", "500일썸머"};
	
	pageContext.setAttribute("movie", m);
%>

<c:forEach var="mo" items="${movie }" varStatus="status">
	<c:choose>
		<c:when test="${status.first }">
			<li style="color:red">${mo }</li>
		</c:when>
		
		<c:otherwise>
			<li>${mo }</li>		
		</c:otherwise>
	</c:choose>
</c:forEach>

<c:forEach var="a" begin="1" end="10" varStatus="status">
	${a }
		<c:if test="${not status.last }"></c:if>
	
</c:forEach>
<!-- items속성의 집합체에 저장된 항목들이 순차적으로 var속성에 지정한 변수에 저장이 된다. -->
</body>
</html>