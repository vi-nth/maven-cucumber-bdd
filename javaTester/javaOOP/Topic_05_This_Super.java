package javaOOP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Topic_05_This_Super extends BaseOOP{
	private WebDriver driver;
//	private long shortTimeout = 15;
	private long longTimeout = 45;
	
//	public Topic_05_This_Super() {
//		super("Chrome"); //luon luon goi constructor cua class cha
//		ystem.out.println("Constructor taij Class con");
//	}
	
	public void setImplicitWait() {
		long shortTimeout = 15;
		driver.manage().timeouts().implicitlyWait(super.longTimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(super.shortTimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(this.shortTimeout, TimeUnit.SECONDS);
	}
	
	public void clickToElement() {
		setImplicitWait(); // khong dung super se goi qua ham Class con hien tai
		super.setImplicitWait(); // Goi qua ham cua lop cha
	}
	
	private int firstName;
	
	private int secondName;
	
	public Topic_05_This_Super() { // contructor nay goi constructor kia, this phai dung dau tien
		this(10, 15);
		System.out.println("Demo");
	}
	
	public Topic_05_This_Super(int firstName, int secondName) {
		this.firstName = firstName;
		this.secondName = secondName;
	}
	
	public void sumNumber() {
		System.out.println(this.firstName+this.secondName);
	}
	
	public void showNumber() {
		this.sumNumber();
	}

	public static void main(String[] args) {
		Topic_05_This_Super topic = new Topic_05_This_Super();
		topic.sumNumber();

	}

}
