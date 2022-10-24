package pageObject.noiKhu;

import org.openqa.selenium.WebDriver;


import commons.BasePage;
import commons.GlobalConstants;
import pageUIs.jQuery.uploadFile.BasePageJQueryUI;
import pageUIs.noiKhu.ConfiguationPageUI;


public class ConfigurationPageObject extends BasePage {

	WebDriver driver;

	protected ConfigurationPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnAddNewFolderButton() {
		waitForElementClickable(driver, ConfiguationPageUI.ADD_FOLDER);
		clickToElement(driver, ConfiguationPageUI.ADD_FOLDER);

	}

	public void inputToFolderNameTextbox(String folderName) {
		waitForElementVisible(driver, ConfiguationPageUI.FOLDER_TEXTBOX);
		sendkeyToElement(driver, ConfiguationPageUI.FOLDER_TEXTBOX, folderName);

	}

	public void clickOnFolderSaveButton() {
		waitForElementClickable(driver, ConfiguationPageUI.SAVE_FOLDER_BUTTON);
		clickToElement(driver, ConfiguationPageUI.SAVE_FOLDER_BUTTON);

	}

	public boolean isFolderSuccessfullMessageDisplayed(String successfullFolderMessage) {
		waitForElementVisible(driver, ConfiguationPageUI.FOLDER_SUCCESSFULL_MESSAGE, successfullFolderMessage);
		return isElementDisplayed(driver, ConfiguationPageUI.FOLDER_SUCCESSFULL_MESSAGE, successfullFolderMessage);
	}

	public void inputFolderNameToSearchTextbox(String folderName) {
		waitForAllElementVisible(driver, ConfiguationPageUI.SEARCH_FOLDER);
		sendkeyToElement(driver, ConfiguationPageUI.SEARCH_FOLDER, folderName);

	}

	public void clickOnAddNewLayerButton() {
		waitForElementClickable(driver, ConfiguationPageUI.ADD_LAYER);
		clickToElement(driver, ConfiguationPageUI.ADD_LAYER);
	}

	public void inputToLayerName(String layerName) {
		waitForElementVisible(driver, ConfiguationPageUI.LAYER_TEXTBOX,layerName);
		sendkeyToElement(driver, ConfiguationPageUI.LAYER_TEXTBOX, layerName);
	}

	public void clickOnLayerSavebutton1() {
		waitForElementClickable(driver, ConfiguationPageUI.SAVE_LAYER_BUTTON);
		clickToElementByJS(driver, ConfiguationPageUI.SAVE_LAYER_BUTTON);

	}

	public boolean isAddLayerSuccessfullMessageDisplayed() {
		waitForElementVisible(driver, ConfiguationPageUI.LAYER_SUCCESSFULL_MESSAGE);
		return isElementDisplayed(driver, ConfiguationPageUI.LAYER_SUCCESSFULL_MESSAGE);
		
	}

	public void clickOnPropertybutton() {
		waitForElementClickable(driver, ConfiguationPageUI.PROPERTY_BUTTON);
		clickToElementByJS(driver, ConfiguationPageUI.PROPERTY_BUTTON);


	}

	public void clickOnUpdateButton() {
		waitForElementClickable(driver, ConfiguationPageUI.CONFIG_UPDATE_BUTTON);
		clickToElement(driver, ConfiguationPageUI.CONFIG_UPDATE_BUTTON);

	}


	public void clickOnSyncButton() {
		waitForElementClickable(driver, ConfiguationPageUI.SYNC_ICON);
		clickToElement(driver, ConfiguationPageUI.SYNC_ICON);

	}

	public boolean isSyncMessageDisplayed(String successfullSyncMessage) {
		waitForElementVisible(driver, ConfiguationPageUI.SUCCESSFUL_MESS_SYNC, successfullSyncMessage);
		return isElementDisplayed(driver, ConfiguationPageUI.SUCCESSFUL_MESS_SYNC, successfullSyncMessage);
		
	}

	public void selectArcgisItem(String arcGisItem) {
		waitForElementClickable(driver, ConfiguationPageUI.TREEVIEW);
		clickToElement(driver, ConfiguationPageUI.TREEVIEW);
		
		waitForElementClickable(driver, ConfiguationPageUI.SUB_TREEVIEW);
		clickToElement(driver, ConfiguationPageUI.SUB_TREEVIEW);
		
		waitForElementClickable(driver, ConfiguationPageUI.FOLDER_TREEVIEW);
		clickToElement(driver, ConfiguationPageUI.FOLDER_TREEVIEW);
		
		
		waitForElementVisible(driver, ConfiguationPageUI.ITEM_TREEVIEW,arcGisItem);
		clickToElement(driver, ConfiguationPageUI.ITEM_TREEVIEW, arcGisItem);
		
	}

	public ExploitingPageObject clickOnNvbar(String nvbarName) {
		waitForElementClickable(driver, ConfiguationPageUI.NVBAR_SIDEBAR, nvbarName);
		clickToElement(driver, ConfiguationPageUI.NVBAR_SIDEBAR, nvbarName);
		return PageGeneratorManager.getExploitingPage(driver);

	}

	public void selectPropertyInArcgisLayer(String propertyArcgis) {
		waitForElementVisible(driver, ConfiguationPageUI.SELECT_PROPERTY_IN_ARCGIS_LAYER);
		selectItemInDefautlDropDown(driver, ConfiguationPageUI.SELECT_PROPERTY_IN_ARCGIS_LAYER, propertyArcgis);
		
	}

	public void clickOnLayerSavebutton2() {
		waitForElementClickable(driver, ConfiguationPageUI.SAVE_ARCGIS_BUTTON);
		clickToElementByJS(driver, ConfiguationPageUI.SAVE_ARCGIS_BUTTON);
		
	}

	public void clickOnFolderName(String folderName) {
		waitForElementClickable(driver, ConfiguationPageUI.NAME_FOLDER_ITEM, folderName);
		clickToElement(driver, ConfiguationPageUI.NAME_FOLDER_ITEM, folderName);
	}

	public void selectArcgisItem2(String arcGisItem) {
		waitForElementClickable(driver, ConfiguationPageUI.TREEVIEW);
		clickToElement(driver, ConfiguationPageUI.TREEVIEW);
		
		waitForElementClickable(driver, ConfiguationPageUI.SUB_TREEVIEW);
		waitForElementClickable(driver, ConfiguationPageUI.FOLDER_TREEVIEW);

		waitForElementVisible(driver, ConfiguationPageUI.ITEM_TREEVIEW,arcGisItem);
		clickToElement(driver, ConfiguationPageUI.ITEM_TREEVIEW, arcGisItem);
		sleepInSecond(2);
		
	}

	public void clickOnConfigButton() {
		waitForElementClickable(driver, ConfiguationPageUI.CONFIG_BUTTON);
		clickToElement(driver, ConfiguationPageUI.CONFIG_BUTTON);
		
	}

	public void checkToConfigCheckbox(String checkboxName) {
		waitForElementVisible(driver, ConfiguationPageUI.CHECK_ON_CONFIG_CHECKBOX, checkboxName);
		clickToElementByJS(driver, ConfiguationPageUI.CHECK_ON_CONFIG_CHECKBOX, checkboxName);
		sleepInSecond(2);
		
	}

	public void clickOnButtonSaveProperties() {
		waitForElementClickable(driver, ConfiguationPageUI.BUTTON_ON_SAVE_PROPERTIES);
		clickToElementByJS(driver, ConfiguationPageUI.BUTTON_ON_SAVE_PROPERTIES);
		
	}

	public boolean isSuccessfulConfigMessageDisplayed() {
		waitForElementVisible(driver, ConfiguationPageUI.SUCCESSFUL_CONFIGURATION_MESSAGE_DISPLAYE);
		return isElementDisplayed(driver, ConfiguationPageUI.SUCCESSFUL_CONFIGURATION_MESSAGE_DISPLAYE);
		
	}

	public void selectNewFolderForLayer(String layerNameAtEdit) {
		waitForElementClickable(driver, ConfiguationPageUI.FATHER_FOLDER);
		clickToElement(driver, ConfiguationPageUI.FATHER_FOLDER);
		
		waitForElementClickable(driver, ConfiguationPageUI.MAIN_FOLDER);
		clickToElement(driver, ConfiguationPageUI.MAIN_FOLDER);
		
		waitForElementClickable(driver, ConfiguationPageUI.CHOOSE_NEW_FOLDER, layerNameAtEdit);
		clickToElement(driver, ConfiguationPageUI.CHOOSE_NEW_FOLDER, layerNameAtEdit);
		
	}

	public void selectNewArcgisLayer(String newArcgisLayer) {
		waitForElementClickable(driver, ConfiguationPageUI.ARCFIS_LAYER_AT_EDIT_PAGE);
		clickToElementByJS(driver, ConfiguationPageUI.ARCFIS_LAYER_AT_EDIT_PAGE);
		
		waitForElementClickable(driver, ConfiguationPageUI.CLICK_MAIN_LAYER_AT_EDIT_PAGE);
		clickToElement(driver, ConfiguationPageUI.CLICK_MAIN_LAYER_AT_EDIT_PAGE);
		
		waitForElementClickable(driver, ConfiguationPageUI.CLICK_ARCGIS_LAYER_AT_EDIT_PAGE);
		clickToElement(driver, ConfiguationPageUI.CLICK_ARCGIS_LAYER_AT_EDIT_PAGE);
		
		waitForElementClickable(driver, ConfiguationPageUI.CHOOSE_ARCGIS_LAYER_AT_EDIT_PAGE, newArcgisLayer);
		clickToElement(driver, ConfiguationPageUI.CHOOSE_ARCGIS_LAYER_AT_EDIT_PAGE, newArcgisLayer);
		
	}

	public boolean isComfirmPopupDisplayed() {
		waitForElementVisible(driver, ConfiguationPageUI.CONFIGURATION_POPUP_DISPLAYED);
		return isElementDisplayed(driver, ConfiguationPageUI.CONFIGURATION_POPUP_DISPLAYED);
		
	}

	public void clickOnConfirmChangeArcgisLayerButton(String confirmButtonName) {
		waitForElementClickable(driver, ConfiguationPageUI.CONFIRM_BUTTON, confirmButtonName);
		clickToElement(driver, ConfiguationPageUI.CONFIRM_BUTTON, confirmButtonName);
		
	}

	public boolean isSidebarArcgisDisplayed() {
		waitForElementVisible(driver, ConfiguationPageUI.SIDEBAR_ARCGIS_DISPLAYED);
		return isElementDisplayed(driver, ConfiguationPageUI.SIDEBAR_ARCGIS_DISPLAYED);

		
		
	}

	public boolean isUpdateSuccessfullMessageDisplayed() {
		waitForElementInvisible(driver, ConfiguationPageUI.CONFIRMATION_UPDATE_MESSAGE_DISPLAYED);
		return isElementDisplayed(driver, ConfiguationPageUI.CONFIRMATION_UPDATE_MESSAGE_DISPLAYED);
	}

	public void clickSyncArcgisLayerAtEdit() {
		waitForElementClickable(driver, ConfiguationPageUI.SYNC_BUTTON_AT_EDIT_PAGE);
		clickToElementByJS(driver, ConfiguationPageUI.SYNC_BUTTON_AT_EDIT_PAGE);
	}

	public void clickOnInforTab() {
		waitForElementClickable(driver, ConfiguationPageUI.INFO_TAB);
		clickToElement(driver, ConfiguationPageUI.INFO_TAB);
		
	}

	

	public void checkToIconCenterCheckbox() {
		// TODO Auto-generated method stub
		
	}

	public void selectModelType(String string) {
		// TODO Auto-generated method stub
		
	}

	public void selectSampleMode3D(String string) {
		// TODO Auto-generated method stub
		
	}

	public void inputValueOfProperty(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	public boolean isFileLoadedByName(String string) {
		return false;
		// TODO Auto-generated method stub
		
	}

	public void uploadFileByName(String string, String string2) {
		// TODO Auto-generated method stub
		
	}



	

}
