package in.ineuron.main;
import java.sql.*;
import java.util.Scanner;
import in.ineuron.util.*;

public class delete {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement pstmt = null;
		Scanner scanner = null;
	try {                                                                                         
    		connection = JdbcUtil.getJdbcConnection();

    		String sqlDeleteQuery = "delete from employee where id=?";
			if (connection != null) {
			pstmt = connection.prepareStatement(sqlDeleteQuery);
			}

	     	scanner = new Scanner(System.in);
	     	System.out.print("Enter the id of the employee :: ");
			int id = scanner.nextInt();

			pstmt.setInt(1, id);

			int rowCount = pstmt.executeUpdate();
			System.out.println("No of rows deleted is :: " + rowCount);
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