package in.ineuron.main;
import java.sql.*;
import java.util.Scanner;
import in.ineuron.util.*;

public class update {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement pstmt = null;
		Scanner scanner = null;
	try {                                                                                         
    	    connection = JdbcUtil.getJdbcConnection();

    		String sqlUpdateQuery = "update employee set firstname=? where id=?";
			if (connection != null) {
			pstmt = connection.prepareStatement(sqlUpdateQuery);
			}

	     	scanner = new Scanner(System.in);
	     	System.out.print("Enter the firstname of employee :: ");
			String firstname = scanner.next();
			
	     	System.out.print("Enter the id of the employee :: ");
			int id = scanner.nextInt();

			pstmt.setString(1, firstname);
			pstmt.setInt(2, id);

			int rowCount = pstmt.executeUpdate();
			System.out.println("No of rows updated is :: " + rowCount);
		 }	  	
	  	   catch (SQLException se) {
			se.printStackTrace();
		    }
		   catch (Exception e) {
			e.printStackTrace();
	       }		
          finally  {
			try {
				JdbcUtil.cleanUp(connection, pstmt, null);
				scanner.close();
			    } 
			    catch (SQLException e) {
				e.printStackTrace();
			    }
		 }
	}
}