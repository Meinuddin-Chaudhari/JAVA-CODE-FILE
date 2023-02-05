package in.ineuron.main;
import java.io.IOException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import in.ineuron.util.JdbcUtil;

public class selectDate {
	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet resultSet = null;
		Scanner scanner=null;
		
		try {
			connection = JdbcUtil.getJdbcConnection();

			String sqlSelectQuery = "select id,sname,dob,dom from future where id=?";
			if (connection != null)
				pstmt = connection.prepareStatement(sqlSelectQuery);
			
			 scanner =new Scanner(System.in);
			 System.out.println("Enter id to get information");
			Integer  idd=scanner.nextInt();
			
			if (pstmt != null) {
				pstmt.setInt(1, idd);

				resultSet = pstmt.executeQuery();
			}
			if (resultSet != null) {
				
				if (resultSet.next()) {
					System.out.println("SID\tSNAME\tSDOB\t\tSDOM");
					int sid = resultSet.getInt(1);
					String sname = resultSet.getString(2);
					java.sql.Date sdob = resultSet.getDate(3);
					java.sql.Date sdom = resultSet.getDate(4);

					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					String strDob = sdf.format(sdob);
					String strDom = sdf.format(sdom);
					System.out.println( sid+"\t"+sname + "\t" + strDob + "\t" + strDom);

				} else {
					System.out.println("Record not available for the given id :: " + idd);
				}

			}

		} catch (SQLException | IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				JdbcUtil.cleanUp(connection, pstmt, resultSet);
				scanner.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}