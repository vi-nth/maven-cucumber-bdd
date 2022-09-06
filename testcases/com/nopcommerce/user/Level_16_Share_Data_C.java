package com.nopcommerce.user;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.nopcommerce.common.Common_01_Register;
import com.nopcommerce.common.Common_01_Register_Cookies;

import commons.BaseTest;
import commons.PageGeneratorManager;
import pageObjects.nopCommerce.user.UserHomePageObject;
import pageObjects.nopCommerce.user.UserLoginPageObject;
public class Level_16_Share_Data_C extends BaseTest {
	private WebDriver driver;

	private UserHomePageObject homePage;
	private UserLoginPageObject loginPage;

	private String emailAddress, password;

	@Parameters({ "envName", "severName", "browser", "ipAddress", "portNumber", "osName", "osVersion" })
	@BeforeClass
	public void beforeClass(@Optional("local") String envName, @Optional("dev") String severName,
			@Optional("chrome") String browserName, @Optional("localhost") String ipAddress,
			@Optional("4444") String portNumber, @Optional("Windows") String osName, @Optional("10") String osVersion) {
		driver = getBrowserDriver(envName, severName, browserName, ipAddress, portNumber, osName, osVersion);
		
		homePage = PageGeneratorManager.getUserHomePage(driver);

		emailAddress = Common_01_Register.emailAddress;
		password = Common_01_Register.password;

		log.info("Pre-condition - Step 1: Navigate To Login Page");
		loginPage = homePage.openLoginPage();

		log.info("Pre-condition - Step 2: Set cookie and reload page");
		loginPage.setCookies(driver, Common_01_Register_Cookies.loggedCookies);
		for (Cookie cookie : Common_01_Register_Cookies.loggedCookies) {
			System.out.println("Cookies at C Class:" + cookie);
		}
		loginPage.refreshCurrentPage(driver);

		log.info("Pre-condition - Step 03: Verify 'My Account' Link is Displayed");
		verifyTrue(homePage.isMyAccountLinkDisplayed());

	}

	@Test
	public void Search_01_Empty_Data() {

	}

	@Test
	public void Search_02_Relative_Product_Name() {

	}

	@Test
	public void Search_03_Absolute_Product_Name() {

	}

	@Test
	public void Search_04_Parent_Catergory() {

	}

	@Test
	public void Search_05_Incorrect_Manufacturer() {

	}

	@Test
	public void Search_05_Correct_Manufacturer() {

	}

	@AfterClass
	public void afterClass() {
		driver.quit();

	}

}
