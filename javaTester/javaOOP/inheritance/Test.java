package javaOOP.inheritance;

import org.openqa.selenium.chrome.ChromeDriver;

import OOP.polymophism.Animal;
import OOP.polymophism.Bird;
import OOP.polymophism.Pig;

public class Test {

	public static void main(String[] args) {
//	ChromeDriver cDriver = null;
//	cDriver.getCurrentUrl();
//	cDriver.findElementById("");
	 
	
	Dog dog = new Dog();
	dog.setAge(-15);
	System.out.println(dog.getAge());
	
	dog.setAge(15);
	System.out.println(dog.getAge());
	
	dog.setAge(0);
	System.out.println(dog.getAge());
	
	
	
	Animal ani = new Animal();
	ani.eat();
	
	ani = new Pig();
	ani.eat();
	
	ani = new Bird();
	ani.eat();
	
;
	}

}
