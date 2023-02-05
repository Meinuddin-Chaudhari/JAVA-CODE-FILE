package in.ineuron.main;
import java.sql.*;
import java.util.Scanner;
import in.ineuron.util.*;

public class select {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet resultSet=null;
		Scanner scanner = null;
  try {                                                                                         
    		connection = JdbcUtil.getJdbcConnection();

    		String sqlSelectQuery = "select firstname,lastname,age,city,salary from employee where id=?";
			if (connection != null) {
			pstmt = connection.prepareStatement(sqlSelectQuery);
			}
	     	scanner = new Scanner(System.in);
	     	System.out.print("Enter the id of the student :: ");
			int sid = scanner.nextInt();

			pstmt.setInt(1, sid);

			resultSet = pstmt.executeQuery();
			if (resultSet != null) 
			 {
				if (resultSet.next()) {
					System.out.println("firstname\tlastname\tage\tcity\tsalary");
					System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getInt(3)
							+ "\t" + resultSet.getString(4) + "\t" + resultSet.getInt(5));
				} else {
					System.out.println("Record not available for the give id :: " + sid);
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
				JdbcUtil.cleanUp(connection, pstmt, null);
				scanner.close();
			    } 
			    catch (SQLException e) {
				e.printStackTrace();
			    }
		 }
	}
}