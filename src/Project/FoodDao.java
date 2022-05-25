package Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodDao {
	String user ="c##tester";
	String password = "1234";
	String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
	
	public FoodDao() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			
			
				
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	public List<FoodVo> testSelect() {
		JdbcTemplate jt =  new JdbcTemplate();
		
		
		Connection conn = jt.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<FoodVo> result = new ArrayList<>();
		try {
			String sql = "select \"NUM\",\"NAME\",\"VOTE\" from \"FOOD\""; 
			pstmt = conn.prepareStatement(sql);
			 rs = pstmt.executeQuery();
			 while(rs.next()) {
				 FoodVo vo = new FoodVo(
						 rs.getInt("NUM"),
						 rs.getString("NAME"),
						 rs.getInt("VOTE"));
				 result.add(vo);
				 
			 
		}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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
		return result;
	}
	
	public void testInsert(FoodVo fv) {
		Scanner in = new Scanner(System.in);
		JdbcTemplate jt =  new JdbcTemplate();
		
		String sql = "insert into \"FOOD\" (\"NUM\",\"NAME\") values (\"FOOD_SEQ\".nextval,?)";
		Connection conn = jt.getConnection();
		PreparedStatement pstmt = null;
		
		int result = 0;
		try {
			 pstmt = conn.prepareStatement(sql);
			 pstmt.setString(1, fv.getName());		 	 
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
		String sql = "update \"FOOD\" set \"VOTE\" = \"VOTE\"+1 where \"NUM\"=?";
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
	
	public void testUpdate(FoodVo fv) {
		JdbcTemplate jt =  new JdbcTemplate();
		String sql = "update \"FOOD\" set \"VOTE\" = \"VOTE\"+1 where \"NAME\"=?";
		Connection conn = jt.getConnection();
		PreparedStatement pstmt = null;
		
		int result = 0;
		try {
			 pstmt = conn.prepareStatement(sql);
			 pstmt.setString(1, fv.getName());		 	 
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


