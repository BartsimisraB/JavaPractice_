<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Vector"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="mgr.ZipBean"%>
<%@page import="mgr.MemberMgr"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="./script/login.js" defer></script>
<title>우편번호 검색</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");
	String zipcode = request.getParameter("zipcode");

	MemberMgr mgr = new MemberMgr();
	ArrayList<ZipBean> list = mgr.allZip(zipcode);

	for (int i = 0; i < list.size(); i++) {
		ZipBean bean = list.get(i);
	%>
	<table width="400" border="1">
	<tr>
		<td width="100" align="center"><span id="zipcode"><%=bean.getZipcode()%></span></td>
		<td width="100" align="center" id="addr1"><%=bean.getArea1()%></td>
		<td width="100" align="center" id="addr2"><%=bean.getArea2()%></td>
		<td width="200" align="center" id="addr3"><%=bean.getArea3()%></td>
		<td width="100" align="center"><input type="button" value="선택" onclick="textapply()"></td>
	
		<script>
		function textapply() {
			const addr1 = document.getElementById("addr1").innetText
			const addr2 = document.getElementById("addr2").innetText
			const addr3 = document.getElementById("addr3").innetText
			opener.document.getElementById("zipcode").value = document.getElementById("zipcode").innetText;
			opener.document.getElementById("address").value = addr1 + " " + addr2 + " " + addr3;
			window.close();
		}
		</script>
	</tr>
	<%
	}
	%>
	</table>
</body>
</html>