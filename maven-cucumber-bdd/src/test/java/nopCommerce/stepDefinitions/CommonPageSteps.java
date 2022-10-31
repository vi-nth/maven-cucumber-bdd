package nopCommerce.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;

import pageObjects.nopCommerce.CommonPageObject;
import pageObjects.nopCommerce.PageGeneratorManager;
import utilities.DataHelper;

public class CommonPageSteps {
	WebDriver driver;
	CommonPageObject commonPage;
	DataHelper dataFaker;
	String email;

	public CommonPageSteps() {
		driver = Hooks.openAndQuitBrowser();
		commonPage = PageGeneratorManager.getCommanPage(driver);
		dataFaker = DataHelper.getDataHelper();
		email = dataFaker.getEmailAddrress();
	}

	@Given("^Navigate to \"([^\"]*)\" Page$")
	public void navigateToPage(String linkPageName) {
		commonPage.clickToDynamicLink(driver, linkPageName);
	}

	@When("^Click to \"([^\"]*)\" Radio button$")
	public void clickToRadioButton(String radioLabelName) {
		commonPage.clickToRadioButtonByLabel(driver, radioLabelName);

	}

	@When("^Input \"([^\"]*)\" textbox with value \"([^\"]*)\"$")
	public void inputTextboxWithValue(String textboxID, String value) {
		if (textboxID.equals("Email")) {
			value = email;

		}
		commonPage.inputToTextboxByID(driver, textboxID, value);

	}

	@When("^Select \"([^\"]*)\" with value \"([^\"]*)\"$")
	public void selectWithValue(String dropdownAttributeName, String itemValue) {
		commonPage.selectToDropdownByName(driver, dropdownAttributeName, itemValue);

	}

	@When("^Click to \"([^\"]*)\" checkbox$")
	public void clickToCheckbox(String checkboxLabelName) {
		commonPage.clickToCheckBoxByLabel(driver, checkboxLabelName);

	}

	@When("^Click to \"([^\"]*)\" button$")
	public void clickToButton(String buttonText) {
		commonPage.clickToButtonByText(driver, buttonText);

	}

	@Then("^Successful resgister message displayed with \"([^\"]*)\"$")
	public void successfulResgisterMessageDisplayedWith(String message) {
		Assert.assertTrue(commonPage.isRegisterSuccessMessageDisplayed(driver, message));

	}

	@When("^Click to \"([^\"]*)\" textlink$")
	public void clickToTextlink(String linkPageName) {
		commonPage.clickToDynamicLink(driver, linkPageName);

	}

	@Then("^The valid displayed at \"([^\"]*)\" with value \"([^\"]*)\"$")
	public void theValidDisplayedAtWithValue(String textboxID, String value) {
		if (textboxID.equals("Email")) {
			value = email;
			
		}
		Assert.assertEquals(commonPage.getTextboxByAttributeValueByID(driver, textboxID), value);
	}
	
	@Then("^The valid displayed at \"([^\"]*)\" dropdown with value \"([^\"]*)\"$")
	public void theValidDisplayedAtDropdownWithValue(String dropdownAttributeName, String itemValue) {
	  Assert.assertTrue(commonPage.isAttributeValueInDropdownDisplayed(driver, dropdownAttributeName, itemValue));
	}

	@Then("^The \"([^\"]*)\" checkbox is checked$")
	public void theCheckboxIsChecked(String checkboxLabelName) {
		Assert.assertTrue(commonPage.isNewsletterChecked(driver, checkboxLabelName));
	}
}
