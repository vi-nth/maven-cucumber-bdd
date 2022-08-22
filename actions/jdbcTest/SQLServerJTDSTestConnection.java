package jdbcTest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLServerJTDSTestConnection {


	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		System.out.println("Get connection...");
		Connection conn = SQLSeverJTDSConnUtils.getSQLServerConnection(); // Lay ra doi tuong connection ket noi vao DB
		System.out.println("Open connection:" + conn);
		Statement statement = conn.createStatement();

		String sql = "SELECT * FROM [automationfc].[dbo].[PRODUCT_TYPE];";
		ResultSet rs = statement.executeQuery(sql); // Thuc thi cau lenh SQl tra ve doi tuong ResultSet
		
		while(rs.next()) {

			String proType = rs.getString(1);
			String name = rs.getString("NAME");
			
			System.out.println("------------------");
			System.out.println("Product Type:" +proType);
			System.out.println("Name:" +name);
			
		}
		conn.close();
		System.out.println("------Close connection-------");

	}
}
