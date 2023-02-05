package in.ineuron.main;
import java.sql.*; 
import java.util.Scanner;
import in.ineuron.util.*;

public class insert {
	public static void main(String[] args) {
		Connection  connection = null;
		PreparedStatement pstmt = null;
		Scanner scanner=null;
	try {                                                                                         
		 connection = JdbcUtil.getJdbcConnection();
             
    		String sqlInsertQuery = "insert into employee(firstname,lastname,age,city,salary)values(?,?,?,?,?)";
			if (connection != null) {
			pstmt = connection.prepareStatement(sqlInsertQuery);
			}
	     	scanner = new Scanner(System.in);

		System.out.print("Enter the firstname :: ");
		String fname = scanner.next();

		System.out.print("Enter the lastname :: ");
		String lname = scanner.next();

		System.out.print("Enter the age :: ");
		Integer age = scanner.nextInt();
		
		System.out.print("Enter the city:: ");
		String city = scanner.next();
		
		System.out.println("enter salary");
		Integer salary=scanner.nextInt();

			pstmt.setString(1, fname);
			pstmt.setString(2, lname);
			pstmt.setInt(3, age);
			pstmt.setString(4, city);
			pstmt.setInt(5,salary);
			
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
				JdbcUtil.cleanUp(connection, pstmt,null);
				scanner.close();
			    } 
			    catch (SQLException e) {
				e.printStackTrace();
			    }
		 }
	}
}