package javaBasic;

import java.util.Iterator;

import org.testng.annotations.Test;

public class Topic_12_String_Exercise {
	String courseName = "Automation 1Testing 21Advanced";

	// @Test
	public void TC_01() {
		char courseNameArr[] = courseName.toCharArray();
		int countUppercase = 0;
		int countLowercase = 0;
		int countNumber = 0;
		for (char character : courseNameArr) {
			if (character <= 'Z' && character >= 'A') {
				countUppercase++;
			}

			if (character <= 'z' && character >= 'a') {
				countLowercase++;
			}

			if (character <= '9' && character >= '0') {
				countNumber++;
			}
		}

		System.out.println("Sum of Uppercase=" + countUppercase);
		System.out.println("Sum of Lowercase=" + countLowercase);
		System.out.println("Sum of Number=" + countNumber);
	}

	// @Test
	public void TC_02() {
		char courseNameArr[] = courseName.toCharArray();
		int countA = 0;
		for (char c : courseNameArr) {
			if (c == 'A') {
				countA++;

			}
		}
		System.out.println(countA);
	}

	// @Test
	public void TC_03() {
		char courseNameArr[] = courseName.toCharArray();
		for (int i = courseNameArr.length - 1; i >= 0; i--) {
			System.out.println(courseNameArr[i]);
		}
	}

	@Test
	public void TC_04() {
		String schoolName = "Automation Testing 345 Tutorials Online 789";
		char schoolNameArray[] = schoolName.toCharArray();
		int countA = 0;
		int countNumber = 0;

		// Dem so ki tu la 'a' hoac 'A'
		for (char c : schoolNameArray) {
			if (c == 'a' || c == 'A') {
				countA++;

			}

		}
		System.out.println(countA);

		// Kiem tra chuoi co chua "Testing"
		System.out.println("Co chua=" + schoolName.contains("Testing"));

		// Kiem tra chuoi bat dau tu "Automation"
		System.out.println("Bat dau = " + schoolName.startsWith("Automation"));

		// Kiem tra chuoi ket thuc bang tu "Online"
		System.out.println("Ket thuc = " + schoolName.endsWith("Online"));

		// Lay vi tri cua tu "Tutorials" trong chuoi
		System.out.println("Lay vi tri = " + schoolName.indexOf("Tutorials"));

		// Thay the tu "Online" thanh "Offline"
		// String schoolName = "Automation Testing 345 Tutorials Online 789";
		schoolName = schoolName.replace("Online", "Offline");
		System.out.println(schoolName);
		// Dem so luong ki tu la So

		for (char c : schoolNameArray) {
			if (c <= '9' && c >= '0') {
				countNumber++;

			}
		}
		System.out.println(countNumber);

	}

}
