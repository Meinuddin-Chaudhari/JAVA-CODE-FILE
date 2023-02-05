package in.ineuron.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class JdbcUtil {

	private JdbcUtil() {
	}

	static {
		// Step1: loading and register the Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		}
	}

	public static Connection getJdbcConnection() throws SQLException, IOException {
		HikariConfig config = new HikariConfig("E:\\Advance-java-Eclipse-File\\JDBC\\JDBC-CRUDAPP-CONSOLE\\src\\in\\ineuron\\properties\\application.properties");
		HikariDataSource dataSource = new HikariDataSource(config);
		return dataSource.getConnection();
	}

}
