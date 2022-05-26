package javaOOP;

public class Topic_02_Variable_Property_Method {
	private String studentName = "Jenny Tran";

	int studentID = 1006;

	public static void main(String[] args) {
		String studentName = "Jenny Tran";
		if (studentName.startsWith("Jenny Tran")) { // Local variable - bien cuc bo - block code
			int number = 100;
		}

	}

	public void display() {
		String studentName = "Jenny Tran"; // Local variable - bien cuc bo - ham
	}
	
	public Topic_02_Variable_Property_Method() {  // Local variable - bien cuc bo - constructor
		String studentName = "Jenny Tran";
	}
}
