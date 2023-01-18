<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:set var="msg" value="Hi" />
${msg }<br>

<c:set var="age">10</c:set>
${age }<br>

<c:set var="member" value="<%=new Bean.MBean() %>"/>
<c:set target="${member }" property="name" value="준형"/>
<c:set target="${member }" property="id" value="joonhyung"/>
${member }<br>

<c:set var="add" value="${10 + 5 }"/>
${add }<br>

<c:set var="aa" value="${10 > 5 }"/>
${aa }<br>
</body>
</html>