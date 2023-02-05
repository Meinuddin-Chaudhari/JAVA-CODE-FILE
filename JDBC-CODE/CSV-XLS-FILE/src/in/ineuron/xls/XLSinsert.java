package in.ineuron.xls;
import java.sql.*;
import java.util.Scanner;

public class XLSinsert {
	// workbook.<sheetname> represents the table name
	private static final String EXCEL_INSERT = "insert into hello.Studentform values(?,?,?)";
	public static void main(String[] args) {
		String name = null, address = null;
		Integer id = null;
		Scanner scanner = null;

		try {
			scanner = new Scanner(System.in);
			if (scanner != null) {
				System.out.print("Enter the name :: ");
				name = scanner.next();
				System.out.print("Enter the address:: ");
				address = scanner.next();
				System.out.print("Enter the id:: ");
				id = scanner.nextInt();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
		// jdbc:Excel:///location where the file is present
		String url = "jdbc:Excel:///E:\\Advance-java-Eclipse-File\\JDBC\\CSV-XLS-FILE";
		try (Connection connection = DriverManager.getConnection(url)) {
			try (PreparedStatement pstmt = connection.prepareStatement(EXCEL_INSERT)) {
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.setString(3, address);

				int count = pstmt.executeUpdate();

				if (count == 0) {
					System.out.println("record not inserted...");
				} else {
					System.out.println("record inserted...");
				}
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}