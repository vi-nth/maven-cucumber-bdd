package javaOOP.overriding;

public class Employee extends Person implements IWork {
	@Override
	public void eat() {
		System.out.println("Suat com 30000 VND");
	}

	@Override
	public void sleep() {
		System.out.println("Ngu 7 h");
		
	}

	@Override
	public void workingTime() {
		System.out.println("Lam 8 h");
		
	}

}
