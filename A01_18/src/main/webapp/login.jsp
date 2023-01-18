<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%=request.getParameter("id") %><br>
<%=request.getParameter("pw") %><br>

<br>

id : ${param.id }<br>
pw : ${param.pw }<br>

<br>

id : ${param["id"] }<br>
pw : ${param["pw"] }<br>

<br>

<%=request.getParameter("id") == "aa" %><br>
<%=request.getParameter("id").equals("aa") %><br>

<br>

${param.id == "aa" }<br>
${param.id.equals("aa") }<br>

<br>

${param["id"] == "aa" }<br>
${param["id"].equals("aa") }<br>

</body>
</html>