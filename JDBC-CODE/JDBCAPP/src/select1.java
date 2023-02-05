
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class select1   {
	public static void main(String[] args) {

		Connection connection= null;
		Statement  statement   = null;
		ResultSet  resultSet   = null;

		try{

			//Step1. Load and register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step2. Establish the Connection with database
			String url = "jdbc:mysql://localhost:3306/wipro";
			String userName = "root";
			String passWord = "admin";
            connection = DriverManager.getConnection(url,userName,passWord);
	

			//Step3. Create statement Object and send the query
			String sqlSelectQuery = "select firstname,lastname,age,city,salary from employee";
			statement = connection.createStatement();
			
			resultSet =statement.executeQuery(sqlSelectQuery);
			
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
		}catch (ClassNotFoundException ce){
			ce.printStackTrace();
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			//closing the resources
			        if (connection!=null)
			        {
			         	try
				        {
					      connection.close();
					      System.out.println("Connection closed...");
				        }
				       catch (SQLException se)
			         	{
					    se.printStackTrace();
				        }
			       }
		      }		
	}
}