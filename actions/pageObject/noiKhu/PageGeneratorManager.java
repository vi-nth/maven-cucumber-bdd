package pageObject.noiKhu;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {

	public static LoginPageObject getLoginPage(WebDriver driver) {
		return new LoginPageObject(driver);

	}

	public static HomePageObject getHomePage(WebDriver driver) {
		return new HomePageObject(driver);
		
	}
	
	public static ConfigurationPageObject getConfigurationPage(WebDriver driver) {
		return new ConfigurationPageObject(driver);

	}
	
	public static ManagementPageObject getManagementPage(WebDriver driver) {
		return new ManagementPageObject(driver);
	}

	public static ExploitingPageObject getExploitingPage(WebDriver driver) {
		return new ExploitingPageObject(driver);
	}



}
