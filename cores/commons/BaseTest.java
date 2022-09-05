package commons;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.joda.time.DateTime;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	private WebDriver driver;
	private String projectPath = System.getProperty("user.dir");
	protected final Log log;

	@BeforeSuite
	public void initBeforeSuite() {
		deleteAllureReport();
	}

	protected BaseTest() {
		log = LogFactory.getLog(getClass());
	}
	
	protected WebDriver getBrowserDriver(String browserName) {
		BrowserList browserList = BrowserList.valueOf(browserName.toUpperCase());
		if (browserList == BrowserList.FIREFOX) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();

			driver = new FirefoxDriver(options);

		} else if (browserList == BrowserList.HEAD_FIREFOX) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--headless");
			options.addArguments("window-size=1920x1080)");
			driver = new FirefoxDriver(options);

		} else if (browserList == BrowserList.CHROME) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			driver = new ChromeDriver(options);

		} else if (browserList == BrowserList.HEAD_CHROME) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			options.addArguments("window-size=1920x1080)");
			driver = new ChromeDriver(options);

		} else if (browserList == BrowserList.EDGE) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		} else if (browserList == BrowserList.SAFARI) {
			WebDriverManager.edgedriver().setup();
			driver = new SafariDriver();
			
		}else if (browserList == BrowserList.COCCOC) {
			// Cococ browser trừ đi 5-6 version
			WebDriverManager.chromedriver().driverVersion("99.0.4844.51").setup();
			ChromeOptions options = new ChromeOptions();
			if (GlobalConstants.OS_NAME.startsWith("Windows")) {
				options.setBinary("C:\\Program Files (x86)\\CocCoc\\Browser\\Application\\browser.exe");
			} else {
				options.setBinary("");
			}
			driver = new ChromeDriver(options);

		} else if (browserList == BrowserList.BRAVE) {
			// Brave browser version nào thì dùng browser vesion đó
			WebDriverManager.chromedriver().driverVersion("100.0.4896.60").setup();
			ChromeOptions options = new ChromeOptions();
			options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
			driver = new ChromeDriver(options);

		} else if (browserList == BrowserList.OPERA) {
			// Brave browser version nào thì dùng browser vesion đó
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		} else if (browserList == BrowserList.IE) {
			WebDriverManager.iedriver().arch32().setup();
			driver = new InternetExplorerDriver();
		} else {
			throw new RuntimeException("Browser name invalid");
		}
		driver.manage().timeouts().implicitlyWait(GlobalConstants.LONG_TIMEOUT, TimeUnit.SECONDS);
		driver.get(GlobalConstants.PORTAL_PAGE_URL);
		System.out.println("Driver ID="+driver.toString());
		// driver.get(getEnvironmentUrl(environmentName));
		return driver;
	}

	public WebDriver getDriverInstance() {
		return this.driver;
	}

	protected WebDriver getBrowserDriver(String browserName, String appUrl) {
		BrowserList browserList = BrowserList.valueOf(browserName.toUpperCase());
		if (browserList == BrowserList.FIREFOX) {
			WebDriverManager.firefoxdriver().setup();
			
			// Add extension to Firefox
//			FirefoxProfile profile = new FirefoxProfile();
//			File translate = new File(GlobalConstants.PROJECT_PATH + "\\browserExtentions\\google-translate.xpi");
//			profile.addExtension(translate);
//			profile.setAcceptUntrustedCertificates(true);
//			profile.setAssumeUntrustedCertificateIssuer(false);
			FirefoxOptions options = new FirefoxOptions();
//			options.setProfile(profile);
			driver = new FirefoxDriver(options);
			
		} else if (browserList == BrowserList.HEAD_FIREFOX) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--headless");
			options.addArguments("window-size=1920x1080)");
			driver = new FirefoxDriver(options);
			
		} else if (browserList == BrowserList.CHROME) {
			WebDriverManager.chromedriver().setup();
			
			// Add extension to Chrome
			File file = new File(GlobalConstants.PROJECT_PATH + "\\browserExtentions\\google-translate.crx");
			ChromeOptions options = new ChromeOptions();
			options.setAcceptInsecureCerts(true);
			options.addExtensions(file);
			driver = new ChromeDriver(options);
			
		} else if (browserList == BrowserList.HEAD_CHROME) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			options.addArguments("window-size=1920x1080)");
			driver = new ChromeDriver(options);
			
		} else if (browserList == BrowserList.EDGE) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browserList == BrowserList.COCCOC) {
			// Cococ browser trừ đi 5-6 version
			WebDriverManager.chromedriver().driverVersion("99.0.4844.51").setup();
			ChromeOptions options = new ChromeOptions();
			if (GlobalConstants.OS_NAME.startsWith("Windows")) {
				options.setBinary("C:\\Program Files (x86)\\CocCoc\\Browser\\Application\\browser.exe");
			} else {
				options.setBinary("");
			}
			driver = new ChromeDriver(options);
			
		} else if (browserList == BrowserList.BRAVE) {
			// Brave browser version nào thì dùng browser vesion đó
			WebDriverManager.chromedriver().driverVersion("100.0.4896.60").setup();
			ChromeOptions options = new ChromeOptions();
			options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
			driver = new ChromeDriver(options);
			
		} else if (browserList == BrowserList.OPERA) {
			// Brave browser version nào thì dùng browser vesion đó
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		} else if (browserList == BrowserList.IE) {
			WebDriverManager.iedriver().arch32().setup();
			
			
			driver = new InternetExplorerDriver();
		} else {
			throw new RuntimeException("Browser name invalid");
		}
		driver.manage().timeouts().implicitlyWait(GlobalConstants.LONG_TIMEOUT, TimeUnit.SECONDS);
		// driver.get(GlobalConstants.JQUREY_PAGE_URL);
		// driver.get(getEnvironmentUrl(appUrl));
		driver.get(appUrl);
		return driver;
	}
	
	protected WebDriver getBrowserDriverSaucelab(String browserName, String appUrl, String osName) {
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability("platforme", osName);
		capability.setCapability("browserName", browserName);
		capability.setCapability("browserVersion", "latest");
		capability.setCapability("name", "Run on" + osName + "|" +browserName);
		
		Map<String, Object> sauceOptions = new HashMap<>();
		if (osName.contains("Windows")) {
			sauceOptions.put("screenResolution", "1920x1080");
		} else {
			sauceOptions.put("screenResolution", "1920x1440");
		}
		
		capability.setCapability("sauce:options", sauceOptions);
		
		try {
			driver = new RemoteWebDriver(new URL(GlobalConstants.SAUCELAB_URL), capability);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appUrl);
		return driver;
		
	}
	
	protected WebDriver getBrowserDriverCrossBrowser(String browserName, String appUrl, String osName) {
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability("browserName", browserName);
		capability.setCapability("browserVersion", "latest");
		capability.setCapability("platforme", osName);
		capability.setCapability("record_video", "true");
	
		
		if (osName.contains("Windows")) {
			capability.setCapability("screenResolution", "1920x1080");
		} else {
			capability.setCapability("screenResolution", "2560x1600");
		}
	
		capability.setCapability("name", "Run on" + osName + "|" +browserName);

		
		try {
			driver = new RemoteWebDriver(new URL(GlobalConstants.CROSS_URL), capability);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appUrl);
		return driver;
		
	}
	
	protected WebDriver getBrowserDriverBrowserstack(String browserName, String appUrl, String osName, String osVersion) {
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability("os", osName);
		capability.setCapability("os_version", osVersion);
		capability.setCapability("browser", browserName);
		capability.setCapability("browser_version", "latest");
		capability.setCapability("browserstack.debug", "true");
		capability.setCapability("project", "JQuery");
		capability.setCapability("resolution", "1920x1080");
		capability.setCapability("name", "Run on" + osName + "|" + osVersion + "|" +browserName);
		
		try {
			driver = new RemoteWebDriver(new URL(GlobalConstants.BROWSER_STACK_URL), capability);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appUrl);
		return driver;
		
	}
	
	protected WebDriver getBrowserDriverLamda(String browserName, String appUrl, String osName, String osVersion) {
		 DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("browserName", browserName);
	        capabilities.setCapability("version", "latest");
	        capabilities.setCapability("platform", osName); 
	        capabilities.setCapability("video", true); 
	        capabilities.setCapability("visual", true); 
	        capabilities.setCapability("build", "LambdaTestSampleApp");
	        capabilities.setCapability("name", "LambdaTestJavaSample");
	        
	        if (osName.contains("Windows")) {
	        	capabilities.setCapability("screenResolution", "1920x1080");
			} else {
				capabilities.setCapability("screenResolution", "2560x1600");
			}
			
	        capabilities.setCapability("name", "Run on" + osName + "|" +browserName);
	        
	        try {
	            driver = new RemoteWebDriver(new URL(GlobalConstants.LAMDA_URL), capabilities);
	        } catch (MalformedURLException e) {
	            System.out.println("Invalid Lamda URL");
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appUrl);
		return driver;
		
	}

	protected String getEnvironmentUrl(String severName) {
		String envUrl = null;
		EnvironmentList environment = EnvironmentList.valueOf(severName.toUpperCase());
		if (environment == EnvironmentList.DEV) {
			envUrl = "https://demo.guru99.com/V1/";
		} else if (environment == EnvironmentList.TESTING) {
			envUrl = "https://demo.guru99.com/V2/";
		} else if (environment == EnvironmentList.STAGING) {
			envUrl = "https://demo.guru99.com/V3/";
		} else if (environment == EnvironmentList.PRODUCTION) {
			envUrl = "https://demo.guru99.com/V4/";
		}
		System.out.println(envUrl);
		return envUrl;

	}

	public int generateFakeNumber() {
		Random random = new Random();
		return random.nextInt(9999);
	}

	public void sleepInSecond(long timeoutInSecond) {
		try {
			Thread.sleep(timeoutInSecond * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	protected boolean verifyTrue(boolean condition) {
		boolean pass = true;
		try {
			Assert.assertTrue(condition);
			log.info(" -------------------------- PASSED -------------------------- ");

		} catch (Throwable e) {
			log.info(" -------------------------- FAILED -------------------------- ");
			pass = false;
			VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}

	protected boolean verifyFalse(boolean condition) {
		boolean pass = true;
		try {
			Assert.assertFalse(condition);
			log.info(" -------------------------- PASSED -------------------------- ");

		} catch (Throwable e) {
			log.info(" -------------------------- FAILED -------------------------- ");
			pass = false;
			VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}

	protected boolean verifyEquals(Object actual, Object expected) {
		boolean pass = true;
		try {
			Assert.assertEquals(actual, expected);
			log.info(" -------------------------- PASSED -------------------------- ");
		} catch (Throwable e) {
			log.info(" -------------------------- FAILED -------------------------- ");
			pass = false;
			VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}

	public void deleteAllureReport() {
		try {
			String pathFolderDownload = GlobalConstants.PROJECT_PATH + "/allure-json";
			File file = new File(pathFolderDownload);
			File[] listOfFiles = file.listFiles();
			for (int i = 0; i < listOfFiles.length; i++) {
				if (listOfFiles[i].isFile()) {
					new File(listOfFiles[i].toString()).delete();
				}
			}
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}

	}

	protected void closeBrowserAndDriver() {
		String cmd = "";
		try {
			String osName = System.getProperty("os.name").toLowerCase();
			log.info("OS name = " + osName);

			String driverInstanceName = driver.toString().toLowerCase();
			log.info("Driver instance name = " + driverInstanceName);

			if (driverInstanceName.contains("chrome")) {
				if (osName.contains("window")) {
					cmd = "taskkill /F /FI \"IMAGENAME eq chromedriver*\"";
				} else {
					cmd = "pkill chromedriver";
				}
			} else if (driverInstanceName.contains("internetexplorer")) {
				if (osName.contains("window")) {
					cmd = "taskkill /F /FI \"IMAGENAME eq IEDriverServer*\"";
				}
			} else if (driverInstanceName.contains("firefox")) {
				if (osName.contains("windows")) {
					cmd = "taskkill /F /FI \"IMAGENAME eq geckodriver*\"";
				} else {
					cmd = "pkill geckodriver";
				}
			} else if (driverInstanceName.contains("edge")) {
				if (osName.contains("window")) {
					cmd = "taskkill /F /FI \"IMAGENAME eq msedgedriver*\"";
				} else {
					cmd = "pkill msedgedriver";
				}
			} else if (driverInstanceName.contains("opera")) {
				if (osName.contains("window")) {
					cmd = "taskkill /F /FI \"IMAGENAME eq operadriver*\"";
				} else {
					cmd = "pkill operadriver";
				}
			} else if (driverInstanceName.contains("safari")) {
				if (osName.contains("mac")) {
					cmd = "pkill safaridriver";
				}
			}

			if (driver != null) {
				driver.manage().deleteAllCookies();
				driver.quit();
			}
		} catch (Exception e) {
			log.info(e.getMessage());
		} finally {
			try {
				Process process = Runtime.getRuntime().exec(cmd);
				process.waitFor();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	protected String getCurrentDay() {
		DateTime nowUTC = new DateTime();
		int day = nowUTC.getDayOfMonth();
		if (day < 10) {
			String dayValue = "0" + day;
			return dayValue;
		}
		return String.valueOf(day);
	}

	protected String getCurrentMonth() {
		DateTime now = new DateTime();
		int month = now.getMonthOfYear();
		if (month < 10) {
			String monthValue = "0" + month;
			return monthValue;
		}
		return String.valueOf(month);
	}

	protected String getCurrentYear() {
		DateTime now = new DateTime();
		return String.valueOf(now.getYear());
	}

	protected String getToday() {
		return getCurrentDay() + "/" + getCurrentMonth() + "/" + getCurrentYear();

	}
}