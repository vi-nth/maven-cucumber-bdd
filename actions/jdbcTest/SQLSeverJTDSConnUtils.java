package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLSeverJTDSConnUtils {

	public static Connection getSQLServerConnection() {
		String hostName = "localhost";
		String sqlInstanceName = "SQLEXPRESS";
		String dbName = "automationfc";
		String userName = "sa";
		String password = "Nayen@1234";

		return getSQLServerConnection(hostName, sqlInstanceName, dbName, userName, password);

	}

	private static Connection getSQLServerConnection(String hostName, String sqlInstanceName, String dbName, String userName, String password) {
		Connection conn = null;
		try {

			//Class.forName("com.mysql.jdbc.Driver"); // Dung cho Java 6, version > 6 khong bat buoc dong nay
			String connectionURL = "jdbc:jtds:sqlserver://" + hostName + ":1433/" + dbName + ";instance=" + sqlInstanceName;
			conn = DriverManager.getConnection(connectionURL, userName, password);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
