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
<c:forTokens items="서울.대구,부산" var="city" delims=",">
	${city }<br>
</c:forTokens>

<%-- <c:redirect url="color.jsp"></c:redirect> --%>

<c:set var="age" value="22" scope="page"></c:set>
나이 : <c:out value="${age }"></c:out><br>

<c:remove var="age" scope="page"/>
나이 : <c:out value="${age }"/><br>

<c:catch var="err">
	예외 전<br>
	<%=1/0 %><br>
	예외 후<br>
</c:catch>

<c:out value="${err }"/>
</body>
</html>