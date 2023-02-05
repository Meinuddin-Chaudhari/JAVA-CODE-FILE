package UpdatabeResultSet;
import java.io.IOException;
import java.sql.*;
import in.ineuron.util.JdbcUtil;

public class deleteResultSet{
	public static void main(String[] args) {
	// Resources used
		Connection connection = null;
		Statement stmt = null;
		ResultSet resultSet = null;

		try {
			connection = JdbcUtil.getJdbcConnection();

			if (connection != null)
				// Expecting ResultSet to be SCROLLABLE AND UPDATABLE
				stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

			String sqlQuery = "select id,name,age,address from employees";

			if (stmt != null)
				resultSet = stmt.executeQuery(sqlQuery);

			if (resultSet != null) {
				System.out.println("Records before deletion....");
				System.out.println("ID\tNAME\tAGE\tADDRESS");
				while (resultSet.next()) {
					System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getInt(3)
							+ "\t" + resultSet.getString(4));
				}
				System.out.println();

				// performing delete operation using reusltSet
				resultSet.last();// cursor in last row

				resultSet.deleteRow();//peforming deletion operation
				
				resultSet.beforeFirst();//taking the cursor to BFR
				System.out.println("Records after deletion....");
				System.out.println("ID\tNAME\tAGE\tADDRESS");
				while (resultSet.next()) {
					System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getInt(3)
							+ "\t" + resultSet.getString(4));
				}
			}

		} catch (SQLException | IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				JdbcUtil.cleanUp(connection, stmt, resultSet);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
