


import java.sql.*;
class delete {
	public static void main(String[] args) throws SQLException{
	
			String url = "jdbc:mysql://localhost:3306/wipro";
			String userName = "root";
			String passWord = "admin";
			Connection  connection = DriverManager.getConnection(url,userName,passWord);
			
          String sqlInsertQuery = "delete from employee where id=6";
			Statement	statement = connection.createStatement();
			
			int	resultSet =statement.executeUpdate(sqlInsertQuery);
			System.out.println(resultSet);
		         				
			statement.close();                                                                              
			connection.close();
	}
}