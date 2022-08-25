package jdbcTest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLTestConnection {

	public static Connection getMySQLConnection() throws SQLException, ClassNotFoundException {
		return MySQLConnUtils.getMySQLConnection();
	}

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		System.out.println("Get connecyion...");
		Connection conn = MySQLTestConnection.getMySQLConnection(); // Lay ra doi tuong connection ket noi vao DB
		System.out.println("Open connection:" + conn);
		Statement statement = conn.createStatement();

		// String sql = "Select Emp.Emp_Id,Emp.First_Name,Emp.Last_Name,Emp.Dept_Id From
		// Employee Emp;"; //Database automation_testing
		String sql = "SELECT * FROM `wp_users`;";
		ResultSet rs = statement.executeQuery(sql); // Thuc thi cau lenh SQl tra ve doi tuong ResultSet

		while (rs.next()) {
			int userID = rs.getInt(1);
			String userLogin = rs.getString(2);
			String userEmail = rs.getString("user_email");

			System.out.println("------------------");
			System.out.println("Em ID:" + userID);
			System.out.println("Em FirstName:" + userLogin);
			System.out.println("Em LastName:" + userEmail);

		}
		conn.close();
		System.out.println("------Close connection-------");

	}
}
