package javaException;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryCatchException {

	public static void main(String[] args)  {
//		int number = 10;
//		try {
//			number = number / 0;
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//
//		System.out.println(number);
//
//		String[] browserName = { "Chrome", "Firefox", "Safari" };
//
//		try {
//			browserName[0] = "Edge Chromium";
//			browserName[3] = "IE";
//		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//		}
//
//		for (String browser : browserName) {
//			System.out.println(browser);
//		}
//
//		try {
//			int array[] = new int[10];
//			array[11] = 30 / 0;
//		} catch (ArithmeticException e) {
//			System.out.println("Khong the chia cho 0");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Index vuot ngoai do dai cua mang");
//		}

		FileOutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream("C://automation.jpg");
			outputStream.write(65);
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//outputStream.close();
			try {
				if (outputStream!= null) {
				outputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void sleepInSecond(long timeout) throws InterruptedException {
		Thread.sleep(timeout * 1000);

	}

}
