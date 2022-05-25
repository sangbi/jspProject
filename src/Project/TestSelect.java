package Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestSelect {

	
	public List<FoodVo> testSelect() {
		JdbcTemplate jt =  new JdbcTemplate();
		
		String sql = "select \"NUM\",\"NAME\",\"VOTE\" from \"FOOD\"";
		Connection conn = jt.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<FoodVo> result = new ArrayList<>();
		try {
			 pstmt = conn.prepareStatement(sql);
			 rs = pstmt.executeQuery();
			 while(rs.next()) {
				 FoodVo vo = new FoodVo(
						 rs.getInt("NUM"),
						 rs.getString("TYPENAME"),
						 rs.getInt("VOTE"));
				 result.add(vo);
				 
			 }	 
		} catch (SQLException e) {
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
}

