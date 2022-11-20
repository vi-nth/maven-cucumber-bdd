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
	 static String userName, password, userNameLogin, passwordLogin; //Dung bien
	// static de su dung lai data
	//TestContext testContext;
	DataHelper dataTest;

	public RegisterPageSteps(TestContext testContext) {
		driver = Hooks.openAndQuitBrowser();
		//this.testContext = testContext;
		registerPage = PageGeneratorManager.getRegisterPage(driver);
		dataTest = DataHelper.getDataHelper();

		userName = dataTest.getEmailAddrress();
		password = dataTest.getPassword();
	}

	@When("^Input valid value to Register form$")
	public void inputValidValueToRegisterForm() {

		registerPage.inputToFirstNameTextbox(dataTest.getFirstName());
		registerPage.inputToLastNameTextbox(dataTest.getLastName());

		registerPage.inputToEmailTextbox(dataTest.getEmailAddrress());
		//testContext.getDataContext().setContext(Context.userName, registerPage.getEmailText());
		userNameLogin = registerPage.getEmailAddress("Email"); 
		System.out.println(userNameLogin);
	

		registerPage.inputToPasswordTextbox(password);
		//testContext.getDataContext().setContext(Context.password, registerPage.getPasswordTex());
		passwordLogin = registerPage.getPassword("Password");
		System.out.println(passwordLogin);

		//registerPage.inputToConfirmPasswordTextbox(dataTest.getPassword());
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
