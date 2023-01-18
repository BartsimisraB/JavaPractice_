<%@page import="oracle.net.aso.j"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
	request.setCharacterEncoding("utf-8");
	String []hobby=request.getParameterValues("hobby");

	//배열에 있는 내용을 하나의 문자열로 저장
	String str = "";
	for(String s : hobby) {
		str+=s;
	}

%>
	<!-- useBean이용 -->
<jsp:useBean id="member" class="co.sjw.movie.MemberBean">
	<jsp:setProperty property="*" name = "member"/>
</jsp:useBean>

<%
	member.setHobby(str);
	//db 연결
	String id="system";
	String pw="qkrdlstj369!";
	String url="jdbc:oracle:thin:@localhost:1521/xe";
	
	try{
		//1. 해당 데이터베이스 사용한다고 선언
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2. 데이터베이스에 접속
		Connection con = DriverManager.getConnection(url,id,pw);
		String sql="insert into Member values(?,?,?,?,?,?,?,?)";
	
		//3. 접속 후 쿼리를 준비
		PreparedStatement pstmt = con.prepareStatement(sql);
	
		//?에 맞게 데이터 맵핑
		pstmt.setString(1,member.getId());
		pstmt.setString(2,member.getPass1());
		pstmt.setString(3,member.getEmail());
		pstmt.setString(4,member.getTel());
		pstmt.setString(5,member.getHobby());
		pstmt.setString(6,member.getJob());
		pstmt.setString(7,member.getAge());
		pstmt.setString(8,member.getInfo());
	
		pstmt.executeQuery();
		//insert , update , delete 시 사용하는 메서드
		
		con.close();
		
	}catch(Exception e){
		e.printStackTrace();
	}
	
%>
오라클에 완료됨


</body>
</html>