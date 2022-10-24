package com.noikhu.admin;

import static org.testng.Assert.assertTrue;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.nopcommerce.data.UserDataMapper;

import commons.BaseTest;
import commons.PageGeneratorManager;
import pageObject.noiKhu.ConfigurationPageObject;
import pageObject.noiKhu.HomePageObject;
import pageObject.noiKhu.LoginPageObject;
import pageObject.noiKhu.ManagementPageObject;
import pageObjects.nopCommerce.user.UserCustomerInforPageObject;
import pageObjects.nopCommerce.user.UserHomePageObject;
import pageObjects.nopCommerce.user.UserLoginPageObject;
import pageObjects.nopCommerce.user.UserRegisterPageObject;

public class TC_01_Demo_Follow extends BaseTest {
	private WebDriver driver;
	private LoginPageObject loginPage;
	private HomePageObject homePage;
	private ConfigurationPageObject configurationPage;
	private ManagementPageObject managementPage;

	public static String adminName, password, folderName, propertyName, layerName;

	@Parameters({ "envName", "severName", "browser", "ipAddress", "portNumber", "osName", "osVersion" })
	@BeforeClass
	public void beforeClass(@Optional("local") String envName, @Optional("dev") String severName,
			@Optional("chrome") String browserName, @Optional("localhost") String ipAddress,
			@Optional("4444") String portNumber, @Optional("Windows") String osName, @Optional("10") String osVersion) {
		driver = getBrowserDriver(envName, severName, browserName, ipAddress, portNumber, osName, osVersion);

		adminName = "admin";
		password = "Admin@123";
		folderName = "Foler" + generateFakeNumber();
		layerName = "Layer" + generateFakeNumber();
		propertyName = "Value" + generateFakeNumber();
		loginPage = pageObject.noiKhu.PageGeneratorManager.getLoginPage(driver);

		log.info("Login - Step 01: Enter to EmailAddress Textbox with value is '" + adminName + "'");
		loginPage.inputToEmailTextbox(adminName);

		log.info("Login - Step 02: Enter to Password Textbox with value is '" + password + "'");
		loginPage.inputToPasswordTextbox(password);

		log.info("Register - Step 07: Click To Register Button and move on HomePage");
		homePage = loginPage.clickToLoginButton();

	}

	@Test
	public void Config_01_Create_New_Folder() {
		log.info("Config - Step 01: Click on 'Cau hinh' Page");
		
		configurationPage = homePage.clickOnConfigurationButton();
		
		
		log.info("Config - Step 02: Click on 'Add New Folder' Button");
		configurationPage.clickOnAddNewFolderButton();
		
		log.info("Config - Step 03: Enter to FolderName Textbox with value is '"+folderName+"'");
		configurationPage.inputToFolderNameTextbox(folderName);
		
		log.info("Config - Step 04: Click on 'Folder Save' Button");
		configurationPage.clickOnFolderSaveButton();
		
		log.info("Config - Step 04.1: Verify 'Add New Folder'successful Message is displayed");
		verifyTrue(configurationPage.isFolderSuccessfullMessageDisplayed("Thêm thư mục thành công!"));
		

		log.info("Config - Step 05: Enter FolerName to Search Textbox with value is '"+folderName+"'");
		configurationPage.inputFolderNameToSearchTextbox(folderName);

		log.info("Config - Step 06: Click on 'Add New Layer' Button");
		configurationPage.clickOnAddNewLayerButton();
		
		log.info("Config - Step 06.1: Click on 'Sync' Button");
		configurationPage.clickOnSyncButton();
		
		log.info("Config - Step 06.2: Verify Sync message is displayed");
		verifyTrue(configurationPage.isSyncMessageDisplayed("Đồng bộ thành công"));
		
		log.info("Config - Step 06.3: Select Arcgis layer with value is evn/testpolygon ");
		configurationPage.selectArcgisItem("evn/trudien");
		
		log.info("Config - Step 07: Enter to LayerName with value is '"+layerName+"'");
		configurationPage.inputToLayerName(layerName);

		log.info("Config - Step 08: Click on 'Layer Save' Button");
		configurationPage.clickOnLayerSavebutton1();
		
		log.info("Config - Step 09: Select property in Arcgis layer");
		configurationPage.selectPropertyInArcgisLayer("OBJECTID");
		sleepInSecond(1);
		
		log.info("Config - Step 10: Click on 'Layer Save' Button");
		System.out.println("Start time=" + getCurrentTime());
		configurationPage.clickOnLayerSavebutton2();
		sleepInSecond(1);
	
		
		log.info("Config - Step 11: Verify 'Add New Layer'successful Message is displayed");
		verifyTrue(configurationPage.isAddLayerSuccessfullMessageDisplayed());
		//configurationPage.isAddLayerSuccessfullMessageDisplayed();
		System.out.println("End time=" + getCurrentTime());
		
		log.info("Config - Step 11.1: Enter LayerName to Search Textbox with value is '"+layerName+"'");
		configurationPage.inputFolderNameToSearchTextbox(layerName);
		
		System.out.println("Lan 2 *******************");
		
		log.info("Config - Step 05: Enter FolerName to Search Textbox with value is '"+folderName+"'");
		configurationPage.inputFolderNameToSearchTextbox(folderName);
		
		log.info("Config - Step 05.1: Click on FolderName with value is '"+folderName+"'");
		configurationPage.clickOnFolderName(folderName);
		
		log.info("Config - Step 06: Click on 'Add New Layer' Button");
		configurationPage.clickOnAddNewLayerButton();
		
		log.info("Config - Step 06.3: Select Arcgis layer with value is evn/testpolygon ");
		configurationPage.selectArcgisItem2("evn/trudien");
		
		log.info("Config - Step 07: Enter to LayerName with value is '"+layerName+"'");
		configurationPage.inputToLayerName(layerName);
		
		log.info("Config - Step 08: Click on 'Layer Save' Button");
		configurationPage.clickOnLayerSavebutton1();
		
		log.info("Config - Step 09: Select property in Arcgis layer");
		configurationPage.selectPropertyInArcgisLayer("OBJECTID");
		sleepInSecond(1);
		
		log.info("Config - Step 10: Click on 'Layer Save' Button");
		System.out.println("Start time=" + getCurrentTime());
		configurationPage.clickOnLayerSavebutton2();
		sleepInSecond(1);
		
		
		log.info("Config - Step 11: Verify 'Add New Layer'successful Message is displayed");
		verifyTrue(configurationPage.isAddLayerSuccessfullMessageDisplayed());
		System.out.println("End time=" + getCurrentTime());
		
		log.info("Config - Step 11.1: Enter LayerName to Search Textbox with value is '"+layerName+"'");
		configurationPage.inputFolderNameToSearchTextbox(layerName);
		
		System.out.println("Lan 3 *******************");
		
		log.info("Config - Step 05: Enter FolerName to Search Textbox with value is '"+folderName+"'");
		configurationPage.inputFolderNameToSearchTextbox(folderName);
		
		log.info("Config - Step 05.1: Click on FolderName with value is '"+folderName+"'");
		configurationPage.clickOnFolderName(folderName);

		log.info("Config - Step 06: Click on 'Add New Layer' Button");
		configurationPage.clickOnAddNewLayerButton();
		
		log.info("Config - Step 06.3: Select Arcgis layer with value is evn/testpolygon ");
		configurationPage.selectArcgisItem2("evn/trudien");
		
		log.info("Config - Step 07: Enter to LayerName with value is '"+layerName+"'");
		configurationPage.inputToLayerName(layerName);

		log.info("Config - Step 08: Click on 'Layer Save' Button");
		configurationPage.clickOnLayerSavebutton1();
		
		log.info("Config - Step 09: Select property in Arcgis layer");
		configurationPage.selectPropertyInArcgisLayer("OBJECTID");
		sleepInSecond(1);
		
		log.info("Config - Step 10: Click on 'Layer Save' Button");
		System.out.println("Start time=" + getCurrentTime());
		configurationPage.clickOnLayerSavebutton2();
	
		
		log.info("Config - Step 11: Verify 'Add New Layer'successful Message is displayed");
		verifyTrue(configurationPage.isAddLayerSuccessfullMessageDisplayed());
		System.out.println("End time=" + getCurrentTime());
		
		log.info("Config - Step 11.1: Enter LayerName to Search Textbox with value is '"+layerName+"'");
		configurationPage.inputFolderNameToSearchTextbox(layerName);
		
		//
		
		
		
		
		log.info("Config - Step 12: Navigate to Public Mappage ");
		configurationPage.clickOnNvbar("Khai thác");
		
//		log.info("Config - Step 13: Search layer namein Search Menu at public map  with value is '"+layerName+"'");
//		configurationPage.inputToSearchLeftmenu(layerName);
//		
//		log.info("Config - Step 14: Check to layer name at public map  with value is '"+layerName+"'");
//		configurationPage.checkToLayerName(layerName);
//		
//		log.info("Config - Step 15: Verify layer has n object");
//		configurationPage.verifyObjectInLayerName();
		
		
		
		
//		log.info("Config - Step 09: Click on 'Add New Property' Button");
//		configurationPage.clickOnPropertybutton();
//		
//		log.info("Config - Step 10: Select DataType in DataType Dropdown");
//		configurationPage.selectItem();
//		
//		
//		log.info("Config - Step 11: Enter PropertyName to Search Textbox with value is '"+propertyName+"'");
//		configurationPage.inputIntoPropertyTextbox();
//		
//		log.info("Config - Step 12: Click on Update Button");
//		configurationPage.clickOnUpdateButton();
//		
//		log.info("Config - Step 13: Verify Update Message is displayed");
//		configurationPage.getUpdateSuccessfullMessage();
//		
		
		
		
		
		
	
	}

	//@Test
	public void User_02_Login() {
		log.info("Register - Step 09: Click To Logout Link");

		log.info("Login - Step 01: Navigate To Login Page");

		log.info("Login - Step 02: Enter to emailAddress Textbox with value is ");

		log.info("Login - Step 03: Enter to Password Textbox with value is ");

		log.info("Login - Step 04: Click To Login Button");

		log.info("Login - Step 05: Verify 'My Account' Link is Displayed");

		log.info("Login - Step 06: Navigate To 'My Account' Page");

		log.info("Login - Step 07: Verify 'Customer Infor Page' is displayed");

	}

	//@Test
	public void User_03_My_Account() {
		log.info("Login - Step 01: Navigate To 'My Account' Page");

		log.info("Login - Step 02: Verify 'Customer Infor Page' is displayed");

		log.info("Login - Step 03: Verify 'First Name' value is correctly");

		log.info("Login - Step 04: Verify 'Last Name' value is correctly");

		log.info("Login - Step 05: Verify 'Email Name' value is correctly");

	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		// closeBrowserAndDriver();
	}
	
	public String getCurrentTime() {
		Date date = new Date();
		return date.toString();
	}


}


