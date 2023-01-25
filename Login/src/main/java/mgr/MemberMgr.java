package mgr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberMgr {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;

	public void getCon() {
		try {
			Context ctx = new InitialContext();
			Context env = (Context) ctx.lookup("java:comp/env");
			DataSource ds = (DataSource) env.lookup("jdbc/pool");

			con = ds.getConnection();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insertMember(MemberBean bean) {
		getCon();

		try {
			String sql = "insert into custom values(?,?,?,?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, bean.getId());
			pstmt.setString(2, bean.getPwd());
			pstmt.setString(3, bean.getName());
			pstmt.setString(4, bean.getGender());
			pstmt.setString(5, bean.getEmail());
			pstmt.setString(6, bean.getBirth());
			pstmt.setString(7, bean.getZipcode());
			pstmt.setString(8, bean.getAddress());
			pstmt.setString(9, bean.getHobby());
			pstmt.setString(10, bean.getJob());

			pstmt.executeUpdate();

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<MemberBean> allMember() {
		List<MemberBean> list = new ArrayList<MemberBean>();
		getCon();

		try {
			String sql = "select * from custom";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				MemberBean bean = new MemberBean();

				bean.setId(rs.getString(1));
				bean.setPwd(rs.getString(2));
				bean.setName(rs.getString(3));
				bean.setGender(rs.getString(4));
				bean.setEmail(rs.getString(5));
				bean.setBirth(rs.getString(6));
				bean.setZipcode(rs.getString(7));
				bean.setAddress(rs.getString(8));
				bean.setHobby(rs.getString(9));
				bean.setJob(rs.getString(10));

				list.add(bean);
			}
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public String getId(String id) {
		String checkid = "";
		getCon();

		try {
			String sql = "select id from custom where id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				checkid = rs.getString(1);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return checkid;
	}

	public String getPw(String pw) {
		String checkpw = "";
		getCon();

		try {
			String sql = "select pwd from custom where pwd = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, pw);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				checkpw = rs.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return checkpw;
	}

	public int duplecateID(String id) {
		int cnt = 0;
		getCon();
		try {
			StringBuilder sql = new StringBuilder();

			// 아이디 중복 확인
			sql.append(" SELECT count(id) as cnt ");
			sql.append(" FROM custom ");
			sql.append(" WHERE id = ? ");

			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, id);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				cnt = rs.getInt("cnt");
			}
		} catch (Exception e) {
			System.out.println("아이디 중복 확인 실패 : " + e);
		}
		return cnt;
	}

	public int login(String userID, String userPassword) {
		String SQL = "SELECT pwd FROM custom WHERE id = ?";
		getCon();
		try {
			pstmt = con.prepareStatement(SQL);
			pstmt.setString(1, userID);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				if (rs.getString(1).equals(userPassword))
					return 1; // 로그인 성공
				else
					return 0; // 비밀번호 틀림
			}
			return -1; // 아이디 없음
		} catch (Exception e) {
			e.printStackTrace();

		}
		return -2; // DB 오류
	}

	public int loginCheck(String id, String pw) {
		String dbPW = "";
		int x = -1;
		getCon();
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT pwd FROM custom WHERE ID=?");

			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				dbPW = rs.getString("pwd");

				if (dbPW.equals(pw))
					x = 1;
				else
					x = 0;

			} else {
				x = -1;
			}

			return x;

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
					pstmt = null;
				}
				if (con != null) {
					con.close();
					con = null;
				}
			} catch (Exception e) {
				throw new RuntimeException(e.getMessage());
			}
		}
	}
	
	 public ArrayList<ZipBean> allZip(String zipcode){
         ArrayList<ZipBean> list =new ArrayList<>();
         
         try {
            
            getCon();
            String sql="select * from tblzipcode where zipcode=?";
            
            pstmt=con.prepareStatement(sql);
           
            pstmt.setString(1, zipcode);
           
            rs=pstmt.executeQuery();
            
            if(rs.next()) {
               ZipBean zbean=new ZipBean();
               zbean.setZipcode(rs.getString(1));
               zbean.setArea1(rs.getString(2));
               zbean.setArea2(rs.getString(3));
               zbean.setArea3(rs.getString(4));
               
               list.add(zbean);
            }
            con.close();
         }
         catch(Exception e) {
            e.printStackTrace();
         }
         return list;
      }
      
}
