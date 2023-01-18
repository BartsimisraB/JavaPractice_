<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<body>

<c:if test="${param.color==1 }">
	<span style="color:red;">red</span>
</c:if>

<c:if test="${param.color==2 }">
	<span style="color:orange;">orange</span>
</c:if>

<c:if test="${param.color==3 }">
	<span style="color:yellow;">yellow</span>
</c:if>


</body>
</html>