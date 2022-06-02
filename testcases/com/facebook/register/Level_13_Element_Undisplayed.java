package com.facebook.register;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;

import pageObject.jQuery.uploadFile.HomePageObject;
import pageObject.jQuery.uploadFile.PageGeneratorManager;

public class Level_13_Element_Undisplayed extends BaseTest {
	private WebDriver driver;
	HomePageObject homePage;

	@Parameters({"browser", "url"})
	@BeforeClass
	public void beforeClass(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);
		

	}

	@Test
	public void TC_01_Verify_Element_Displayed() {
	

	}

	@Test
	public void TC_02_Verify_Element_Undisplayed() {
		
		
	}
	
	@Test
	public void TC_02_Verify_Element_Undisplayed_Not_In_Dom() {
	

	}

	@AfterClass
	public void afterClass() {
	}

}
