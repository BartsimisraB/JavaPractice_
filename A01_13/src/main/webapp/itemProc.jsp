<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
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
	%>
	<jsp:useBean id="item" class="Bean.ItemBean">
		<jsp:setProperty property="*" name="item" />
	</jsp:useBean>

	<%
	String id = "system";
	String pw = "qkrdlstj369!";
	String url = "jdbc:oracle:thin:@localhost:1521/xe";

	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection con = DriverManager.getConnection(url, id, pw);
		String sql = "insert into item(name, price, desc1) values(?,?,?)";

		PreparedStatement pstmt = con.prepareStatement(sql);

		pstmt.setString(1, item.getName());
		pstmt.setInt(2, Integer.parseInt(item.getPrice()));
		pstmt.setString(3, item.getDesc1());

		pstmt.executeQuery();

		con.close();

	} catch (Exception e) {
		e.printStackTrace();
	}
	%>
	오라클에 완료됨
</body>
</html>