import java.sql.*;
class insert {
	public static void main(String[] args) throws SQLException{
	
			String url = "jdbc:mysql://localhost:3306/wipro";
			String userName = "root";
			String passWord = "admin";
			Connection  connection = DriverManager.getConnection(url,userName,passWord);
			
          String sqlInsertQuery = "insert into employee(firstname,lastname,age,city,salary) values ('ashish','satish',44,'nallasopara',20000)";
			Statement	statement = connection.createStatement();
			
			int	resultSet =statement.executeUpdate(sqlInsertQuery);
		         				
			statement.close();                                                                              
			connection.close();
	}
}