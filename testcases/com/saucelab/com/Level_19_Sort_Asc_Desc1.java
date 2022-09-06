package com.saucelab.com;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import commons.BaseTest;
import pageObject.sauceLab.LoginPageObject;
import pageObject.sauceLab.PageGeneratorManager;
import pageObject.sauceLab.ProductPageObject;


public class Level_19_Sort_Asc_Desc1 extends BaseTest {
	private WebDriver driver;
	private LoginPageObject loginPage;
	private ProductPageObject productPage;
	

	@Parameters({ "envName", "severName", "browser", "ipAddress", "portNumber", "osName", "osVersion" })
	@BeforeClass
	public void beforeClass(@Optional("local") String envName, @Optional("dev") String severName,
			@Optional("chrome") String browserName, @Optional("localhost") String ipAddress,
			@Optional("4444") String portNumber, @Optional("Windows") String osName, @Optional("10") String osVersion) {
		driver = getBrowserDriver(envName, severName, browserName, ipAddress, portNumber, osName, osVersion);
		
		loginPage = PageGeneratorManager.getLoginPage(driver);
		loginPage.enterToUserTextbox("standard_user");
		loginPage.enterToPasswordTextbox("secret_sauce");
		productPage = loginPage.clickOnLoginButton();
		
	}

	@Test
	public void Sort_01_Name() {
		
		productPage.selectItemInProductSortDropdown("Name (A to Z)");
		sleepInSecond(2);
		//Assert.assertTrue(productPage.isProductNameSortByAscending());
		Assert.assertTrue(productPage.isProductNameSortByAscendingLamda());
		productPage.selectItemInProductSortDropdown("Name (Z to A)");
		sleepInSecond(2);
		//Assert.assertTrue(productPage.isProductNameSortByDescending());
		Assert.assertTrue(productPage.isProductNameSortByDescendingLamda());
		
	}
	
	//@Test
	public void Sort_02_Price() {
		
		productPage.selectItemInProductSortDropdown("Price (low to high)");
		sleepInSecond(2);
		Assert.assertTrue(productPage.isProductPriceSortByAscending());
		productPage.selectItemInProductSortDropdown("Price (high to low)");
		sleepInSecond(2);
		Assert.assertTrue(productPage.isProductPriceSortByDescending());
		
	}
		

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		//closeBrowserAndDriver();
	}



}
