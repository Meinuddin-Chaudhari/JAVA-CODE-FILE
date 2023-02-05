package in.ineuron.util;          
import java.sql.*;
import java.io.*;
import java.util.Properties;
public class JdbcUtil {
		private JdbcUtil() {
	}	
    static {
			try {
	             Class.forName("com.mysql.cj.jdbc.Driver");
			    } catch (ClassNotFoundException ce) {
				ce.printStackTrace(); 
				}
		   }         
		public static Connection getJdbcConnection() throws SQLException, IOException 
		{		
		FileInputStream fis = new FileInputStream("E:\\Advance-java-Eclipse-File\\JDBC\\TransactionManagement\\Application.properties");	
		Properties properties = new Properties();		
		properties.load(fis);		
		Connection connection = DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("username"), properties.getProperty("password"));
		return  connection;
	}
	public static void cleanUp(Connection con, Statement statement, ResultSet resultSet) throws SQLException {
		if (con != null) {
			con.close();
		}
		if (statement != null) {
			statement.close();
		}
		if (resultSet != null) {
			resultSet.close();
		}
	}
}