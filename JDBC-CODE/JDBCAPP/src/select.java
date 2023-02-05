import java.sql.*;
class select {
	public static void main(String[] args) throws SQLException{

			//Step2. Establish the Connection with database
			String url = "jdbc:mysql:///wipro";
			String userName = "root";
			String passWord = "admin";
			Connection    connection = DriverManager.getConnection(url,userName,passWord);
	
			//Step3. Create statement Object and send the query
			//String sqlSelectQuery = "select firstname,lastname,age,city,salary from employee";
			Statement 	statement = connection.createStatement();
			
			ResultSet	resultSet =statement.executeQuery("select firstname,lastname,age,city,salary from employee");
			
			System.out.println("firstname\tlastname\tage\tcity\t\tsalary");

			//Step4. Process the resultSet
			while (resultSet.next())
			{
				String firstname  = resultSet.getString(1);
				String lastname = resultSet.getString(2);
				Integer age = resultSet.getInt(3);
				String city = resultSet.getString(4);
				Integer salary=resultSet.getInt(5);

				System.out.println(firstname+"\t\t"+lastname+"\t"+age+"\t"+city+"\t"+salary);
		}
			resultSet.close();
			statement.close();
			connection.close();
	}
}