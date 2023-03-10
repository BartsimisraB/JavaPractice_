package Unit01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JoinServlet
 */
@WebServlet("/JoinServlet")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public JoinServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
	    request.setCharacterEncoding("utf-8");
	    
		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		String pernum1 = request.getParameter("pernum1");
		String pernum2 = request.getParameter("pernum2");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String email1 = request.getParameter("email1");
		String email2 = request.getParameter("email2");
		String addrnum = request.getParameter("addrnum");
		String addr1 = request.getParameter("addr1");
		String addr2 = request.getParameter("addr2");
		String phone = request.getParameter("phone");
		String job = request.getParameter("job");
		String info = request.getParameter("info");
		
		out.print("회원 이름 : " + name);
		out.print("<br>");
		out.print("주민등록 번호 : " + pernum1 + " - " + pernum2);
		out.print("<br>");
		out.print("아이디 : " + id);
		out.print("<br>");
		out.print("비밀번호 : " + pw);
		out.print("<br>");
		out.print("이메일 : " + email1 + "@" + email2);
		out.print("<br>");
		out.print("우편번호" + addrnum);
		out.print("<br>");
		out.print("주소 : " + addr1 + " " + addr2);
		out.print("<br>");
		out.print("전화번호 : " + phone);
		out.print("<br>");
		out.print("직업 : " + job);
		out.print("<br>");
		out.print("메일/SMS 수신 여부 : " + info);

		out.close();
	}

}
