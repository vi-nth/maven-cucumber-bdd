package facebook.stepDefinitions;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSteps {
	WebDriver driver;
	
	@Before("@parameter")
	public void openFacebookApplication() {
		WebDriverManager.firefoxdriver().setup();
		driver =  new FirefoxDriver();
		driver.get("https://vi-vn.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@After("@parameter")
	public void closeApplication() {
		driver.quit();
	}

	@When("^Input to Username Textbox$")
	public void inputToUsernameTextbox() {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("automationtest@gmail.com");
	}

	@When("^Input to Password Textbox$")
	public void inputToPasswordTextbox() {
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("123456");
	}
	
	@When("^Input to Username Textbox with \"([^\"]*)\"$")
	public void inputToUsernameTextboxWith(String email) {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
		
	}
	
	@When("^Input to Password Textbox with \"([^\"]*)\"$")
	public void inputToPasswordTextbox(String password) {
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(password);
	}
	
	@When("^Input to Username Textbox with ([^\"]*)$")
	public void inputToUsernameTextbox(String email) {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
		
	}

	@When("^Input to Password Textbox with ([^\"]*)$")
	public void inputToPasswordTextboxWith(String password) {
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(password);
	}
	
	@When("^Input to Username with \"([^\"]*)\" and Password with \"([^\"]*)\"$")
	public void inputToUsernameWithAndPasswordWith(String email, String password) {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
		
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(password);
	}
	
	@When("^Input to Username and Password$")
	public void inputToUsernameAndPassword(DataTable table) {
		List<Map<String, String>> customer = table.asMaps(String.class, String.class);
	
//		driver.findElement(By.id("email")).clear();
//		driver.findElement(By.id("email")).sendKeys(customer.get(0).get("Username"));
//		
//		driver.findElement(By.id("pass")).clear();
//		driver.findElement(By.id("pass")).sendKeys(customer.get(0).get("Password"));
		
		for (Map<String, String> loginInfor : table.asMaps(String.class, String.class)) {
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(loginInfor.get("Username"));
			
			driver.findElement(By.id("pass")).clear();
			driver.findElement(By.id("pass")).sendKeys(loginInfor.get("Password"));

			
		}
	}

	@When("^Click to Submit button$")
	public void clickToSubmitButton() {
		driver.findElement(By.name("login")).click();
	}


	
	public void sleepInSecond(long timeoutInSecond) {
		try {
			Thread.sleep(timeoutInSecond * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


}
