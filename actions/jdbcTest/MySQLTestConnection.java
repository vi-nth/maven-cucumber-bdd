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

		String sql = "Select Emp.Emp_Id,Emp.First_Name,Emp.Last_Name,Emp.Dept_Id From  Employee Emp;";
		ResultSet rs = statement.executeQuery(sql); // Thuc thi cau lenh SQl tra ve doi tuong ResultSet
		
		while(rs.next()) {
			int emID = rs.getInt(1);
			String emFirstName = rs.getString(2);
			String emLastName = rs.getString("Last_Name");
			
			System.out.println("------------------");
			System.out.println("Em ID:" +emID);
			System.out.println("Em FirstName:" +emFirstName);
			System.out.println("Em LastName:" +emLastName);
			
		}
		conn.close();
		System.out.println("------Close connection-------");

	}
}
