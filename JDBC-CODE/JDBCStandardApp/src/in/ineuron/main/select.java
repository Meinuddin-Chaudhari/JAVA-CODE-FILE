package in.ineuron.main;
import java.sql.*;
import in.ineuron.util.*;

public class select {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
	try {                                                                                         
    			connection = JdbcUtil.getJdbcConnection();

			if (connection != null)
				statement = connection.createStatement();

			if (statement != null)
				resultSet = statement.executeQuery("select firstname,lastname,age,city,salary from employee");

			if (resultSet != null) {
				System.out.printf("%-2s%14s%12s%15s%15s","firstname","lastname","age","city","salary");
				System.out.println();
				
				while (resultSet.next()) {
					System.out.printf("%-2s%14s%12d%15s%15d", resultSet.getString(1), resultSet.getString(2),
							resultSet.getInt(3), resultSet.getString(4), resultSet.getInt(5));
					System.out.println();
				 }
			 }
	    }  	
	  	   catch (SQLException se) {
			se.printStackTrace();
		    }
		   catch (Exception e) {
			e.printStackTrace();
	       }		
          finally  {
			try {
				JdbcUtil.cleanUp(connection, statement, resultSet);
				System.out.println("closing the resources...");
			    } 
			    catch (SQLException e) {
				e.printStackTrace();
			    }
		 }
	}
}