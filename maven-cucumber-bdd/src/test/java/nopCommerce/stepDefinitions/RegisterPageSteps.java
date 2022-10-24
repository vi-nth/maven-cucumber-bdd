package nopCommerce.stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.nopCommerce.PageGeneratorManager;
import pageObjects.nopCommerce.UserRegisterPageObject;
import utilities.DataHelper;

public class RegisterPageSteps {
	WebDriver driver;
	UserRegisterPageObject registerPage;
	static String userName, password, userNameLogin, passwordLogin;
	DataHelper dataTest;

	public RegisterPageSteps() {
		driver = Hooks.openAndQuitBrowser();
		registerPage = PageGeneratorManager.getRegisterPage(driver);
		dataTest = DataHelper.getDataHelper();
		
		userName = dataTest.getEmailAddrress();
		password = dataTest.getPassword();
	}

	@When("^Input valid value to Register form$")
	public void inputValidValueToRegisterForm() {

		registerPage.inputToFirstNameTextbox(dataTest.getFirstName());
		registerPage.inputToLastNameTextbox(dataTest.getLastName());

		registerPage.inputToEmailTextbox(userName);
		userNameLogin = registerPage.getEmailText();
	
		registerPage.inputToPasswordTextbox(password);
		passwordLogin = registerPage.getPasswordTex();
	

		registerPage.inputToConfirmPasswordTextbox(password);

	}

	@When("^Click to Register button$")
	public void clickToRegisterButton() {
		registerPage.clickToRegisterButton();

	}

	@Then("^Verify Register successful message is displayed$")
	public void verifyRegisterSuccessfulMessageIsDisplayed() {
		registerPage.getRegisterSuccessMessage();

	}

	@When("^Click to Logout Link$")
	public void clickToLogoutLink() {
		registerPage.clickToLogoutLink();

	}

}
