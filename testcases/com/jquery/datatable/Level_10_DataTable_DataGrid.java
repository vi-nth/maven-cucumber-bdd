package com.jquery.datatable;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObject.jQuery.HomePageObject;
import pageObject.jQuery.PageGeneratorManager;

public class Level_10_DataTable_DataGrid extends BaseTest {
	private WebDriver driver;
	HomePageObject homePage;
	List <String> actualAllCountryValues;
	List <String> expectedAllCountryValues;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);
		homePage = PageGeneratorManager.getHomePage(driver);

	}

//	@Test
	public void Table_01_Paging() {
		homePage.openPagingByPageNumber("10");
		homePage.sleepInSecond(2);
		Assert.assertTrue (homePage.isPageNumberActived("10"));
		homePage.sleepInSecond(2);
		
		homePage.openPagingByPageNumber("15");
		homePage.sleepInSecond(2);
		Assert.assertTrue (homePage.isPageNumberActived("15"));
		
		homePage.openPagingByPageNumber("7");
		homePage.sleepInSecond(2);
		Assert.assertTrue (homePage.isPageNumberActived("7"));
		
		homePage.openPagingByPageNumber("20");
		homePage.sleepInSecond(2);
		Assert.assertTrue (homePage.isPageNumberActived("20"));
		
		
	}

//	@Test
	public void Table_02_Enter_To_Header() {
		homePage.refreshCurrentPage(driver);
		
		homePage.enterToHeaderTextboxByLabel("Country", "Argentina");
		homePage.sleepInSecond(2);
		
		
		homePage.enterToHeaderTextboxByLabel("Females", "15999");
		homePage.sleepInSecond(2);
		homePage.enterToHeaderTextboxByLabel("Males", "407124");
		homePage.sleepInSecond(2);
		homePage.enterToHeaderTextboxByLabel("Total", "12599691");
		homePage.sleepInSecond(2);
		
		homePage.enterToHeaderTextboxByLabel("Country", "Angola");
		homePage.sleepInSecond(2);
		homePage.enterToHeaderTextboxByLabel("Females", "764956");
		homePage.sleepInSecond(2);
		homePage.enterToHeaderTextboxByLabel("Males", "802948");
		homePage.sleepInSecond(2);
		homePage.enterToHeaderTextboxByLabel("Total", "553353");
		homePage.sleepInSecond(2);
	
	}
	
	@Test
	public void Table_03_() {
		actualAllCountryValues = homePage.getValueEachRowAtAllPage();
		
//		Assert.assertEquals(actualAllCountryValues, expectedAllCountryValues);
		
		
	}


	@AfterClass
	public void afterClass() {
	}

}
