package in.ineuron.util;
import java.sql.*;

public class JdbcUtil {
//      private JdbcUtil(){
//       }
      static{                  
               try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                  } 
               catch (ClassNotFoundException ce) {
                  ce.printStackTrace();
                  }
            }
      public static Connection getJdbcConnection() throws SQLException 
      {
             String url = "jdbc:mysql:///wipro";
             String username = "root";
             String password = "admin";
             Connection connection = DriverManager.getConnection(url, username,password);
             return connection;
      }
      public static void cleanUp(Connection con, Statement statement, ResultSet resultSet) throws SQLException 
      {
        if (con != null) {
             con.close();
             }
        if (statement != null) {
             statement.close();
             }
        if (resultSet != null) {
             resultSet.close();
             }
      }
}