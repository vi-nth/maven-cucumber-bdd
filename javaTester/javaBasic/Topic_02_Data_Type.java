package javaBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Topic_02_Data_Type {
	// Global variable
	static int number;
//	String address= "Ho Chi Minh";

	// Primitive type/ value type: kiểu dữ liệu nguyên thủy
	byte bNumber = 5;

	short sNumber = 15000;

	int iNumber = 6500;

	long lNumber = 65000;

	float fNumber = 15.89f;

	double dNumber = 15.89d;

	char cCHar = '1';

	boolean bStatus = false;

	// Reference type: Tham chiếu
	
	// String
	String address = "Ho Chi Minh";

	// Array: chứa được nhiều dữ liệu cùng 1 kiểu dữ liệu
	String[] studentAddress = { address, "Ha Noi", "Da Nang" };
	Integer[] studentNumber = { 15, 20, 30 };


	// Class
	Topic_02_Data_Type topic;
	
	// Interface
	WebDriver driver;
	
	// Object--> có thể convert qua 1 kiểu dữ liệu khác
	Object aObject;
	

	// Collection
	// List/ Set/ Queue/ Map
	List<WebElement> homepageLinks = driver.findElements(By.tagName("a"));
	Set<String> allWindows =driver.getWindowHandles();
	List<String> productName = new ArrayList<String>();
	
	
	public void clickToElement() {
		address.trim();
		studentNumber.clone();
		driver.getCurrentUrl();
		aObject.toString();
		homepageLinks.size();
		allWindows.clear();
		
	}

	public static void main(String[] args) {
		// Local variable--> biến local phải khởi tạo dữ liệu
		int studentNuber = 0;
		System.out.println(number);
		System.out.println(studentNuber);

		Topic_02_Data_Type topic = new Topic_02_Data_Type();
		System.out.println(topic.address);
	}

}
