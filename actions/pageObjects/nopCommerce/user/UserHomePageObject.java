package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManager;
import io.qameta.allure.Step;
import pageUIs.nopCommerce.user.HomePageUI;

public class UserHomePageObject extends BasePage {
	private WebDriver driver;

	public UserHomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	@Step("Navigate to Register Page")
	public UserRegisterPageObject clickToRegisterLink() {
	waitForElementClickable(driver, HomePageUI.REGISTER_LINK);
	clickToElement(driver, HomePageUI.REGISTER_LINK);
	// 2
	//return new RegisterPageObject(driver);
	return PageGeneratorManager.getRegisterPage(driver);
		
	}
	@Step("Navigate to Login Page")
	public UserLoginPageObject openLoginPage() {
	waitForElementClickable(driver, HomePageUI.LOGIN_LINK);
	clickToElement(driver, HomePageUI.LOGIN_LINK);
	return PageGeneratorManager.getUserLoginPage(driver);
	
	}
	
	@Step("Verify 'My Account' link is displayed")
	public boolean isMyAccountLinkDisplayed() {
		waitForElementVisible(driver, HomePageUI.MY_ACCOUNT_LINK);
		return isElementDisplayed(driver, HomePageUI.MY_ACCOUNT_LINK);
	}

	@Step("Navigate to Customer Infor Page")
	public UserCustomerInforPageObject openMyAccountLink() {
		waitForElementClickable(driver, HomePageUI.MY_ACCOUNT_LINK);
		clickToElement(driver, HomePageUI.MY_ACCOUNT_LINK);
		return PageGeneratorManager.getUserCustomerInforPage(driver);
	}





}
