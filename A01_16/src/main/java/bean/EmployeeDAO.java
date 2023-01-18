package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EmployeeDAO {
	String id = "system";
	String pass = "qkrdlstj369!";
	String url = "jdbc:oracle:thin:@localhost:1521/xe";
	
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public void getCon() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공!");
		}catch (Exception e) {}
		try {
			System.out.println("데이터베이스 연결 준비...");
			con = DriverManager.getConnection(url, id, pass);
			System.out.println("데이터베이스 연결 성공!");
		} catch (Exception e) {
		}
		try {
			System.out.println();
		} catch (Exception e) {
		}
	}
	
	public ArrayList<EmployeeBean> allSelect() {
		
		ArrayList<EmployeeBean> list = new ArrayList<>();
	
		try {
			getCon();
			
			String sql = "select * from employee";
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String name = rs.getString(1);
				String address = rs.getString(2);
				String ssn = rs.getString(3);
				
				EmployeeBean ebeans = new EmployeeBean();
				
				ebeans.setName(name);
				ebeans.setAddress(address);
				ebeans.setSsn(ssn);
				
				list.add(ebeans);
			}
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}