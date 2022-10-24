package pageObject.noiKhu;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.liveGuru.LoginPageUI;

public class LoginPageObject extends BasePage {
	
WebDriver driver;

protected LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

public void inputToEmailTextbox(String adminName) {
	waitForElementVisible(driver, pageUIs.noiKhu.LoginPageUI.ADMIN_NAME);
	sendkeyToElement(driver, pageUIs.noiKhu.LoginPageUI.ADMIN_NAME, adminName);

	
}

public void inputToPasswordTextbox(String password) {
	waitForElementVisible(driver, pageUIs.noiKhu.LoginPageUI.PASSWORD);
	sendkeyToElement(driver, pageUIs.noiKhu.LoginPageUI.PASSWORD, password);
	
}

public HomePageObject clickToLoginButton() {
	waitForElementClickable(driver, pageUIs.noiKhu.LoginPageUI.LOGIN_BUTTON);
	clickToElement(driver, pageUIs.noiKhu.LoginPageUI.LOGIN_BUTTON);
	return PageGeneratorManager.getHomePage(driver);
}

}
