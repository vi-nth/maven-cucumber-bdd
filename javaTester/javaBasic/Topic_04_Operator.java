package javaBasic;

import java.util.Iterator;

import org.testng.Assert;

public class Topic_04_Operator {

	public static void main(String[] args) {
		int number = 10;
//		number += 5;
////		number = number + 5;
//		System.out.println(number);
//
//		// 15/5 =3
//		System.out.println(number / 5);
//
//		// 15/6 =2 dư 3
//		System.out.println(number % 7);

		System.out.println(number++);
		// In number ra trước: 10
		// ++ = tăng number lên 1 =11

		System.out.println(++number);
		// ++ = tăng number lên 1 =12
		// In ra number = 12

		for (int i = 0; i <= 3; i++) {
			System.out.println(i);

		}

		Assert.assertTrue(5 < 6);
		String address = "Hồ Chí Minh";
//		if (address != "Hà Nội") {
//
//			System.out.println("Address is not the same");

//		if (address != "Hà Nội" && address != "Đà Nẵng") {
//
//			System.out.println("Address is not the same");
			
		if (!(address == "Hà Nội")) {
			System.out.println("Address is the same");
		}
			
		
		//  Tam nguyen = ? :
		boolean status = (address=="Hà Nội")?true:false;
		System.out.println(status);

		}

	}


