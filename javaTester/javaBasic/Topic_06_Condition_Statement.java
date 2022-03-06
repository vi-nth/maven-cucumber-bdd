package javaBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.LoginPageObject;

public class Topic_06_Condition_Statement {

	WebDriver driver;
	String projectPath = System.getProperty("user.dir");

	public void TC_01_If() {

	}

	@Test
	public void TC_02_If_Else() {
		// Có tới 2 điuè kiện: Nếu đúng thì vào if/ Sai thì vào Else
		// Nếu Driver start với browser như Chrome/ Firefox/ Edge/ Safari thì dùng hàm
		// Click
		// Thông thường (builtin) của Selenium WebElement
		// Nếu driver là IE thì dùng hàm Click của JavascriptExecutor

//		System.setProperty("WebDriver.ie.driver", projectPath+"\\browserDrivers\\IEDriverServer.exe");
//		driver =new InternetExplorerDriver();

		System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();

		if (driver.toString().contains("internet explorer")) {
			System.out.println("Click by Javascript Executor");
		} else {
			System.out.println("Click by Selenium WebElement");
		}

	}

	@Parameters("browser")
	@Test
	public void TC_04_If_Else_If_Else(String browserName) {
		// Nhiều điều kiện
		// Best practice: không nên if else quá nhiều
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", projectPath + "\\browserDrivers\\msedgedriver.exe");
			driver = new EdgeDriver();

		} else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("WebDriver.ie.driver", projectPath + "\\browserDrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		} else {// safari/ Opera/ Cococ/ ...
			throw new RuntimeException("Please input correct the browser name!");

		}
		System.out.println(browserName);
		System.out.println(driver.toString());
		driver.quit();

	}

	//@Test
	public void TC_04_If_Else_If_Else() {
		// Page Object
		// Dynamic Page

		String pageName = "Login";
		if (pageName.equals("Login")) {
			// LoginPage loginPage = new LoginPage();
			// return loginPage;

		} else if (pageName.equals("Register")) {
			// RegisterPage registerPage = new RegisterPage();
			// return registerPage;

		} else if (pageName.equals("New customer")) {
			// CustomerPage customerPage = new CustomerPage();
			// return customerPage;

		} else {
			// HomePage homePage = new HomePage();
			// return homePage;

		}

		// if-esle theo biểu thức tam nguyên

		int age = 20;
		String access = (age < 18) ? " You can not access" : "Welcome to our system!";

		if (age < 18) {
			access = "You can not access";

		} else {
			access = "Welcome to our system!";

		}
	}
	
	
//	public static void main(String[] args) {
//		boolean status = 5 < 3;
//		System.out.println(status);
//
//		// Hàm if sẽ nhận vào 1 điều kiện đúng
//		// Kiểm tra duy nhất 1 điều kiện
//		// Nếu điều kiện này đúng thì sẽ action xxx trong phần thân
//		if (status) {
//			// Đúng thì vào phần thân của if
//			System.out.println("Go to if");
//			// Sai thì bỏ qua
//
//		}
//
//		// Gán (assign)
//		int studentNumber = 10;
//		// == So sánh bằng
//		status = (studentNumber == 10);
//		System.out.println(status);
//
//		WebDriver driver = new FirefoxDriver();
//		// Element luôn luôn có trong DOM dù popup có hiển thị hay không
//		WebElement salePopup = driver.findElement(By.id(""));
//		if (salePopup.isDisplayed()) {
//
//		}
//
//		// Element không có trong DOM khi popup không hiển thị
//		List<WebElement> salePopups = driver.findElements(By.id(""));
//
//		// Check Element không hiển thị
//		if (salePopups.size() > 0 && salePopups.get(0).isDisplayed()) {
//
//		}
//
//		// Uncheck to Checkbox
//		WebElement languageCheckbox = driver.findElement(By.id(""));
//		if (languageCheckbox.isSelected()) {
//			languageCheckbox.click();
//
//		}
//
//		// Check to Checkbox
//		if (!languageCheckbox.isSelected()) {
//			languageCheckbox.click();
//
//		}

}
