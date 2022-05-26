package javaOOP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class BaseOOP {
	public long shortTimeout = 15;
	protected long longTimeout = 45;
	private WebDriver driver;

	public void setImplicitWait() {

		driver.manage().timeouts().implicitlyWait(longTimeout, TimeUnit.SECONDS);
	}

	public BaseOOP() {
		System.out.println("Constructor taij Class cha");
	}

	public BaseOOP(String name) {
		System.out.println("Constructor taij Class cha:" + name);
	}

	public BaseOOP(int number) {
		System.out.println("Constructor taij Class cha:" + number);
	}

}
