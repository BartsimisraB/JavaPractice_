package Unit01;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class param
 */
@WebServlet("/param")
public class param extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public param() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");

		PrintWriter out = response.getWriter();

		String id = request.getParameter("id");
		int age = Integer.parseInt(request.getParameter("age"));

		out.print(id + "<br>");
		out.print(age + "<br>");

		String user = "system";
		String pw = "qkrdlstj369!";
		String path = "jdbc:oracle:thin:@localhost:1521/xe";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection(path, user, pw);
			String sql = "create table param(id varchar2(20),age number(10))";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.executeQuery();

			String sql2 = "insert into param values(?,?)";
			PreparedStatement pstmt2 = con.prepareStatement(sql2);
			pstmt2.setString(1, id);
			pstmt2.setInt(2, age);

			pstmt2.executeUpdate();

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		out.print("오라클 접속 완료!");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
