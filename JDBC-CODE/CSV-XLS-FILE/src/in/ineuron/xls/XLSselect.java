package in.ineuron.xls;
import java.sql.*;

public class XLSselect {
	// filename.<sheetname> represents the table name
	private static final String EXCEL_FILE = "select * from hello.Studentform";

	public static void main(String[] args) {		
		//jdbc:Excel:///location where the file is present
		String url = "jdbc:Excel:///E:\\Advance-java-Eclipse-File\\JDBC\\CSV-XLS-FILE";
		
		try (Connection connection = DriverManager.getConnection(url)) {
			try (PreparedStatement pstmt = connection.prepareStatement(EXCEL_FILE)) {
				try (ResultSet resultSet = pstmt.executeQuery()) {
					while (resultSet.next()) {
						System.out.println(
								resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3));
					}
				}
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}