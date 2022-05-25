package Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestInsert {
	public void testInsert(String name) {
		Scanner in = new Scanner(System.in);
		JdbcTemplate jt =  new JdbcTemplate();
		
		String sql = "insert into \"FOODTYPE\" (\"NUM\",\"TYPENAME\",\"VOTE\") values (\"FOODTYPE_SEQ\".nextval,?,1)";
		Connection conn = jt.getConnection();
		PreparedStatement pstmt = null;
		
		int result = 0;
		try {
			 pstmt = conn.prepareStatement(sql);
			 pstmt.setString(1, name);		 	 
			 result = pstmt.executeUpdate();
			 System.out.println("결과: "+result);
			 
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try{
					conn.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
			
			if(pstmt != null) {
				try{
					pstmt.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
	
	public void testUpdate(int num) {
		JdbcTemplate jt =  new JdbcTemplate();
		String sql = "update \"FOODTYPE\" set \"VOTE\" = \"VOTE\"+1 where \"NUM\"=?";
		Connection conn = jt.getConnection();
		PreparedStatement pstmt = null;
		
		int result = 0;
		try {
			 pstmt = conn.prepareStatement(sql);
			 pstmt.setInt(1, num);		 	 
			 result = pstmt.executeUpdate();		 
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try{
					conn.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
			
			if(pstmt != null) {
				try{
					pstmt.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	}
}
