package nopCommerce.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.nopCommerce.PageGeneratorManager;
import pageObjects.nopCommerce.UserHomePageObject;
import utilities.DataHelper;

public class HomePageSteps {
	WebDriver driver;
	UserHomePageObject homePage;
	static String homePageUrl;
	

	public HomePageSteps() {
		this.driver = Hooks.openAndQuitBrowser();
		homePage = PageGeneratorManager.getUserHomePage(driver);
	
	}

	@When("^Navigate to Register Page$")
	public void navigateToRegisterPage() {
		homePage.clickToRegisterLink();
		

	}
	
	@When("^Navigate To Login Page$")
	public void navigateToLoginPage() {
	homePage.clickToLoginLink();

	}
	

	@Then("^My Account link is displayed$")
	public void myAccountLinkIsDisplayed() {
		Assert.assertTrue(homePage.isMyAccountLinkDisplayed());

	}

	public void sleepInSecond(long timeoutInSecond) {
		try {
			Thread.sleep(timeoutInSecond*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

	

}
