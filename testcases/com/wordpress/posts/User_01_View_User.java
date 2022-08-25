package com.wordpress.posts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.wordpress.admin.AdminDashboardPO;
import pageObjects.wordpress.admin.AdminLoginPO;
import pageObjects.wordpress.admin.AdminPostSearchPO;
import pageObjects.wordpress.admin.AdminUserPO;
import pageObjects.wordpress.admin.PageGeneratorManager;

public class User_01_View_User extends BaseTest {
	private WebDriver driver;

	private AdminLoginPO adminLoginPage;
	private AdminDashboardPO adminDashboardPage;
	private AdminUserPO adminUserPage;

	String adminUsername = "automationfc";
	String adminPassword = "automationfc";
	int randomNumber = generateFakeNumber();
	String adminUrl, endUserUrl;

	@Parameters({ "browser", "urlAdmin", "urlUser" })
	@BeforeClass
	public void beforeClass(String browserName, String adminUrl, String endUserUrl) {

		log.info("Pre-condition - Step 01: Open browser and Admin Url");
		this.adminUrl = adminUrl;
		this.endUserUrl = endUserUrl;
		driver = getBrowserDriver(browserName, this.adminUrl);
		adminLoginPage = PageGeneratorManager.getAdminLoginPage(driver);

		log.info("Pre-condition - Step 02: Enter in Username Textbox with value:" + adminUsername);
		adminLoginPage.enterInUsernameTextbox(adminUsername);

		log.info("Pre-condition - Step 03: Enter in Password Textbox with value:" + adminPassword);
		adminLoginPage.enterInPasswordTextbox(adminPassword);

		log.info("Pre-condition - Step 04: Click on Login Button");
		adminDashboardPage = adminLoginPage.clickOnLoginButton();

	}

	@Test
	public void TC_01_View_User() {
		log.info("View_User - Step 01: Click on 'User' menu Link");
		adminUserPage = adminDashboardPage.clickOnUserLink();

		log.info("View_User - Step 02: Get all User form UI");
		int totalNumberOfNUmberOnUI = adminUserPage.getAllUserAtUI();
		System.out.println("Number of User on UI = " + totalNumberOfNUmberOnUI);

		log.info("View_User - Step 03: Get all User form DB");
		int totalNumberOfUserAtDB = adminUserPage.getAllUserAtDB();

		log.info("View_User - Step 04: Verify number of User at UI equal DB");
		verifyEquals(totalNumberOfNUmberOnUI, totalNumberOfUserAtDB);

	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		closeBrowserAndDriver();
	}

}
