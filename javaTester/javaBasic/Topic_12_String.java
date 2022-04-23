package javaBasic;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Topic_12_String {

	public static void main(String[] args) {
//		String s1 = "Cat";
//		String s2 = s1;
//		String s3 = new String("Cat");
//
//		System.out.println(s1 == s2);
//		System.out.println(s1 == s3);
//		System.out.println(s2 == s3);
//		System.out.println(s2.equals(s3));
//		System.setProperty("webdriver.gecko.driver", ".\\browserDrivers\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		String schoolName = "Automation Testing Advanced";
		String schoolAddress = "Ho Chi Minh City";
		String courseName = "AUTOMATION TESTING ADVANCED";

		schoolName.length();
		System.out.println("Do dai = " + schoolName.length());

		System.out.println("Lay ra 1 ky tu = " + schoolName.charAt(0));
		System.out.println("Lay ra 1 ky tu = " + schoolName.charAt(1));
		
		System.out.println("Noi chuoi = " + schoolName.concat(schoolAddress));
		System.out.println("Noi chuoi = " + schoolName + schoolAddress);
		
		// Kiem tra tuyet doi
		System.out.println("Kiem tra 2 chuoi bang nhau tuyet doi = " + schoolName.equals(schoolAddress));
		System.out.println("Kiem tra 2 chuoi bang nhau tuyet doi = " + schoolName.equals("Automation Testing Advanced"));
		
		// Multi browser
		System.out.println("Kiem tra 2 chuoi bang nhau tuong doi = " + schoolName.equalsIgnoreCase(courseName));
		
		// startWith/ endsWith/ contains
		System.out.println("Co bat dau bang 1 ki tu/ chuoi ki tu = " + schoolName.startsWith("A"));
		System.out.println("Co bat dau bang 1 ki tu/ chuoi ki tu = " + schoolName.startsWith("Automation"));
		System.out.println("Co bat dau bang 1 ki tu/ chuoi ki tu = " + schoolName.startsWith("T"));
		
		System.out.println("Co chua bang 1 ki tu/ chuoi ki tu = " + schoolName.contains("A"));
		System.out.println("Co chua bang 1 ki tu/ chuoi ki tu = " + schoolName.contains("Automation"));
		System.out.println("Co chua bang 1 ki tu/ chuoi ki tu = " + schoolName.contains("T"));
		
		System.out.println("Co ket thuc bang 1 ki tu/ chuoi ki tu = " + schoolName.endsWith("d"));
		System.out.println("Co ket thuc bang 1 ki tu/ chuoi ki tu = " + schoolName.endsWith("Advanced"));
		System.out.println("Co ket thuc bang 1 ki tu/ chuoi ki tu = " + schoolName.endsWith("T"));
		
		System.out.println("Vị tri của 1 ki tu/ chuoi ki tu trong chuoi= " + schoolName.indexOf("A"));
		System.out.println("Vị tri của 1 ki tu/ chuoi ki tu trong chuoi= " + schoolName.indexOf("utomation"));
		System.out.println("Vị tri của 1 ki tu/ chuoi ki tu trong chuoi= " + schoolName.indexOf("Testing"));
		
		// Tach chuoi ra tu 1 chuoi cho truoc
		System.out.println("Tach 1 kí tu/ chuoi ki tu trong chuoi= " + schoolName.substring(11, 15));
		System.out.println("Tach 1 kí tu/ chuoi ki tu trong chuoi= " + schoolName.substring(11));
		
		// Split: Tach chuoi thanh 1 mang dua vao ki tu/ chuoi ki tu
		String result = "Viewing 48 of 132 results";
		String results[]= result.split(" ");
		System.out.println(results[1]);
		
		// Replace
		String productPrice = "$100.00";
		productPrice = productPrice.replace("$", "");
		System.out.println(productPrice);
		
		float productPriceF = Float.parseFloat(productPrice);
		System.out.println(productPriceF);
		
		productPrice = String.valueOf(productPriceF);
		System.out.println(productPrice);
		
		
		String osName = System.getProperty("os.name");
		System.out.println(osName);
		// Windows 10 = windows 10
		// Handle multiple OS: MAC/ Windows (Actions - keys - Ctrl/ Command)
		
		if (osName.toLowerCase().contains("windows")) {
			Keys key = Keys.CONTROL;
		}else {
			Keys key = Keys.COMMAND;
		}
		
//		// Multiple browser
//		// firefox = FIREFOX (Enum)
//		String driverInstanceName = driver.toString();
//		System.out.println(driverInstanceName);
//		// FirefoxDriver: firefox on WINDOWS (0ce0bc5e-0988-4e20-b752-78101e68dff2)
//		// Close browser/ driver;
//		
//		if (driverInstanceName.contains("internetexplorer")) {
//			// Sleep them 5s sau moi su kien chuyen page
//			
//		}
		
		// Khoang trang
		String helloWorld = "  \n  \t   Hello World!   ";
		System.out.println(helloWorld);
		System.out.println(helloWorld.trim());
		
		// isEmpty/ isBlank
		helloWorld = "  ";
		System.out.println(helloWorld.isEmpty());
		System.out.println(helloWorld.isBlank());
		
		// Dynamic locator
		// Dai dien cho 1 chuoi: %s
		// %b %t %d
		String dynamicButtonXpath = "//button[@id='%s']";
		System.out.println("Click to Login button=" + String.format(dynamicButtonXpath, "login"));
		System.out.println("Click to Search button=" + String.format(dynamicButtonXpath, "search"));
		System.out.println("Click to Register button=" + String.format(dynamicButtonXpath, "register"));
	
	}

}
