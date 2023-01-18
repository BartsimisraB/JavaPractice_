<%@page import="bean.BoardBean"%>
<%@page import="bean.BoardDAO"%>
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
        //패스워드, 넘버 두가지만 받으므로 참조변수에 이 두가지만 담는다
        String pass = request.getParameter("password");
        int num = Integer.parseInt(request.getParameter("num"));
 
        //데이터베이스 연결
        BoardDAO bdao = new BoardDAO();
 
        String password = bdao.getPass(num);
 
        //기존 패스워드값과 delete form에서 작성한 패스워드 비교
 
        if (pass.equals(password)) {
            //입력한 패스워드가 맞다면
            bdao.deleteBoard(num);
            response.sendRedirect("BoardList.jsp");
 
        } else {
    %>
    <script>
        alert("패스워드가 틀렸습니다.");
        history.go(-1);
    </script>
    <%
        }
    %>
</body>
</html>