package javaBasic;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.nopCommerce.user.UserLoginPageObject;

public class Topic_06_Excercise {

	WebDriver driver;
	Scanner scanner = new Scanner(System.in);

	// @Test
	public void TC_01() {
		int number = scanner.nextInt();

//		int afterNumber = number % 2;
//		System.out.println(afterNumber);
//
//		boolean status = afterNumber == 0;
//		System.out.println(status);

		if (number % 2 == 0) {
			System.out.println("Số:" + number + "là số chẵn");

		} else {
			System.out.println("Số:" + number + "là số lẻ");
		}

	}

	// @Test
	public void TC_02() {
		int numberA = scanner.nextInt();
		int numberB = scanner.nextInt();

		if (numberA >= numberB) {
			System.out.println(numberA + "lớn hơn hoặc bằng" + numberB);

		} else {
			System.out.println(numberA + "nhỏ hơn" + numberB);
		}

	}

	// @Test
	public void TC_03_If_Else_If_Else() {
		String firstStudent = scanner.nextLine();
		String secondStudent = scanner.nextLine();

		// Reference: String
		// Kiểm tra value của biến
		// Kiểm tra vị trí của biến trong vùng nhớ
		if (firstStudent.equals(secondStudent)) {
			System.out.println("Hai sinh viên giống tên nhau");

		} else {
			System.out.println("Hai sinh viên khác tên nhau");

		}

		// == chỉ dùng cho kiểu dữ liệu nguyên thủy Primitive type--> == chỉ kiếm tra
		// value
		if (firstStudent == secondStudent) {// == chỉ dùng cho kiểu dữ liệu nguyên thủy Primitive type
			System.out.println("Hai sinh viên giống tên nhau");
		} else {
			System.out.println("Hai sinh viên khác tên nhau");

		}

	}

	// @Test
	public void TC_04() {

		int numberA = scanner.nextInt();
		int numberB = scanner.nextInt();
		int numberC = scanner.nextInt();

		if (numberA > numberB && numberA > numberC) {
			System.out.println(numberA + "là số lớn nhất");

		} else if (numberB > numberC) {
			System.out.println(numberB + "là số lớn nhất");

		} else {
			System.out.println(numberC + "là số lớn nhất");

		}

	}

	// @Test
	public void TC_05() {

		int numberA = scanner.nextInt();
		if (10 < numberA && numberA < 100) {
			System.out.println(numberA + "nằm trong 10 đến 100");

		} else {
			System.out.println(numberA + "nằm ngoài khoảng 10 và 100");

		}
	}

	// @Test
	public void TC_06() {
		float studentPoint = scanner.nextFloat();
		if (8.5 <= studentPoint && studentPoint <= 10) {
			System.out.println("Hệ số A");
		} else if (7.5 <= studentPoint && studentPoint <= 8.5) {
			System.out.println("Hệ số B");

		} else if (5 <= studentPoint && studentPoint <= 7.5) {
			System.out.println("Hệ số C");

		} else if (0 <= studentPoint && studentPoint <= 5) {
			System.out.println("Hệ số D");
		} else {
			System.out.println("Bạn vui lòng nhập điểm lại");

		}

	}

	@Test
	public void TC_07() {
		int month = scanner.nextInt();
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 110 || month == 12) {
			System.out.println("Tháng này có 31 ngày");

		} else if (month == 2) {
			System.out.println("Tháng này có 28 ngày");

		} else {
			System.out.println("Tháng này có 30 ngày");

		}

	}

}
