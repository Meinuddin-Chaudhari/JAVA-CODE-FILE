package ineuron.in.main;

import java.sql.*;
import java.util.Scanner;
public class insertDynamic {
	public static void main(String[] args) throws SQLException {

		String url = "jdbc:mysql:///wipro";
		String user = "root";
		String password = "admin";
		Connection connection = DriverManager.getConnection(url, user, password);

		Statement statement = connection.createStatement();
		
		Scanner scanner = new Scanner(System.in);
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
			
		String sqlInsertQuery = String.format("insert into employee(firstname,lastname,age,city,salary) values ('%s','%s','%d','%s','%d')",fname,lname,age,city,salary);
	
		int rowAffected = statement.executeUpdate(sqlInsertQuery);
		System.out.println("No of rows affected is :: " + rowAffected);

		statement.close();
		connection.close();
		scanner.close();
	}
}