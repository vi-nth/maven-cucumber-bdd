package pageObject.noiKhu;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.noiKhu.HomePageUI;

public class HomePageObject extends BasePage {
	
WebDriver driver;

protected HomePageObject(WebDriver driver) {
		this.driver = driver;
	}

public ConfigurationPageObject clickOnConfigurationButton() {
	waitForAllElementVisible(driver, HomePageUI.Config_Button);
	clickToElement(driver, HomePageUI.Config_Button);
	return PageGeneratorManager.getConfigurationPage(driver);
}

}
