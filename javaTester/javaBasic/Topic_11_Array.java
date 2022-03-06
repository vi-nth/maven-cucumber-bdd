package javaBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic_11_Array {

	public static void main(String[] args) {
//		int number[] = { 2, 8, 45, 23, 56 };
//		int[] student = { 12, 7, 5, 61, 15 };
//		System.out.println(student[0]);
//		System.out.println(student[1]);
//		System.out.println(student[6]);

		// Cố định
		// Được define cố định bao nhiều phần tử khi mình viết code (compile)
		String studentName[] = { "Nam", "An", "Long" };
		studentName[0] = "Hoa";

		String stdNewName[] = studentName.clone();

		for (int i = 0; i < studentName.length; i++) {

			if (i == 2) { // if(studentName[].equals("Long")){

				System.out.println(studentName[i]);
			}

		}

		for (String std : studentName) {
			if (std.equals("Long")) {

				System.out.println("Click vào Long");
			}

		}

		// Động
		ArrayList<String> stdName = new ArrayList<String>();
		// Khi chạy code mới add vào (Runtime)
		for (String std : studentName) {
			stdName.add(std);
		}

		List<String> names = Arrays.asList("Tom", "Jerry", "Donald");
		for (String name : names) {
			stdName.add(name);

			// [Nam, An, Long]
			String std_Name = Arrays.toString(studentName);
			System.out.println(std_Name);

//		
//		int b[]=new int[5];
//		b[0]=10;
//		
		}
	}

}
