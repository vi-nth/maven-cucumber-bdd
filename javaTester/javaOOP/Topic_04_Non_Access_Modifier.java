package javaOOP;

public class Topic_04_Non_Access_Modifier {
	static String browserName = "Chrome";

	String severName = "Testing";
	
	final String colorCar = "Red"; // khong duoc phep gan lai gia tri
	final static String REGISTER_BUTTON = "";

	public static void main(String[] args) {
		System.out.println(browserName);
		browserName = "Firefox";
		System.out.println(browserName);

		Topic_04_Non_Access_Modifier topic = new Topic_04_Non_Access_Modifier();
		System.out.println(topic.severName);

		topic.clickToElement(browserName); // truy cập thong qua object
		sendkeyToElement("Link");
		
		System.out.println(topic.colorCar);
		

	}

	public void clickToElement(String elementName) {
		System.out.println(elementName);
	}

	public static void sendkeyToElement(String elementName) {
		System.out.println(elementName);
	}
	
	public final void setCarName() { // final method khong cho phep ghi de
		
	}
}
