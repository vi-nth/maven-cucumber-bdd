package javaBasic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.nopCommerce.LoginPageObject;

public class Topic_08_For_ForEach {

	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	Scanner scanner = new Scanner(System.in);

	//@Test
	public void TC_01_For() {
//		for (int i = 0; i < 5; i++) {
//			System.out.println(i);
//
//		}
		// Vế 1: biến tạm dùng để tăng giá trị lên sau mỗi lần duyệt
		// Dùng để so sánh với tổng giá trị
		// Vế 2: So sánh với tổng
		// Vế 3: Tăng lên lên 1 đơn vị sau khi chạy vào thân vòng for

		// lần 1:
		// i = 0 đúng
		// 0<5
		// System.out.println(0);
		// i++: tăng lên 1 đơn vị (i=1)

		// lần 2:
		// i = 1
		// 1<5 đúng
		// System.out.println(1);
		// i++: tăng lên 1 đơn vị (i=2)

		// lần 5:
		// i = 4
		// 4<5
		// System.out.println(4);
		// i++: tăng lên 1 đơn vị (i=5)

		// lần 6:
		// i = 5 sai
		// 5<5
		// System.out.println(4);
//
//		for (int i = 0; i <= 5; i++) {
//			System.out.println(i);
//
//		}
		// lần 6:
		// i = 5
		// 5<=5
		// System.out.println(5);
		// i++: tăng lên 1 đơn vị (i=6)

		// lần 7:
		// i = 6 sai
		// 6<5

		// List <WebElement> links = driver.findElements(By.id(""));

		// Array
		String[] cityName = { "Ha Noi", "Ho Chi Minh", "Da Nang", "Can Tho" };

		// Array/ List/ Set/ Queue (index)
		// 0

//		for (int i = 0; i < cityName.length; i++) {
//			System.out.println(cityName[i]);
//			
//		}

		for (int i = 0; i < cityName.length; i++) {
			if (cityName[i].equals("Da Nang")) {
				// Action
				System.out.println("Do action");
				break;

			}

		}

		// Dùng để chạy qua hết tất cả các giá trị
		int y = 0;
		for (String city : cityName) {
			if (cityName[y].equals("Da Nang")) {
				System.out.println("Do action");
				System.out.println(city);
				break;

			}
			y++;

		}

	}
	
	@Test
		public void TC_02_ForEach() {
		// Array
		String[] cityName = { "Ha Noi", "Ho Chi Minh", "Da Nang", "Can Tho",  "Hải Phòng" };
		
		// Java Collection
		// Class: ArrayList/ LinkedList/ Vector/...
		// Interface: List/ Set/ Queue
		
		List<String> cityAddress = new ArrayList<String>();
		System.out.println(cityAddress.size());
		
		//Compile (Coding)
		cityAddress.add("Khanh Hoa");
		
		cityAddress.add("Lang Son");
		
		cityAddress.add("Sa Pa");
		
		// Runtime (Running)
		for (String city : cityName) {
			cityAddress.add(city);
			
		}
		System.out.println(cityAddress.size());
		
		
		for (String cityAdd : cityAddress) {
			System.out.println(cityAdd);
			
		}
		
		// Java Generic
	List<WebElement>links = driver.findElements(By.xpath("//a"));
	// Xử lý dữ liệu/ get Text/ value/ css/ attribute
	for (WebElement link : links) {
		// Chuyển page
		// Refresh DOM/ HTML
		// Không còn tồn tại
		// Fail--> StaleElementException
		
	}
	
		
	}
}
