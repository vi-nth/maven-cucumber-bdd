package javaOOP.overriding;

public class Student extends Person implements IWork{
	@Override
	public void eat() {
		System.out.println("Suat com 15000 VND");
	}

	@Override
	public void sleep() {
		System.out.println("Ngu 12 h");
	}

	@Override
	public void workingTime() {
		System.out.println("Hoc 3 h");
		
	} 
	
	
}
