package pageObjects.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopCommerce.CommonPageUI;
import pageUIs.nopCommerce.CustomerInforPageUI;


public class CommonPageObject extends BasePage {
	WebDriver driver;

	public CommonPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToRadioButtonByLabel(WebDriver driver, String radioLabelName) {
		waitForElementClickable(driver, CommonPageUI.DYNAMIC_RADIO, radioLabelName);
		clickToElement(driver, CommonPageUI.DYNAMIC_RADIO, radioLabelName);

	}

	public void inputToTextboxByID(WebDriver driver, String textboxID, String value) {
		waitForElementVisible(driver, CommonPageUI.DYNAMIC_TEXTBOX, textboxID);
		sendkeyToElement(driver, CommonPageUI.DYNAMIC_TEXTBOX, value, textboxID);
	}

	public void selectToDropdownByName(WebDriver driver, String dropdownAttributeName, String itemValue) {
		waitForElementClickable(driver, CommonPageUI.DYNAMIC_DROPDOWN, dropdownAttributeName);

		selectItemInDefautlDropDown(driver, CommonPageUI.DYNAMIC_DROPDOWN, itemValue, dropdownAttributeName);

	}

	public void clickToCheckBoxByLabel(WebDriver driver, String checkboxLabelName) {
		waitForElementClickable(driver, CommonPageUI.DYNAMIC_CHECKBOX, checkboxLabelName);
		checkToCheckboxOrRadio(driver, CommonPageUI.DYNAMIC_CHECKBOX, checkboxLabelName);
		
	}
	
	public boolean  isNewsletterChecked(WebDriver driver, String checkboxLabelName) {
		waitForElementClickable(driver, CommonPageUI.DYNAMIC_CHECKBOX_CHECKED, checkboxLabelName);
		return isElementDisplayed(driver, CommonPageUI.DYNAMIC_CHECKBOX_CHECKED, checkboxLabelName);

	}

	public void clickToButtonByText(WebDriver driver, String buttonText) {
		waitForElementClickable(driver, CommonPageUI.DYNAMIC_BUTTON, buttonText);
		clickToElement(driver, CommonPageUI.DYNAMIC_BUTTON, buttonText);

	}

	public boolean isRegisterSuccessMessageDisplayed(WebDriver driver, String message) {
		waitForElementVisible(driver, CommonPageUI.DYNAMIC_MESSAGE, message);
		return isElementDisplayed(driver, CommonPageUI.DYNAMIC_MESSAGE, message);
	}

	public UserCustomerInforPageObject openMyAccountLink() {
		waitForElementClickable(driver, CommonPageUI.DYNAMIC_HEADER_LINK);
		clickToElement(driver, CommonPageUI.DYNAMIC_HEADER_LINK);
		return PageGeneratorManager.getUserCustomerInforPage(driver);
	}

	public String getTextboxByAttributeValueByID(WebDriver driver, String textboxID) {
		waitForElementVisible(driver, CommonPageUI.DYNAMIC_TEXTBOX, textboxID);
		return getElementAttribute(driver, CommonPageUI.DYNAMIC_TEXTBOX, "value", textboxID);
		
	}
	
	public boolean isAttributeValueInDropdownDisplayed(WebDriver driver, String dropdownAttributeName, String itemValue) {
		waitForElementVisible(driver, CommonPageUI.DYNAMIC_DROPDOWN, dropdownAttributeName);
		 return isElementUndisplayed(driver, CommonPageUI.DYNAMIC_DROPDOWN, itemValue, dropdownAttributeName);

	}
	
	public void clickToDynamicLink(WebDriver driver, String linkPageName) {
		waitForElementClickable(driver, CommonPageUI.DYNAMIC_HEADER_LINK, linkPageName);
		clickToElement(driver, CommonPageUI.DYNAMIC_HEADER_LINK, linkPageName);
	}

}
