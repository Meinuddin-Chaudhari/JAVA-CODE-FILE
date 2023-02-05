package in.ineuron.main;
import java.io.IOException;
import java.sql.*;
import in.ineuron.util.JdbcUtil;

public class TransactionSavePoint {
	public static void main(String[] args) {

		Connection connection = null;
		Statement stmt = null;
		try {
			connection = JdbcUtil.getJdbcConnection();

			if (connection != null)
				stmt = connection.createStatement();

			System.out.println("Transaction begins.....");                   
			connection.setAutoCommit(false);
			
			stmt.executeUpdate("insert into politicians(`name`,`party`) values('MODI','BJP')");
			stmt.executeUpdate("insert into politicians(`name`,`party`) values('KCR','TRS')");
			Savepoint sp = connection.setSavepoint();
			stmt.executeUpdate("insert into politicians(`name`,`party`) values('siddu','BJP')");
			System.out.println("oop's something went wrong during insertion....");
			connection.rollback(sp);
			System.out.println("Operations are rolled back to savepoint....");
			connection.commit();
					
			System.out.println("Transaction done....");

		} catch (SQLException | IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				JdbcUtil.cleanUp(connection, stmt, null);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}