package Project;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class JdbcTemplate {
	public JdbcTemplate() {
		try {
		Class.forName("oracle.jdbc.OracleDriver");
		
		
		
			
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	}
	
	public Connection getConnection() {
		String user ="c##tester";
		String password = "1234";
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(jdbcUrl,user,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	

			
		
	
}
}

	

	
