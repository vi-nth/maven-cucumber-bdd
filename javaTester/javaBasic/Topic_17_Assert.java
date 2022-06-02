package javaBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import commons.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(commons.MethodListener.class)
public class Topic_17_Assert extends BaseTest {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");

	@BeforeClass
	public void beforeClass() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/v4/");
	}

	@Test
	public void TC_01_ValidateCurrentUrl() {
		String loginPageUrl = driver.getCurrentUrl();
		System.out.println("Assert 01 - Passed");
		verifyEquals(loginPageUrl, "https://demo.guru99.com/v4/");

		String loginPageTitle = driver.getTitle();
		System.out.println("Assert 02 - Failed");
		verifyEquals(loginPageTitle, "Guru99 Bank Home Page.");

		System.out.println("Assert 03 - Passed");
		verifyTrue(driver.findElement(By.xpath("//form[@name='frmLogin']")).isDisplayed());
		
		System.out.println("Assert 04 - Passed");
		verifyTrue(driver.findElement(By.xpath("//input[@name='btnLogin']")).isDisplayed());
		
		System.out.println("Assert 05 - Failed");
		verifyFalse(driver.findElement(By.xpath("//input[@name='btnReset']")).isDisplayed());
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
