package in.ineuron.main;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

import in.ineuron.util.JdbcUtil;
/**
DELIMITER $$
CREATE
    PROCEDURE wipro.P_GET_PRODUCT_DETAILS_BY_ID(IN id INT,OUT NAME VARCHAR(20),OUT rate INT, OUT qnt INT)
    
	BEGIN
		SELECT pname,price,qty INTO NAME,rate,qnt FROM products WHERE pid = id;
	END$$

DELIMITER ;
 */
public class CallableStatementStoredProcedure1  {
	private static final String storedProcedureCall = "{CALL P_GET_PRODUCT_DETAILS_BY_ID(?,?,?,?)}";

	public static void main(String[] args) {
		Connection connection = null;
		CallableStatement cstmt = null;
		Scanner scanner = null;
		Integer id = null;
		try {
			connection = JdbcUtil.getJdbcConnection();
			if (connection != null)
				cstmt = connection.prepareCall(storedProcedureCall);

			scanner = new Scanner(System.in);
			if (scanner != null) {
				System.out.print("Enter the product id :: ");
				id = scanner.nextInt();
			}
			if (cstmt != null) {
				cstmt.setInt(1, id);
			}
			if (cstmt != null) {
				cstmt.registerOutParameter(2, Types.VARCHAR);
				cstmt.registerOutParameter(3, Types.INTEGER);
				cstmt.registerOutParameter(4, Types.INTEGER);
			}

			if (cstmt != null) {
				cstmt.execute();
			}
			if (cstmt != null) {
				System.out.println("Product Name is :: " + cstmt.getString(2));
				System.out.println("Product Cost is :: " + cstmt.getInt(3));
				System.out.println("Product QTY  is :: " + cstmt.getInt(4));
			}
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				JdbcUtil.cleanUp(connection, cstmt, null);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			scanner.close();
		}
	}
}