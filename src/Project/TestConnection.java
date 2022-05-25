package Project;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class TestConnection {
	public static void main(String[] args) {
		String user ="c##tester";
		String password = "1234";
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection conn = null;
		
		
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				
				
				
					conn = DriverManager.getConnection(jdbcUrl, user, password);
					
					
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if(conn != null) {
					try {
						conn.close();
					}catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
			
		
	
}
}

	

	
