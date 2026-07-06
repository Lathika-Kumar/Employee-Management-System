package in.kce.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getConnection() {
		//1. Load JDBC Driver
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		        String username = "system";
		        String password = "oracle123";
			Connection connection=DriverManager.getConnection(url,username,password);
			return connection; 
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
