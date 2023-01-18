import java.sql.Connection;
import java.sql.DriverManager;

public class Test {

	public static Connection get() {
		
		Connection conn = null;
		
		try {
			String id = "sys as sysdba";
			String pw = "qkrdlstj369!";
			String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
						//jdbc:oracle:thin:@호스트이름:포트번호/서비스이름
							
			//1) JDBC 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Class클래스로 JDBC 드라이버를 로딩하는 코드 => DriverManager에 등록됨
			
			conn = DriverManager.getConnection(url,id,pw);
			//Connection 객체를 얻음
			//conn => 실제로 데이터베이스와 연결하여 작업을 수행할 수 있는 통로로 작용하는 
			//		  중요한 객체 변수로 사용
			
			System.out.println("데이터베이스에 연결됐다.");
			
		}catch(Exception e) {
			System.out.println("로딩 실패!");
		}
		
		return conn;
		
	}
}