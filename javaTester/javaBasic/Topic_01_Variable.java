package javaBasic;

import java.util.Scanner;

public class Topic_01_Variable {

	// Hàm khởi tạo không có kiểu trả về & trùng tên với tên class
	public Topic_01_Variable() {
		String studentName;
	}

	static int studentNumber;
	static boolean statusValue;
	static final String BROWSER_NAME = "Chrome"; // constant

	protected String studentName = "Automation FC";

	public static void main(String[] args) {
		int studentPrice = 5;
		System.out.println(studentPrice);
		System.out.println(studentNumber);
		System.out.println(statusValue);
		System.out.println(Topic_01_Variable.BROWSER_NAME);
		System.out.println(Topic_01_Variable.statusValue);
		System.out.println(Topic_01_Variable.studentNumber);

		Topic_01_Variable topic_01 = new Topic_01_Variable();
		Topic_01_Variable topic_02 = new Topic_01_Variable();
		Topic_01_Variable topic_03 = new Topic_01_Variable();

		System.out.println(topic_01.studentName);
		System.out.println(topic_02.studentName);
		System.out.println(topic_03.studentName);

		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
//		int age = scanner.nextInt();
//		float salary = scanner.nextFloat();
		System.out.println(name);
		System.out.println(name);
		System.out.print(name);
		System.out.print(name);
	}

	// Getter-->getCurrentUrl/ geTitle/ getText/ getAttribute/ getCssValue/ getSize/
	// get....
	public String getStudentName() {
		return this.studentName;

	}

	// Setter--> click/sendkey/clear/select/back/forward/refresh/get...
	public void setStudentName(String stdName) {
		this.studentName = stdName;
	}

}
