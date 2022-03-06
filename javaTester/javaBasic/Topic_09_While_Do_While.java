package javaBasic;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

// Class
public class Topic_09_While_Do_While {
	WebDriver driver;
	Scanner scanner = new Scanner(System.in);

	// Funtion
	public static void main(String[] args) {

		Topic_09_While_Do_While topic = new Topic_09_While_Do_While();
		topic.TC_04_While();
		// Block code
		for (int i = 0; i < 5; i++) {
			System.out.println(i);

		}
		// i=5 không thỏa mãn điều kiện while
		int i = 0;
		while (i < 5) {
			System.out.println("While:" + i);
			i++;
		}
		// chạy trước rồi mới kiểm tra điều kiện
		do {
			System.out.println("Do-while:" + i);
			i++;
		} while (i < 5);
	}

	// @Test
	public void TC_01() {
		int number = scanner.nextInt();

		for (int i = number; i < 100; i++) {
			// Chia het cho 2
			if (i % 2 == 0) {
				System.out.println(i);

			}

		}

	}

	// @Test
	public void TC_02() {
		int number = scanner.nextInt();

		while (number < 100) {
			if (number % 2 == 0) {
				System.out.println(number);
				number++;
			}
		}
	}

	// @Test
	public void TC_03() {
		int number = scanner.nextInt();
		do {
			if (number % 2 == 0) {
				System.out.println(number);
				number++;
			}
		} while (number < 100);

	}

	// @Test
	public void TC_04_While() {
		int numberA = scanner.nextInt();

		int numberB = scanner.nextInt();

		// Các số từ A đến B
		while (numberA < numberB) {
			if (numberA % 3 == 0 && numberA % 5 == 0) {
				System.out.println(numberA);

			}
			numberA++;
		}
	}

	// @Test
	public void TC_05_While() {
		int numberA = scanner.nextInt();
		int i = 0;

		while (numberA > 0) {
			if (numberA % 2 != 0) {
				System.out.println(numberA);
				i += numberA; // i=i+numberA
			}
			numberA--;
		}
		System.out.println(i);
	}

	@Test
	public void TC_06_While() {
		int numberA = scanner.nextInt();
		int i = 1;
		while (numberA > 0) {
				i *= numberA; // i=i*numberA
			numberA--;
		}
		System.out.println(i);
	}

}
