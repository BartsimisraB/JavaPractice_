package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class MemberDAO {
	
	String id="system";
	String pass="Pink5072";
	String url="jdbc:oracle:thin:@localhost:1521/xe";
	
	Connection con; //데이터베이스에 접근할 수 있도록
	PreparedStatement pstmt; //쿼리를 실행시켜주는 객체
	ResultSet rs;          //데이터베이스 테이블 결과를 리턴받아 자바에 저장해주는 객체 
	
	
	public void getCon() {
		try {
			//1. 해당 데이터 베이스 사용한다고 선언(로딩)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2. 해당 데이터 베이스에 접속
			con=DriverManager.getConnection(url,id,pass);
		}catch(Exception e) {}
	}
	
	public void insertMember(MemberBean mbean) {
		
		try {
			getCon();
			
			String sql="insert into member values(?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(sql);
			
			//?에 맞게 데이터를 맵핑
			pstmt.setString(1, mbean.getId());
			pstmt.setString(2, mbean.getPass1());
			pstmt.setString(3, mbean.getEmail());
			pstmt.setString(4, mbean.getTel());
			pstmt.setString(5, mbean.getHobby());
			pstmt.setString(6, mbean.getJob());
			pstmt.setString(7, mbean.getAge());
			pstmt.setString(8, mbean.getInfo());
			
			pstmt.executeUpdate();
			
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	public Vector<MemberBean> allSelectMember(){
		
		Vector<MemberBean> v =new Vector<>();
		
		try {
			getCon();
			
			String sql="select * from member";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			//쿼리 실행 시킨 결과를 리턴해서 저장
			
			while(rs.next()) {  //저장된 데이터만큼까지 반복문을 돌리겠다.
				MemberBean bean=new MemberBean();
		       //테이블에 저장되어 있는 데이터들을 (MemberBean )에 저장
				bean.setId(rs.getString(1));
				bean.setPass1(rs.getString(2));
				bean.setEmail(rs.getString(3));
				bean.setTel(rs.getString(4));
				bean.setHobby(rs.getString(5));
				bean.setJob(rs.getString(6));
				bean.setAge(rs.getString(7));
				bean.setInfo(rs.getString(8));
				
				v.add(bean); //bean에 세팅한 값들을 싹 다 벡터에 넣어버린다.		
			}
			con.close();
			
		}catch(Exception e) {}
		
		return v;
	}
	
	public MemberBean oneMember(String id) {
		
		MemberBean bean=new MemberBean();
		
		try {
			getCon();
			String sql="select *from member where id=?";
			
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				bean.setId(rs.getString(1));
				bean.setPass1(rs.getString(2));
				bean.setEmail(rs.getString(3));
				bean.setTel(rs.getString(4));
				bean.setHobby(rs.getString(5));
				bean.setJob(rs.getString(6));
				bean.setAge(rs.getString(7));
				bean.setInfo(rs.getString(8));
				
			}
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return bean;

	}
	
	public String getPass(String id) {
		String pass="";
		
		try {
			getCon();
			
			String sql="select pass1 from member where id=?";
			
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				pass=rs.getString(1);
			}
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return pass;
	}	
	
	public void updateMember(MemberBean mbean) {
		
		getCon();
		
		try {
			String sql="update member set email=?, tel=? where id=?";
			
			pstmt=con.prepareStatement(sql);
			
			pstmt.setString(1, mbean.getEmail());
			pstmt.setString(2, mbean.getTel());
			pstmt.setString(3, mbean.getId());
			
			pstmt.executeUpdate();
			con.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteMember(String id) {
		getCon();
		
		try {
			String sql="delete from member where id=?";
			
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id);
			
			pstmt.executeUpdate();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
}