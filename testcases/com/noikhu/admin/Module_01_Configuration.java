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
import pageObject.noiKhu.ExploitingPageObject;
import pageObject.noiKhu.HomePageObject;
import pageObject.noiKhu.LoginPageObject;
import pageObject.noiKhu.ManagementPageObject;
import pageObjects.nopCommerce.user.UserCustomerInforPageObject;
import pageObjects.nopCommerce.user.UserHomePageObject;
import pageObjects.nopCommerce.user.UserLoginPageObject;
import pageObjects.nopCommerce.user.UserRegisterPageObject;

public class Module_01_Configuration extends BaseTest {
	private WebDriver driver;
	private LoginPageObject loginPage;
	private HomePageObject homePage;
	private ConfigurationPageObject configurationPage;
	private ExploitingPageObject exploitingPage;
	private ManagementPageObject managementPage;
	
	String csharpFileName = "CSharp.png";
	String javaFileName = "java.png";
	String pythonFileName = "Python.png";
	String rubyFileName = "Ruby.png";
	String[] multipleFileNames = { csharpFileName, javaFileName, pythonFileName, rubyFileName };


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

		log.info("Config - Step 03: Enter to FolderName Textbox with value is '" + folderName + "'");
		configurationPage.inputToFolderNameTextbox(folderName);

		log.info("Config - Step 04: Click on 'Folder Save' Button");
		configurationPage.clickOnFolderSaveButton();

		log.info("Config - Step 05: Verify 'Add New Folder'successful Message is displayed");
		verifyTrue(configurationPage.isFolderSuccessfullMessageDisplayed("Thêm thư mục thành công!"));
	}

	@Test
	public void Config_02_Create_New_Layer_Arcgis() {

		log.info("Config - Step 01: Enter FolerName to Search Textbox with value is '" + folderName + "'");
		configurationPage.inputFolderNameToSearchTextbox(folderName);

		log.info("Config - Step 02: Click on 'Add New Layer' Button");
		configurationPage.clickOnAddNewLayerButton();

		log.info("Config - Step 03: Click on 'Sync' Button");
		configurationPage.clickOnSyncButton();

		log.info("Config - Step 03: Verify Sync message is displayed");
		verifyTrue(configurationPage.isSyncMessageDisplayed("Đồng bộ thành công"));

		log.info("Config - Step 04: Select Arcgis layer with value is evn/testpolygon ");
		configurationPage.selectArcgisItem("evn/testpolygon");

		log.info("Config - Step 05: Enter to LayerName with value is '" + layerName + "'");
		configurationPage.inputToLayerName(layerName);

		log.info("Config - Step 06: Click on 'Layer Save' Button");
		configurationPage.clickOnLayerSavebutton1();

		log.info("Config - Step 07: Select property in Arcgis layer");
		configurationPage.selectPropertyInArcgisLayer("OBJECTID");
		sleepInSecond(1);

		log.info("Config - Step 08: Click on 'Layer Save' Button");
		System.out.println("Start time=" + getCurrentTime());
		configurationPage.clickOnLayerSavebutton2();
		sleepInSecond(1);

		log.info("Config - Step 09: Verify 'Add New Layer'successful Message is displayed");
		verifyTrue(configurationPage.isAddLayerSuccessfullMessageDisplayed());
		System.out.println("End time=" + getCurrentTime());

		log.info("Config - Step 10: Enter LayerName to Search Textbox with value is '" + layerName + "'");
		configurationPage.inputFolderNameToSearchTextbox(layerName);
	}

	@Test
	public void Config_03_Config_Layer_Display_On_Map() {
		log.info("Config - Step 01: Click on 'Config' Button on main menu");
		configurationPage.clickOnConfigButton();

		log.info("Config - Step 02: Check to 'Display 2D on 3D' Checkbox");
		configurationPage.checkToConfigCheckbox("Hiển thị đối tượng 2D trên bản đồ 3D");

		log.info("Config - Step 03: Check to 'Display Label' Checkbox");
		configurationPage.checkToConfigCheckbox("Hiển thị tên đối tượng");

		log.info("Config - Step 04: Click on 'Save Properties' Button");
		configurationPage.clickOnButtonSaveProperties();

		log.info("Config - Step 05: Verify successful config message is displayed");
		Assert.assertTrue(configurationPage.isSuccessfulConfigMessageDisplayed());
		
		// Upload image and Mode 3D
		log.info("Config - Step 06: Click On 'Thong tin' Button");
		configurationPage.clickOnInforTab();
		
		log.info("Config - Step 07: Upload Icon 2D");
		configurationPage.uploadMultipleFilesConfiguration(driver, "Ảnh icon (png, jpg, jpeg)","");
		
		log.info("Config - Step 07.1: Upload Icon 2D");
		Assert.assertTrue(configurationPage.isFileLoadedByName(""));
		
		
		log.info("Config - Step 08: Check to 'Hien thi icon o vi tri tam toa do");
		configurationPage.checkToIconCenterCheckbox();
		
		log.info("Config - Step 08: Verify place holder is 'Chon kieu mo hinh'");
		configurationPage.checkToIconCenterCheckbox();
		
		log.info("Config - Step 07: Select Model Type is 'Mo hinh mau'");
		configurationPage.selectModelType("Mô hình mẫu");
		
		log.info("Config - Step 07: Select Sample model with name is 'Ủy Ban'");
		configurationPage.selectSampleMode3D("Ủy Ban");
		
		log.info("Config - Step 07: Config 'Tỉ lệ', 'Góc xoay', 'Độ cao'");
		configurationPage.inputValueOfProperty("Tỉ lệ", "2");
		configurationPage.inputValueOfProperty("Góc xoay", "10");
		configurationPage.inputValueOfProperty("Độ cao", "2");
		
		log.info("Config - Step 04: Click on 'Save Properties' Button");
		configurationPage.clickOnButtonSaveProperties();
		
		log.info("Config - Step 05: Verify successful config message is displayed");
		Assert.assertTrue(configurationPage.isSuccessfulConfigMessageDisplayed());
		
		log.info("Config - Step 07: Select Model Type is 'Chọn file'");
		configurationPage.uploadFileByName("Tệp đối tượng","");
		
		log.info("Config - Step 07: Select Model Type is 'Mo hinh mau'");
		configurationPage.uploadFileByName("Ảnh texture","");
		
		log.info("Config - Step 04: Click on 'Save Properties' Button");
		configurationPage.clickOnButtonSaveProperties();
		
		log.info("Config - Step 05: Verify successful config message is displayed");
		Assert.assertTrue(configurationPage.isSuccessfulConfigMessageDisplayed());
		

		
		
		log.info("Config - Step 06: Change folder for layer");
		configurationPage.selectNewFolderForLayer("Lớp Demo sản phẩm");

		log.info("Config - Step 06.1: Click Button Sync Arcgis Layer");
		configurationPage.clickSyncArcgisLayerAtEdit();

		log.info("Config - Step 06.2: Verify Sync message is displayed");
		verifyTrue(configurationPage.isSyncMessageDisplayed("Đồng bộ thành công"));

		log.info("Config - Step 07: Change Arcgis Layer");
		configurationPage.selectNewArcgisLayer("evn/DuongDayTPBT");

		log.info("Config - Step 08: Click on Update Button");
		configurationPage.clickOnUpdateButton();

		log.info("Config - Step 09: Verify popup confirm displayed");
		Assert.assertTrue(configurationPage.isComfirmPopupDisplayed());

		log.info("Config - Step 10: Click 'Yes' to confirm");
		configurationPage.clickOnConfirmChangeArcgisLayerButton("Hủy");

		log.info("Config - Step 08: Click on Update Button");
		configurationPage.clickOnUpdateButton();

		log.info("Config - Step 09: Verify popup confirm displayed");
		Assert.assertTrue(configurationPage.isComfirmPopupDisplayed());

		log.info("Config - Step 11: Click 'Yes' to confirm");
		configurationPage.clickOnConfirmChangeArcgisLayerButton("Đồng ý");

		log.info("Config - Step 12: Verify sidebar select properties for Arcgis displayed");
		Assert.assertTrue(configurationPage.isSidebarArcgisDisplayed());

		log.info("Config - Step 13: Select property in Arcgis layer");
		configurationPage.selectPropertyInArcgisLayer("OBJECTID");
		sleepInSecond(1);

		log.info("Config - Step 14: Click on 'Layer Save' Button");
		System.out.println("Start time=" + getCurrentTime());
		configurationPage.clickOnLayerSavebutton2();
		sleepInSecond(1);

		log.info("Config - Step 15: Verify 'Updated successful Message is displayed");
		verifyTrue(configurationPage.isUpdateSuccessfullMessageDisplayed());
		System.out.println("End time=" + getCurrentTime());

		log.info("Config - Step 16: Enter LayerName to Search Textbox with value is '" + layerName + "'");
		configurationPage.inputFolderNameToSearchTextbox(layerName);
	}

	@Test
	public void PublicMap_04_View_layer_info() {

		log.info("Config - Step 01: Navigate to Public Mappage ");
		exploitingPage = configurationPage.clickOnNvbar("Khai thác");

		log.info("Config - Step 02: Search layer namein Search Menu at public map  with value is '" + layerName + "'");
		exploitingPage.inputToSearchLeftmenu(layerName);

		log.info("Config - Step 03: Check to layer name at public map  with value is '" + layerName + "'");
		exploitingPage.checkToLayerName(layerName);
		
		log.info("Config - Step 04: Verify Object Sidebar Displayed");
		exploitingPage.isListObjectSidebarDisplayed();
		
		log.info("Config - Step 05: Verify layer has 3 object");
		Assert.assertEquals(exploitingPage.getNumberObjectInLayer(), 199);
		

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
