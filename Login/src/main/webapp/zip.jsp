<%@page import="mgr.ZipBean"%>
<%@page import="mgr.MemberBean"%>
<%@page import="java.util.Vector"%>
<%@page import="mgr.MemberMgr"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<form action="resultZip.jsp" name="frm">
   <table>
      <tr>
         <td>우편번호</td>
         <td><input type="text" name="zipcode"></td>
         <td><input type="submit" value="검 색" onclick="return research()"></td>
         <td><input type="button" value="닫 기" onclick="javascript:window.close()"></td>
      </tr>
   </table>
</form>
</center>
</body>
</html>