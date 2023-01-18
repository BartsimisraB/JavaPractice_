import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test2 {

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		String que = "insert into emp(empno, ename, job)"
				+ "values(?, ?, ?)";
		//바인드 변수 '?' : 주기적으로 변경해서 입력할 값
		
		Connection con = null;
		PreparedStatement pstm = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con = DriverManager.getConnection(url,"sys as sysdba","qkrdlstj369!");
			pstm = con.prepareStatement(que);
			
			pstm.setInt(1,1234);
			pstm.setString(2, "Bob");
			pstm.setString(3, "ANALYST");
			
			pstm.executeUpdate();
		
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}