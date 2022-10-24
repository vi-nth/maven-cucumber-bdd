package pageObjects.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopCommerce.HomePageUI;

public class UserHomePageObject extends BasePage {
	private WebDriver driver;

	public UserHomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String getHomePageUrl() {
		return getCurrentUrl(driver);
	}
	
	public UserRegisterPageObject clickToRegisterLink() {
		waitForElementClickable(driver, HomePageUI.REGISTER_LINK);
		clickToElement(driver, HomePageUI.REGISTER_LINK);
		return PageGeneratorManager.getRegisterPage(driver);

	}

	public UserLoginPageObject clickToLoginLink() {
		waitForElementClickable(driver, HomePageUI.LOGIN_LINK);
		clickToElement(driver, HomePageUI.LOGIN_LINK);
		return PageGeneratorManager.getUserLoginPage(driver);

	}

	public boolean isMyAccountLinkDisplayed() {
		waitForElementVisible(driver, HomePageUI.MY_ACCOUNT_LINK);
		return isElementDisplayed(driver, HomePageUI.MY_ACCOUNT_LINK);
	}

	public UserRegisterPageObject clickButtonLinkByHref(String href) {
		if (driver.toString().toLowerCase().contains("internet explorer")) {
			driver.get(getElementAttribute(driver, HomePageUI.CLICK_BUTTON_BY_HREF, "href"));
		} else {
			clickToElement(driver, HomePageUI.CLICK_BUTTON_BY_HREF);
		}
		return PageGeneratorManager.getRegisterPage(driver);
	}

}
