package pageObjects.wordpress.admin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import jdbcTest.MySQLTestConnection;
import pageUIs.wordpress.admin.AdminUserPageUI;
import utilities.MySQLConnUtils;

public class AdminUserPO extends BasePage {
	WebDriver driver;

	protected AdminUserPO(WebDriver driver) {
		this.driver = driver;
	}

	public int getAllUserAtUI() {
		waitForElementVisible(driver, AdminUserPageUI.NUMBER_OF_USER);
		String totalNumber = getElementText(driver, AdminUserPageUI.NUMBER_OF_USER);

//		String totalArray[] = totalNumber.split("");
//		totalNumber = totalArray[0];

		return Integer.parseInt(totalNumber.split("")[0]);

	}

	public int getAllUserAtDB() {
		Connection conn = MySQLConnUtils.getMySQLConnection();
		Statement statement;
		List<Integer> totalUsers = new ArrayList<Integer>();
		try {
			statement = conn.createStatement();
			String sql = "SELECT * FROM `wp_users`;";
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				totalUsers.add(rs.getInt(1));
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getString(5));
				System.out.println("Number of User at DB = "+ totalUsers.size());
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return totalUsers.size();
	}

}
