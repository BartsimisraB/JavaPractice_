import java.sql.Connection;
import java.sql.DriverManager;

public class Test {

	public static Connection get() {
		
		Connection conn = null;
		
		try {
			String id = "sys as sysdba";
			String pw = "qkrdlstj369!";
			String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
						//jdbc:oracle:thin:@ȣ��Ʈ�̸�:��Ʈ��ȣ/�����̸�
							
			//1) JDBC ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//ClassŬ������ JDBC ����̹��� �ε��ϴ� �ڵ� => DriverManager�� ��ϵ�
			
			conn = DriverManager.getConnection(url,id,pw);
			//Connection ��ü�� ����
			//conn => ������ �����ͺ��̽��� �����Ͽ� �۾��� ������ �� �ִ� ��η� �ۿ��ϴ� 
			//		  �߿��� ��ü ������ ���
			
			System.out.println("�����ͺ��̽��� ����ƴ�.");
			
		}catch(Exception e) {
			System.out.println("�ε� ����!");
		}
		
		return conn;
		
	}
}