package com.bankguru.user;



import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.nopcommerce.data.UserData;
import com.nopcommerce.data.UserData.MyAccount;
import com.nopcommerce.data.UserDataMapper;

import commons.BaseTest;
import commons.PageGeneratorManager;
import environmentConfig.Environment;
import pageObjects.nopCommerce.user.UserCustomerInforPageObject;
import pageObjects.nopCommerce.user.UserHomePageObject;
import pageObjects.nopCommerce.user.UserLoginPageObject;
import pageObjects.nopCommerce.user.UserMyProductReviewPageObject;
import pageObjects.nopCommerce.user.UserRegisterPageObject;
import pageObjects.nopCommerce.user.UserRewardPointPageObject;
import utilities.DataHelper;
import pageObjects.nopCommerce.user.UserAddressPageObject;

public class Level_21_Multiple_Environment_Owner extends BaseTest {
	private WebDriver driver;
	Environment environment;


	@Parameters({"browser", "url"})
	@BeforeClass
	public void beforeClass(String browserName, String appUrl) {
		ConfigFactory.setProperty("env", appUrl);
		environment = ConfigFactory.create(Environment.class);
		driver = getBrowserDriver(browserName,environment.appUrl());
		
		System.out.println(environment.osName());
		System.out.println("Current url = " + driver.getCurrentUrl());
		
	
	}
	

	@Test
	public void User_01_Register() {
		
	}
	
	@Test
	public void User_02_Login() {
		
	}
	
	@Test
	public void User_03_My_Account() {
	
	}


	@AfterClass(alwaysRun = true)
	public void afterClass() {
		closeBrowserAndDriver();
	}



}
