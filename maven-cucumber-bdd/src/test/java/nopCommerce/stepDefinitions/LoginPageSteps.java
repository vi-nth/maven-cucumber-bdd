package nopCommerce.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.nopCommerce.PageGeneratorManager;
import pageObjects.nopCommerce.UserLoginPageObject;
import utilities.DataHelper;

public class LoginPageSteps {
	WebDriver driver;
	UserLoginPageObject loginPage;
	DataHelper dataTest;


	public LoginPageSteps() {
	driver = Hooks.openAndQuitBrowser();
	loginPage = PageGeneratorManager.getUserLoginPage(driver);
	dataTest = DataHelper.getDataHelper();
	
	}

	@When("^Input valid value to Login form$")
	public void inputValidValueToLoginForm() {
		loginPage.inputToEmailTexttbox(RegisterPageSteps.userName);
		loginPage.inputToPasswordTextbox(RegisterPageSteps.password);

	}

	@When("^Click Login button$")
	public void clickLoginButton() {
		loginPage.clickToLoginButton();

	}

}
