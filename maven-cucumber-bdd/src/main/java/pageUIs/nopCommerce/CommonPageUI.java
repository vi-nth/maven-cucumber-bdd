package pageUIs.nopCommerce;

public class CommonPageUI {
	public static final String DYNAMIC_RADIO="XPATH=//div[@id='gender']/span[@class='%s']";
	public static final String DYNAMIC_TEXTBOX="XPATH=//input[@id='%s']";
	public static final String DYNAMIC_DROPDOWN="XPATH=//select[@name='%s']";
	public static final String DYNAMIC_CHECKBOX="XPATH=//input[@id='%s']";
	public static final String DYNAMIC_CHECKBOX_CHECKED="XPATH=//input[@id='%s' and @checked='']";
	public static final String DYNAMIC_BUTTON="XPATH=//button[@id='%s']";
	public static final String DYNAMIC_HEADER_LINK="XPATH=//div[@class='header-links']//a[text()='%s']";
	public static final String DYNAMIC_MESSAGE="XPATH=//div[@class='result' and text()='%s']";

}
